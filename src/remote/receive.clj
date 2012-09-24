(ns remote.receive
  (:use [immutant.messaging :only [receive]]))

(defn -main [& args]
  (println (receive "queue", :host "localhost", :port 5445)))
