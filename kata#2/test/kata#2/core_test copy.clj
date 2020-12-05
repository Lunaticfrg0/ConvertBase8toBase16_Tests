(ns kata#2.core-test
  (:require [clojure.test :refer :all]
            [kata#2.core :refer :all]))

(deftest a-test
  (testing "Testing case 33"
    (is (= "1b" (convertBase8ToBase16 "33")))))
