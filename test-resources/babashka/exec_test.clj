(ns babashka.exec-test
  {:org.babashka/cli {:coerce {:foo []}}})

(defn exec-test
  {:org.babashka/cli
   {:exec-args {:foo :foo}
    :coerce {:bar :keyword}}}
  [m]
  (if (:meta m)
    (prn (meta m))
    (prn m)))
