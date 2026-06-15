(ns flowers.core
  (:require [flowers.db :as db]
            [flowers.maps :as maps]))

(defn filter-flowers [user]
  (let [lat (:lat user)
        lng (:lng user)

        species (when (:species user) (keyword (:species user)))
        color (when (:color user) (keyword (:color user)))
        occasion (when (:occasion user) (keyword (:occasion user)))
        season (when (:season user) (keyword (:season user)))
        indoor (when (:indoor-safe user) (keyword (:indoor-safe user)))
        allergy (when (:allergy-friendly user) (keyword (:allergy-friendly user)))
        location (:location user)]

    (loop [items db/flowers
           results []]

      (if (empty? items)
        (take 5 (sort-by :distance results))

        (let [flower (first items)
              rest-items (rest items)]

          (if (and
                (or (nil? location) (= (:location flower) location))
                (or (nil? species) (contains? (:species flower) species))
                (or (nil? color) (contains? (:color flower) color))
                (or (nil? occasion) (= (:occasion flower) occasion))
                (or (nil? season) (= (:season flower) season))
                (or (nil? indoor) (= (:indoor-safe flower) indoor))
                (or (nil? allergy) (= (:allergy-friendly flower) allergy)))

            (recur rest-items
                   (conj results
                         (assoc flower
                           :distance (maps/distance-km
                                       lat lng
                                       (:lat flower)
                                       (:lng flower)))))

            (recur rest-items results)))))))