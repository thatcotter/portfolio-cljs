(ns portfolio-cljs.about)

(def ipsum 
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(defn body []
    [:div.columns
        [:div.column.is-3-desktop.is-1-tablet]
        [:div.content.column.is-6-desktop
            [:section.hero.is-medium.is-bold
                [:div.hero-body
                    [:h1.title "Hey, bud! I'm Andrew, a designer from Philly working in NYC. I design and develop interactive experiences that are surprising, fun, and honest."]
                    [:br]
                    [:p "I like to make things that have both physical and digital dimensions to them. I have a BS in Industrial Design from The University of the Arts and an MFA in Design and Technology from Parsons. I like to converge these two feilds in the form of interactive installations, fun web experiences, and games. I'm always looking at our relationships to technology and the ways we wield it: how it does things for us, and to us. When I'm not busy making things, I enjoy exploring the city, running tabletop roleplaying campaigns, or trying to developing new skills/hobbies like knitting and the subtle art of house plant care."]
                    [:br]
                    [:p "For my day job, I'm currently a Creative Technologist at Local Projects. I also teach graduate-level courses at schools like Parsons, usually teaching students how to make art, games, and installations with code. When I'm not coding for money, I'm also involved with " [:a {:href "http://livecode.nyc/" :target "blank"} "LiveCode.NYC"]", a collective of tech artist who use live programming to create audio-visual performances."]
                    [:br]
                    [:p "This website was made using " [:a {:href "http://reagent-project.github.io/" :target "blank"} "Reagent"]", a Clojurescript library that interfaces with React. The source code for this site can be found " [:a {:href "https://github.com/thatcotter/portfolio-cljs" :target "blank"} "here"] "."]]]]])
        ; [:section.hero.is-info.is-bold
            ; [:div.hero-body
            ;     [:h1.title.is-primary "What I Do"]
            ;     [:p "For my day job, I'm currently a creative technologist at Local Projects. I also teach graduate-level courses at schools like Parsons, usually teaching students how to make art, games, and installations with code. When I'm not coding for money, I'm also involved with LiveCode.NYC, a collective of tech artist who use live programming to create audio-visual performances."]]
        ; [:section.hero.is-dark.is-bold
            ; [:div.hero-body
            ;     [:h1.title.is-primary "Who I've Worked With"]
            ;     [:p ipsum]]
        ; [:section.hero.is-light.is-bold
            ; [:div.hero-body
            ;     [:h1.title.is-primary "What Drives Me"]
            ;     [:p "I’m a constant learner. Each project is an
            ;         opportunity towards discovering new tools
            ;         and processes, as well as cultivating a new
            ;         and better understanding of technology,
            ;         and our relationship to it. I like to make
            ;         things that have both physical and digital
            ;         dimensions to them. In my work,
            ;         I try to manifest the convergence of these
            ;         two fields in the form of interactive
            ;         installations, games, and wearable devices.
            ;         I’m always looking at our relationships to
            ;         technology and the ways we wield it: how it
            ;         does things for us, and to us."]]]])
