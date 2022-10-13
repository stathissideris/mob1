(ns mob-risk.core)

(def state (atom {}))

(defn init-players [state player-names]
  (assoc state :players (zipmap player-names (repeat nil))))

(defn init-board [state]
  (assoc state :board {}))

(defn place-unit-allowed? [state player where]
  (or (nil? (get-in state [:board where :units]))
      (= player (get-in state [:board where :owner]))))

(defn place-army [state player what where]
  (if (place-unit-allowed? state player where)
    (assoc-in state [:board where] {:units what :owner player})
    (assoc state :error "Not allowed")))




(comment
  {:phase keyword?
   :board {:ontario {:units number?
                     :owner string?}}
   :error nil})






























(comment
  (rand-nth ["George" "Guillaume" "Annie" "Konstantinos" "Dinos"]))
