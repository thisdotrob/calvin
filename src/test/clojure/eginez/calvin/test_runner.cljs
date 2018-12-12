(ns eginez.calvin.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [eginez.calvin.core-test]))

(doo-tests 'eginez.calvin.core-test)
