(ns kata#2.core-test
  (:require [clojure.test :refer :all]
            [kata#2.core :refer :all]))

(deftest a-test
  (testing "Testing case 10"
    (is (= "8" (convertBase8ToBase16 "10")))))
