(ns tutorial.functions
  (:gen-class))

(defn -main
  "My first function"
  []
  (println "Hello")
  (#(println %) (+ 3 5))
  )


(def increment (fn [x] (+ x 1)))

(defn increment_set
  []
  (map increment [1 3 5]))

; Data types

(defn dataTypes
  []
  (def a "sachin")
  (def b 1)
  (def c 1.23)
  (def d 1.56e-12)
  (def e 0xfbfc)
  (def f false)
  (def g nil)
  (def h 'thanks)
  (println a b c d e f g h))

(dataTypes)