(ns tutorial.Atoms)


(defn Atoms
  []
  (def x (atom 100))
  (println @x)  ;; Print the value of atom
  (println x)  ;; Print the object information
  )

(Atoms)