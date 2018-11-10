(ns portfolio-cljs.resume)

(def ipsum 
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(def short-ipsum (str (subs ipsum 0 280) "...\n\n\n"))

(defn placeholder []
    [:section.section
        [:div.tile.is-ancestor
            [:div.tile.is-vertical.is-8
                [:div.tile
                    [:div.tile.is-parent.is-vertical
                        [:article.tile.is-child.notification.is-primary
                            [:p.title "Vertical..."]
                            [:p.subtitle "Top tile"]
                            [:p.content ipsum]]
                        [:article.tile.is-child.notification.is-warning
                            [:p.title "...tiles"]
                            [:p.subtitle "Bottom tile"]
                            [:p.content ipsum]]]
                    [:div.tile.is-parent
                        [:article.tile.is-child.notification.is-info
                            [:p.title "Middle tile"]
                            [:p.subtitle "With an image"]
                            [:p.content ipsum]]]]
                [:div.tile.is-parent
                    [:article.tile.is-child.notification.is-danger
                        [:p.title "Wide tile"]
                        [:p.subtitle "Aligned with the right tile"]
                        [:div.content
                            [:p.content ipsum]]]]]
            [:div.tile.is-parent
                [:article.tile.is-child.notification.is-success
                    [:div.content
                        [:p.title "Tall tile"]
                        [:p.subtitle "With even more content"]
                        [:div.content
                            [:p.content ipsum]]]]]]])

(defn body []
    [:section.section
        [:div.tile.is-ancestor
            [:div.tile.is-parent
                [:div.tile.is-child.box
                    [:p.title "Professional Experience"]
                    [:div.tile.is-child
                        [:p.subtitle "Local Projects, Creative Technologist, Summer 2018 - Present"]
                        [:p short-ipsum]]
                    [:div.tile.is-child
                        [:p.subtitle "Local Projects, Creative Technologist, Summer 2018 - Present"]
                        [:p short-ipsum]]
                    [:div.tile.is-child
                        [:p.subtitle "Local Projects, Creative Technologist, Summer 2018 - Present"]
                        [:p short-ipsum]]
                    [:div.tile.is-child
                        [:p.subtitle "Local Projects, Creative Technologist, Summer 2018 - Present"]
                        [:p short-ipsum]]]]
            [:div.tile.is-parent
                [:article.tile.is-child.box
                    [:p.title "Skills / Tools"]
                    [:p.subtitle "Adept"
                        [:dl
                            [:li "Electron"]
                            [:li "WebGL: Pixi, Threejs, ReGL, p5.js"]
                            [:li "Front End Web (HTML/MD/CSS/SCSS/JS)"]
                            [:li "openframeworks (C++)"]
                            [:li "Arduino"]]]
                    [:p.subtitle "Intermediate"
                        [:dl
                            [:li "Unity / C#"]
                            [:li "Node.js"]
                            [:li "Fragment Shaders"]
                            [:li "Clojure(Script)/(CLR)"]]]
                    [:p.subtitle "Familiar"
                        [:dl
                            [:li "Python"]
                            [:li "Rust"]
                            [:li "React"]
                            [:li "Jupyter Notebooks"]]]]
                    [:p.subtitle "Learning"
                        [:dl
                            [:li "lorem ipsum"]]]]]])
