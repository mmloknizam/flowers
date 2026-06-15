(ns flowers.routes
  (:require [flowers.core :as core]
            [flowers.web :as web]
            [compojure.core :refer [GET POST defroutes]]
            [compojure.route :as route]
            [ring.util.response :refer [file-response]]))

(defroutes app-routes
           (GET "/" []
             (file-response "resources/public/index.html"))

           (POST "/search" {params :params}
             (let [user {:lat 44.8186
                         :lng 20.46
                         :species (keyword (params "species"))
                         :color (keyword (params "color"))
                         :occasion (keyword (params "occasion"))
                         :season (keyword (params "season"))
                         :indoor-safe (case (params "indoor-safe")
                                        "yes" :yes
                                        "no"  :no
                                        nil)
                         :allergy-friendly (case (params "allergy-friendly")
                                             "yes" :yes
                                             "no"  :no
                                             nil)
                         :location (params "location")}
                   flowers (core/filter-flowers user)]
               (web/results-page flowers)))

           (route/resources "/")
           (route/not-found "404"))
