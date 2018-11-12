(ns portfolio-cljs.project-views)

(def ipsum
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(def project-names
    {:phillytron "Phillytron"
     :mgm "Magical Girl Mecha"
     :talktolight "Talk to light"
     :buttons "Push My Buttons"
     :voyage "Voyage"
     :tide "Tide"
     :ha "Hertzian Aegis"})

(defn body [state]
    [:div
        [:section.section
            [:h3.title ((state :project) project-names)]
            [:h4.subtitle "Project Subtitle"]
            [:p ipsum]]])
