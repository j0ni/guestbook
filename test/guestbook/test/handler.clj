(ns guestbook.test.handler
  ;; (:require [clojure.test :refer [deftest testing is]])
  (:use clojure.test
        ring.mock.request
        guestbook.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= 404 (:status response)))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= 404 (:status response))))))
