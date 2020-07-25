(defproject kwrooijen/gungnir.ui "0.0.1-SNAPSHOT"
  :description "UI helpers for the Gungnir library"
  :url "https://github.com/kwrooijen/gungnir.ui"
  :license {:name "MIT"}
  :source-paths ["src/cljs"]
  :dependencies [[kwrooijen/gungnir "0.0.1-SNAPSHOT"]]
  :plugins [[lein-cloverage "1.1.2"]
            [lein-codox "0.10.7"]
            [lein-ancient "0.6.15"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [org.clojure/clojurescript "1.10.764"]
                                  [orchestra "2020.07.12-1"]]}
             :test {:dependencies [[org.clojure/clojure "1.10.1"]
                                   [org.clojure/clojurescript "1.10.764"]
                                   [orchestra "2020.07.12-1"]]}}
  :deploy-repositories [["releases" :clojars]])
