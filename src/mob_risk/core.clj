(ns mob-risk.core)

(def players (atom {}))

(def board (atom {}))

(defn init-players! [player-names]
  (doseq [n player-names]
    (swap! players assoc n nil)))

(defn init-board! []
  (swap! board {}))






























(comment
  (rand-nth ["George" "Guillaume" "Annie" "Konstantinos" "Dinos"]))
