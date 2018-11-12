(ns portfolio-cljs.about)

(def ipsum 
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(defn body []
    [:div.content
        [:section.hero.is-large.is-bold
            [:div.hero-body
                [:h1.hero-head.title "Hey, bud! I'm Andrew, a designer from Philly working in NYC. I design and develop interactive experiences that are surprising, fun, and honest."]
                [:p.hero-body "I like to make things that have both physical and digital dimensions to them. I have a BS in Industrial Design from The University of the Arts and am currently finishing up an MFA in Design and Technology at Parsons. I like to converge these two feilds in the form of interactive installations and games. I'm always looking at our relationships to technology and the ways we wield it: how it does things for us, and to us. When I'm not busy making things, I enjoy exploring the city, sharing cheesy puns with friends, finding cool/inspiring videos on YouTube/Vimeo, or trying to develop a new skill like musicianship, knitting, or meditation."]
        ; [:section.hero.is-info.is-bold
            ; [:div.hero-body
                [:h1.title.is-primary "What I Do"]
                [:p ipsum]
        ; [:section.hero.is-dark.is-bold
            ; [:div.hero-body
                [:h1.title.is-primary "Who I've Worked With"]
                [:p ipsum]
        ; [:section.hero.is-light.is-bold
            ; [:div.hero-body
                [:h1.title.is-primary "What Drives Me"]
                [:p "I’m a constant learner. Each project is an
                    opportunity towards discovering new tools
                    and processes, as well as cultivating a new
                    and better understanding of technology,
                    and our relationship to it. I like to make
                    things that have both physical and digital
                    dimensions to them. In my work,
                    I try to manifest the convergence of these
                    two fields in the form of interactive
                    installations, games, and wearable devices.
                    I’m always looking at our relationships to
                    technology and the ways we wield it: how it
                    does things for us, and to us."]]]])
