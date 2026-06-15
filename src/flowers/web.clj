(ns flowers.web
  (:require [hiccup.page :refer [html5]]))

(defn results-page [flowers]
  (html5
    [:head
     [:title "Preporučeno cveće"]
     [:link {:rel "stylesheet"
             :href (str "/style.css?v=" (System/currentTimeMillis))}]]
    [:body
     [:h1 "Preporučeno cveće"]

     (if (empty? flowers)
       [:p "Nema dostupnih cveća za vaše kriterijume."]

       [:ul
        (for [f flowers]
          [:li
           [:strong (:name f)] " - " (:location f)
           [:br]
           "Sezona: " (:season f)
           [:br]
           "Prilika: " (:occasion f)
           [:br]
           "Dostava: " (name (:delivery f))
           [:br]
           [:a {:href (str "https://www.google.com/maps/search/?api=1&query="
                           (:lat f) "," (:lng f))
                :target "_blank"}
            "Pogledaj lokaciju"]])])]))
