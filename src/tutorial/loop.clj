(ns tutorial.loop)

(defn Loop
  []
  (println "\n Loop")
  (loop [x 0]
    (when (< x 10)
      (println "Loop" x)
      (recur (inc x))
      )
    )
  )

(Loop)

(defn doTimes
  []
  (dotimes [x 10]
    (println x)
    )
  )

(doTimes)

(defn whileLoop
  [count]
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)
      )
    )
  )

(whileLoop 3)

(defn doSeq
  [seq]
  (println "\n do seq")
  (doseq [x seq]
    (println (inc x))
    )
  )

(doSeq [1 2 3 4])