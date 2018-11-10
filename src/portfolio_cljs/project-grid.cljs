(ns portfolio-cljs.project-grid
    (:require
        [reagent.core :as r]))

(defn placeholder-link [size]
    (str "https://picsum.photos/" size "/?random"))

(def image-links
    ["./assets/images/phillytron.jpg"
     "./assets/images/magic-mecha2.jpg"
     "https://redpaperheart.com/media/work/talktolight/google_talktolight_sxsw_hero-1920.jpg"
     "./assets/images/buttons-small.png"
     "./assets/images/voyage_1.gif"
     "./assets/images/tide.gif"
     "./assets/images/HA_7288(edit).jpg"])

(defn cell [image state & [link]]
    [:div.column.is-one-third.progressive 
        {:style { :justify-content "center"
                    :overflow "hidden"
                    :align-items "center"}
         :on-click #(do (swap! state assoc :page "Projects")
                        (print state))}
        [:img.preview.lazy 
            {:src image
                :style {:flex 0
                        :height "100%"
                        :width "100%"
                        :layout "fill"
                        :opacity 0.75
                        :object-fit "cover"}}]])

(defn cell-grid [state]
    [:section.section
        [:div.columns.is-multiline
            (for [image (shuffle image-links)]
                (cell image state))]])

(defn cell-grid-placeholder [num-cells state]
    [:section.section
        [:div.columns.is-multiline
            (for [x (range num-cells)]
                (cell 
                    (placeholder-link (- (/ (.-width js/screen) 6) (.floor js/Math (* 30(.random js/Math)))))
                    state))]])
                     
