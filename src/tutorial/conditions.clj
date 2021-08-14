(ns tutorial.conditions)

(defn condIf
  []
  (println "\nCondIf")
  (if (= 5 5)
    (println "true")
    (println "false")
    )
  )

(condIf)

(defn condIfDo
  []
  (println "\nCondIfDo")
  (if (= 5 6)
    (do
      (println "true 1")
      (println "true 2")
      )
    (do
      (println "false 1")
      (println "false 2")
      )
    )
  )

(condIfDo)

(defn condNestedIf
  []
  (println "\nCondNestedIf")
  (if (and (= 5 5) (= 3 4))
    (println "true")
    (println "false")
    )
  )

(condNestedIf)

(defn caseTest
  [pet]
  (case pet
    "dog" (println "I have a dog")
    "cat" (println "I have a cat")
          (println "Wild animal")
    )
  )

(caseTest "dog")
(caseTest "cat")
(caseTest "cat1")

(defn conditionTest
  [amount]
  (cond
    (<= amount 2) (println "Few amount")
    (<= amount 5) (println "Several amount")
    :else (println "Large amount")
    )
  )

(conditionTest 1)
(conditionTest 5)
(conditionTest 10)