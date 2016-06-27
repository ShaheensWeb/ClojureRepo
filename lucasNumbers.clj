(ns kata.lucas-numbers)

(defn lucasnum [n]
  "Soln to Lucas Numbers in Clojure from Codewars
  L(n) = L(n - 1) + L(n-2)
  Negative numbers also viable:
  L(n) = L(n + 2) - L(n +1) in that case"
  (let [op (if (< n 0) -' +')]
    (loop [cnt (Math/abs n)
           n0  2
           n1   (op 1)]
      (if (= cnt 0)
        n0
        (recur (dec cnt) n1 (op n0 n1))))))
