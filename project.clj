(defproject jfrog-microservice1-pipeline "0.1.1-SNAPSHOT"
  :main jfrog-microservice1-pipeline.core
  :dependencies [[org.clojure/clojure "1.5.1"]
                   ;; Clojure org
                 [org.clojure/clojure "1.10.1"]

                 ;; Compojure
                 [metosin/compojure-api "2.0.0-alpha31" :exclusions [com.google.guava/guava
                                                                     ;; allow jsonista to pull in newer version
                                                                     com.fasterxml.jackson.core/jackson-annotations]]
                  
                 ;; URIs
                 [lambdaisland/uri "1.4.54"]

                 ;; Ring
                 [metosin/muuntaja "0.6.7"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [org.eclipse.jetty/jetty-server "9.4.34.v20201102"]
                 [ring/ring-defaults "0.3.2"]
                 [metosin/ring-http-response "0.9.1"]
                 [ring-logger "1.0.1"]

                 ;; Integrant
                 [integrant "0.8.0"]
                 ;; Misc
                 [metosin/jsonista "0.3.0"]
                 [expound "0.8.7"]
                 [hiccup "1.0.5"]
                 [trptcolin/versioneer "0.2.0"]
                 [clj-http "3.11.0"]
                 [aero "1.1.6"]
                 [tech.droit/malcontent "0.1.0"]]
  :plugins [[lein-release "1.0.9"]
            [lein-shell "0.5.0"]]
  :mirrors {#"central" {:name "central"
                       :url "https://droit.jfrog.io/artifactory/droit-maven2/"
                       :username :env
                       :password :env}      
                       }
  :repositories {"releases" {:url "https://droit.jfrog.io/artifactory/droit-repo-release/"
                             :sign-releases false
                             :username :env
                             :password :env}
                 "snapshots" {:url "https://droit.jfrog.io/artifactory/droit-repo-snapshot/"
                             :username :env
                             :password :env}})