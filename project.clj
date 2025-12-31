(defproject org.openvoxproject/comidi "1.0.1-SNAPSHOT"
  :description "OpenVox utility functions and compojure-like wrappers for use with the bidi web routing library"
  :url "https://github.com/openvoxproject/comidi"

  :pedantic? :abort

  :min-lein-version "2.9.1"

  :parent-project {:coords [org.openvoxproject/clj-parent "7.5.0"]
                   :inherit [:managed-dependencies]}

  :dependencies [[org.clojure/clojure]

                 [bidi]
                 [compojure]
                 [prismatic/schema]
                 [org.openvoxproject/kitchensink]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]

  :plugins  [[lein-parent "0.3.7"]])
