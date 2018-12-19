(ns portfolio-cljs.project-views)

(def ipsum
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(defn rand-hero-src []
    (str "https://picsum.photos/" 
        (->> (js/Math.random)
            (* 30)
            (js/Math.floor)
            (- (* 0.66 (.-width js/screen))))
        "/?random"))

(defn rand-supplement-image []
  (str "https://picsum.photos/" 
        (->> (js/Math.random)
            (* 30)
            (js/Math.floor)
            (- (* 0.2 (.-width js/screen))))
        "/?random"))

(defn other-media [path-list]
    ; TODO
    ; takes a list of paths and returns an arrangement of images 
    ([:div ""]))

(defn other-media-placeholder [path-range]
    (for [path path-range]
        [:img {:src (rand-supplement-image)}]))

(def projects 
    {:phillytron
        {:title "Phillytron"
         :subtitle "Showcasing Indie Game Development in Philadelphia"
         :description 
            [:div
                [:p "This project was done in collaboration with Philly Game Mechanics, a non-profit organization in Philadelphia that leads and organizes indie game development events like game jams, talks, and workshops. The Phillytron is an arcade cabinet that showcases published games from local studios in Philly as well as past game jam winners."]
                [:p "The Phillytron has been featured at MAGFest and is scheduled to show at other various gaming festivals, conventions, and expos in the Northeast US."]
                [:p "Role: HLSL Shader programming for intro animation and menu background"]
                [:p "In collaboration with: Steve Petit (Technical Lead), Marina Romero (Cabinet Art), Jake O'Bien (Producer)"]]
         :supplement-media ["path1" "path2"]}
     :mgm 
        {:title "Magical Girl Mecha"
         :subtitle "A cooperative, anime-inspired space adventure"
         :description 
            [:div
                [:p "This project was an assignment for New Arcade, a class focused on making unconventional controllers for video games. For this project, we tried to make a game centered around flying a magical robot with a friend through custom motion controls."]
                [:p "Role: OpenCV programming and OSC protocol"]
                [:p "In collaboration with: Sydney Adams (Design Lead), Taeyeon Kim (Art Assets), and Seungho Jung (Unity Programming)"]]
         :supplement-media ["path1" "path2"]}
        
     :talktolight
        {:title "Talk to Light"
         :subtitle "    "
         :description
            [:div
                [:p "This project was done while I was interning at Red Paper Heart. We teamed up with some friends at Google to design an open source art installation that would showcase the potential of the technology from Red Paper Heart’s unique point of view and inspire developers and makers everywhere to build things using Custom Device Actions."]
                [:p "Role: Code Intern"]
                [:p "In collaboration with: Zander Brimijoin (Creative Director), Daniel Scheibel (Technology Director), Lisa Walters (Senior Producer), Pedro Piccinini (Art Director), Greg Schomburg (Creative Coder), Shuvashis Das (Creative Coder), Adrià Navarro López (Creative Coder), Ji Young Chun (Code Intern)"]]
         :supplement-media ["path1" "path2"]}
        
     :buttons
        {:title "Push My Buttons"
         :subtitle "A competitive take on whack-a-mole"
         :description 
            [:div
                [:p "This project was an assignment for New Arcade, a class focused on making unconventional controllers for video games. For this project, our primary constraint was to not use a screen."]
                [:p "Role: Arduino Programming and Game Design"]
                [:p "In collaboration with: Kabeer (Soldering and Game Design) and Tushal (Fabrication and Game Design)"]]
         :supplement-media ["path1" "path2"]}
        
     :voyage
        {:title "Voyage"
         :subtitle "A Newtonian Physics-based Puzzle Game"
         :description 
            [:div
                [:p "This game uses the Newtownian model of gravitation and physics as a puzzle mechanic. The objective is to steer your ship over to the red square while being pulled around by the gravitational forces of nearby planetoids."]
                [:p "Final Project for Algorithmic Simulations"]
                [:p "Made with openframeworks"]]
         :supplement-media ["path1" "path2"]}
        
     :tide
        {:title "Tide"
         :subtitle "A Sybiotic Adventure"
         :description 
            [:div
                [:p "For my senior capstone, I focused on on the qualia concerning electro-magnetic fields. Although we come in contact with EMFs several times a day, we don't give them much thought because we cannot perceive them."]
                [:p "Player 1: W,A,S,D"]
                [:p "Player 2: UP, DOWN, LEFT, RIGHT"]]
         :supplement-media ["path1" "path2"]}
        
     :ha
        {:title "Hertzian Aegis"
         :subtitle "A love letter to Design Noir"
         :description 
            [:div
                [:p "For my senior capstone, I focused on on the qualia concerning electro-magnetic fields. Although we come in contact with EMFs several times a day, we don't give them much thought because we cannot perceive them."]
                [:p "In my senior fall semester, I made a prototype wearable that used a jumper wire as a sensor. The prototype itself only proved to be a capacitive sensor, but it helped me get used to using the Lilypad microcontroller as the conduit of my design. In the spring, I reverse-engineered an existing EMF sensor to have a qualitative output and mapped that output onto a coat."]
                [:p "By letting the user visualize electro-magnetic radiation, this wearable technology helps to better understand the hidden nature of electronic objects."]]
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
                (project :description)]
            [:section.section
                (other-media-placeholder (project :supplement-media))]]))
