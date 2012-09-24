(ns remote.publish
  (:use immutant.messaging))

(defn -main [& args]
  (publish "queue" args))
