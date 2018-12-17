(ns portfolio-cljs.project-views)

(def ipsum
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(def phillytron-description
    "This project was done in collaboration with Philly Game Mechanics, a non-profit organization in Philadelphia that leads and organizes indie game development events like game jams, talks, and workshops. The Phillytron is an arcade cabinet that showcases published games from local studios in Philly as well as past game jam winners.

    The Phillytron has been featured at MAGFest and is scheduled to show at other various gaming festivals, conventions, and expos in the Northeast US.

    Role: HLSL Shader programming for intro animation and menu background

    In collaboration with: Steve Petit (Technical Lead), Marina Romero (Cabinet Art), Jake O'Bien (Producer)")

(defn rand-hero-src []
    (str "https://picsum.photos/" 
        (->> (js/Math.random)
            (* 30)
            (js/Math.floor)
            (- (* 0.66 (.-width js/screen))))
        "/?random"))

(defn other-media [path-list]
    ; TODO
    ; takes a list of paths and returns an arrangement of images 
    ([:div ""]))

(def projects 
    {:phillytron
        {:title "Phillytron"
         :subtitle "Showcasing Indie Game Development in Philadelphia"
         :description ipsum
         :supplement-media ["path1" "path2"]}
     :mgm 
        {:title "Magical Girl Mecha"
         :subtitle "A cooperative, anime-inspired space adventure"
         :description ipsum
         :supplement-media ["path1" "path2"]}
        
     :talktolight
        {:title "Talk to Light"
         :subtitle "    "
         :description ipsum
         :supplement-media ["path1" "path2"]}
        
     :buttons
        {:title "Push My Buttons"
         :subtitle "A competitive take on whack-a-mole"
         :description ipsum
         :supplement-media ["path1" "path2"]}
        
     :voyage
        {:title "Voyage"
         :subtitle "A Newtonian Physics-based Puzzle Game"
         :description ipsum
         :supplement-media ["path1" "path2"]}
        
     :tide
        {:title "Tide"
         :subtitle "A Sybiotic Adventure"
         :description ipsum
         :supplement-media ["path1" "path2"]}
        
     :ha
        {:title "Hertzian Aegis"
         :subtitle "A love letter to Design Noir"
         :description ipsum
         :supplement-media ["path1" "path2"]}})
        


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
            ; [:section.section
            ;     (other-media (project :supplement-media))]]))
