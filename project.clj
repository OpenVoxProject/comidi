(defproject org.openvoxproject/comidi "1.1.3-SNAPSHOT"
  :description "OpenVox utility functions and compojure-like wrappers for use with the bidi web routing library"
  :url "https://github.com/openvoxproject/comidi"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}

  :pedantic? :abort

  :min-lein-version "2.9.1"

  ;; These are to enforce consistent versions across dependencies of dependencies,
  ;; and to avoid having to define versions in multiple places. If a component
  ;; defined under :dependencies ends up causing an error due to :pedantic? :abort,
  ;; because it is a dep of a dep with a different version, move it here.
  :managed-dependencies [[org.clojure/clojure "1.12.4"]
                         [bidi "2.1.6"]
                         [commons-io "2.21.0"]
                         [compojure "1.7.2"]
                         [org.openvoxproject/kitchensink "3.5.5"]
                         [prismatic/schema "1.4.1"]]

  :dependencies [[org.clojure/clojure]
                 [bidi]
                 [compojure]
                 [org.openvoxproject/kitchensink]
                 [prismatic/schema]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]])
