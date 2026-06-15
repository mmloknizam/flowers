(ns flowers.db)

(def flowers
 [{:id 1
   :name "Rose Elegance"
   :species #{:rose}
   :color #{:red :white}
   :occasion :gift
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.8214 :lng 20.4687
   :location "Stari Grad"}

  {:id 2
   :name "Lavender Dream"
   :species #{:lavender}
   :color #{:purple}
   :occasion :relax
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :summer
   :lat 44.8205 :lng 20.457
   :location "Stari Grad"}

  {:id 3
   :name "Tulip Harmony"
   :species #{:tulip}
   :color #{:yellow :red}
   :occasion :decoration
   :delivery :no
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.818 :lng 20.4575
   :location "Vračar"}

  {:id 4
   :name "Orchid Luxury"
   :species #{:orchid}
   :color #{:white :pink}
   :occasion :luxury-gift
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :no
   :season :all
   :lat 44.81 :lng 20.475
   :location "Novi Beograd"}

  {:id 5
   :name "Sunflower Field"
   :species #{:sunflower}
   :color #{:yellow}
   :occasion :decoration
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :summer
   :lat 44.812 :lng 20.471
   :location "Zemun"}

  {:id 6
   :name "Peony Bliss"
   :species #{:peony}
   :color #{:pink :white}
   :occasion :gift
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.815 :lng 20.463
   :location "Stari Grad"}

  {:id 7
   :name "Daisy Fresh"
   :species #{:daisy}
   :color #{:white :yellow}
   :occasion :decoration
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.819 :lng 20.460
   :location "Vračar"}

  {:id 8
   :name "Orchid Noir"
   :species #{:orchid}
   :color #{:purple :black}
   :occasion :luxury-gift
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :no
   :season :all
   :lat 44.813 :lng 20.472
   :location "Novi Beograd"}

  {:id 9
   :name "Wild Meadow Mix"
   :species #{:wildflowers}
   :color #{:mixed}
   :occasion :decoration
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :summer
   :lat 44.820 :lng 20.455
   :location "Stari Grad"}

  {:id 10
   :name "Lily Grace"
   :species #{:lily}
   :color #{:white}
   :occasion :gift
   :delivery :yes
   :indoor-safe :no
   :allergy-friendly :no
   :season :summer
   :lat 44.817 :lng 20.469
   :location "Zvezdara"}

  {:id 11
   :name "Cherry Blossom Zen"
   :species #{:sakura}
   :color #{:pink}
   :occasion :relax
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.821 :lng 20.461
   :location "Stari Grad"}

  {:id 12
   :name "Autumn Bouquet"
   :species #{:chrysanthemum}
   :color #{:orange :yellow}
   :occasion :decoration
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :autumn
   :lat 44.816 :lng 20.474
   :location "Vračar"}

  {:id 13
   :name "Minimal White Set"
   :species #{:rose :lily}
   :color #{:white}
   :occasion :wedding
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :all
   :lat 44.818 :lng 20.468
   :location "Stari Grad"}

  {:id 14
   :name "Romantic Mix"
   :species #{:rose :peony}
   :color #{:red :pink}
   :occasion :gift
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :spring
   :lat 44.814 :lng 20.470
   :location "Novi Beograd"}

  {:id 15
   :name "Eco Wild Set"
   :species #{:wildflowers}
   :color #{:mixed}
   :occasion :eco
   :delivery :yes
   :indoor-safe :yes
   :allergy-friendly :yes
   :season :summer
   :lat 44.822 :lng 20.465
   :location "Zemun"}])