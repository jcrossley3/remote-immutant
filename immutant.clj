(ns remote.init
  (:use [immutant.messaging :only [start]]))

(start "queue")