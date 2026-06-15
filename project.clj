(defproject clojure-flowers "0.1.0-SNAPSHOT"
            :description "Flowers recommendation app"

            :dependencies [[org.clojure/clojure "1.11.1"]
                           [clj-http "3.12.3"]
                           [cheshire "5.11.0"]
                           [ring/ring-defaults "0.3.4"]
                           [hiccup "1.0.5"]
                           [com.github.seancorfield/next.jdbc "1.3.955"]
                           [compojure "1.7.0"]
                           [ring/ring-devel "1.10.0"]
                           [ring/ring-core "1.10.0"]
                           [ring/ring-jetty-adapter "1.10.0"]]

            :main flowers.server
            :target-path "target/%s"

            :profiles {:uberjar {:aot :all}})
