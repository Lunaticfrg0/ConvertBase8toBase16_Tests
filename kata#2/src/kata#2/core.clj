(ns kata#2.core
  (:require [clojure.string :refer :all])
  (:gen-class))

(def characters 
  (concat (map char (range 48 58)) (map char (range 65 91))))

(def conversion-table
  (zipmap
   characters
   (range)))

(defn base8ToBase10
  [^String octal]
  (let [octal (clojure.string/upper-case octal)]
    (assert (every? #(< (conversion-table %) 8) octal))
    (loop [num octal
           acc 0]
      (if (seq num)
        (recur (drop 1 num)(+ (* 8 acc) (get conversion-table (first num))))
        acc))))

(defn convertBase8ToBase16
  [^String octal]
  (def tmp (base8ToBase10 octal))
  (Integer/toHexString tmp))
  
(comment
    (base8ToBase10 700)
    (Integer/toHexString 448))