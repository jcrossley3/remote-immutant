(ns remote.receive
  (:use immutant.messaging))

(defn -main [& args]
  (println (receive "queue")))
