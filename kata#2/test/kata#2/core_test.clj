(ns kata#2.core-test
  (:require [clojure.test :refer :all]
            [kata#2.core :refer :all]))

(deftest a-test
  (testing "Testing case 700"
    (is (= "1c0" (convertBase8ToBase16 "700")))))
