(ns tutorial.tutorial.coding.challenge.1)

(def animalAgeRatio { 'dog 7, 'cat 5, 'fish 10})

(defn petToHumanAgeRatio
  "This function returns the ratio of a pet to human age"
  [petType]
  (get animalAgeRatio petType)
  )


(defn petAgeToHumanYears
  "This function returns the age of a pet in human years"
  [name type age]
  (def ratio (petToHumanAgeRatio type))
  (println name "is" (* ratio age) "years old in human years.")
  )

(petAgeToHumanYears "Buddy" 'dog 0.3)