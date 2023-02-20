(println "hello world")
(println "hello world" " and you")

(println "----------------------- LET'S PLAY WITH THE REPL -----------------------")
(ns foobar
  (:use [clojure.repl]))
(doc println)
(doc print)

(println "----------------------- FIND DOC -----------------------")
(find-doc "println")

(println "----------------------- SOURCE CODE -----------------------")
(source println)

(println "----------------------- TYPES AND CLASSES -----------------------")
(doc class)

(println (class 1))
(println (class "hello"))
(println (class 2.0))
(println (class 1/2))
(println (class \n))
(println (class #"hello*"))
(println (class :hello))
(println (class 'x))

(println (+ 1 1))
(println (+ 1 1 1 1 1 1 ))
(println (* 2 4))
(println (= 1 1.0))
(println (== 1 1.0))
(println (= [1 2 3 4] [1 2 3 4]))
(println '(1 2 3 4))
(println '(+ 1 2))
(println (eval '(+ 1 2)))

(.println System/out "hello world")

(println (try (throw (Exception. "hello exception!")) (catch Exception e (.getMessage e))))

