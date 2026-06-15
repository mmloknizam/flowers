(ns flowers.core_test
  (:require [clojure.test :refer :all]
            [flowers.core :refer [filter-flowers]]))

(deftest test-filter-by-location
         (let [user {:lat 44.8214
                     :lng 20.4687
                     :location "Stari Grad"}]
              (is (= 5 (count (filter-flowers user))))))

(deftest test-filter-by-occasion-gift
         (let [user {:lat 44.8214
                     :lng 20.4687
                     :occasion :gift}]
              (is (every? #(= :gift (:occasion %))
                          (filter-flowers user)))))