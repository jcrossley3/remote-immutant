(ns immutant.init
  (:use [immutant.messaging :only [start]]))

(start "queue")