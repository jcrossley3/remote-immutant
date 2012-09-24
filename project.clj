(defproject remote "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.immutant/immutant-messaging "0.3.0"]
                 [org.hornetq/hornetq-core "2.2.18.Final"]
                 [org.hornetq/hornetq-jms "2.2.18.Final"]
                 [org.jboss.netty/netty "3.2.6.Final"]]
  :aliases {"publish" ["run" "-m" "remote.publish"]
            "receive" ["run" "-m" "remote.receive"]})
