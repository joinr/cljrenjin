(defproject cljrenjin "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["bedatadriven public repo"
                  "https://nexus.bedatadriven.com/content/groups/public/"]
                 ["mulesoft public"
                  "https://repository.mulesoft.org/nexus/content/repositories/public/"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.renjin/renjin-script-engine "0.9.2691"]
                 [org.renjin.cran/ggplot2 "3.0.0-b29"]])
