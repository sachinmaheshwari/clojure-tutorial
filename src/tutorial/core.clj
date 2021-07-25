(ns tutorial.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [name]
  (println "Hello, World! -by " name))


#((println "Hello" %1 "How are you" %2 "?")  "Sachin" "today")

#(println "Hello " %)

#(println "Hello" %1", How are you" %2"?")