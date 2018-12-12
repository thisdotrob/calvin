(ns eginez.calvin.core-test
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.test :refer-macros [async deftest is testing]]
            [cljs.core.async :refer [put! take! chan <! >!] :as async]
            [clojure.string :as strg]
            [cljs.pprint :as pp]
            [eginez.calvin.core :as calvin]))

(deftest resolve-dependencies
  (async done
         (go
           (let [coordinates [['day8.re-frame/http-fx "0.1.6"]]
                 retrieve false

                 [status dep-graph resolved-deps]
                 (<! (calvin/resolve-dependencies coordinates retrieve))]
             (pp/pprint result)
             (assert (true? status))
             (done)))))
