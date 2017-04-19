(defproject org.clojars.khdegraaf/gregor "0.5.3"
  :min-lein-version "2.0.0"
  :description "Lightweight Clojure bindings for Kafka 0.10+"
  :url "https://github.com/khdegraaf/gregor.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.kafka/kafka_2.12 "0.10.2.0"]]
  :plugins [[lein-codox "0.9.3"]]
  :deploy-repositories [["releases" :clojars]]
  :codox {:output-path "doc"})
