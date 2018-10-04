(ns cljrenjin.core
  (:import [javax.script ScriptEngineManager ScriptEngine]
           [java.io FileReader]
           [org.renjin.script RenjinScriptEngineFactory]))

(def engine (atom nil))

(defn ->engine []
  ;;// create a script engine manager:
  (let [^RenjinScriptEngineFactory factory (RenjinScriptEngineFactory.)
        ;;// create a Renjin engine:
        ^ScriptEngine env  (.getScriptEngine factory)]
    (reset! engine env)))

(defn reval [expr]
  (let [^ScriptEngine env (or @engine  (->engine))]
    (.eval env expr)))

;;tsting
(defn test []
  (reval "df <- data.frame(x=1:10, y=(1:10)+rnorm(n=10))")
  (reval "print(df)")
  (reval "print(lm(y ~ x, df))"))

(defn plot-test []
  (reval (slurp "plottest.r")))

(defn ggplot-test []
  (reval (slurp "plots.r")))


