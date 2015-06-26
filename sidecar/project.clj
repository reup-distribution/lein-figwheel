(defproject figwheel-sidecar "0.3.4"
  :description "ClojureScript Autobuilder/Server which pushes changed files to the browser."
  :url "https://github.com/bhauman/lein-figwheel"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/bhauman/lein-figwheel"
        :dir "sidecar"}
  :dependencies
  [[org.clojure/clojure "1.7.0-beta3"]
   [org.clojure/clojurescript "0.0-3211"
    :exclusions [org.apache.ant/ant]]
   [org.clojure/core.async "0.1.346.0-17112a-alpha"]
   [com.cemerick/pomegranate "0.3.0"]  
   [http-kit "2.1.16"]
   [ring-cors "0.1.7"]
   [compojure "1.3.4"]
   [clj-stacktrace "0.2.8"]
   [cljsbuild "1.0.5"]
   [figwheel "0.3.4"]
   [com.cemerick/piggieback "0.1.5"]
   [clojurescript-build "0.1.7"]
   [watchtower "0.1.1"]
   [digest "1.4.4"]])
