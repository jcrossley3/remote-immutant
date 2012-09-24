(ns remote.publish
  (:use [immutant.messaging :only [publish]]))

(defn -main [& args]
  (publish "queue" args, :host "localhost", :port 5445))
