(ns portfolio-cljs.project-views)

(def ipsum
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(defn rand-hero-src []
    (str "https://picsum.photos/" 
        (->> (js/Math.random))
            (* 30)
            (js/Math.floor)
            (- (* 0.66 (.-width js/screen)))
        "/?random"))

(def projects 
    {:phillytron
        {:title "Phillytron"
         :subtitle "Showcasing Indie Game Development in Philadelphia"
         :description ipsum}
     :mgm 
        {:title "Magical Girl Mecha"
         :subtitle "A cooperative, anime-inspired space adventure"
         :description ipsum}
        
     :talktolight
        {:title "Talk to Light"
         :subtitle "    "
         :description ipsum}
        
     :buttons
        {:title "Push My Buttons"
         :subtitle "A competitive take on whack-a-mole"
         :description ipsum}
        
     :voyage
        {:title "Voyage"
         :subtitle "A Newtonian Physics-based Puzzle Game"
         :description ipsum}
        
     :tide
        {:title "Tide"
         :subtitle "A Sybiotic Adventure"
         :description ipsum}
        
     :ha
        {:title "Hertzian Aegis"
         :subtitle "A love letter to Design Noir"
         :description ipsum}})
        


(defn body [state]
    (let [project ((state :project) projects)]
        [:div
            [:section.section
                [:h1.title (project :title)]
                [:h2.subtitle (project :subtitle)]]
            [:section.hero
                [:div.hero-body
                    [:img {:src (rand-hero-src)}]]]
            [:section.section
                [:p ipsum]]]))
