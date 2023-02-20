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

(println "----------------------- OPERATIONS -----------------------")
(println (+ 1 1))
(println (+ 1 1 1 1 1 1 ))
(println (* 2 4))
(println (= 1 1.0))
(println (== 1 1.0))
(println (= [1 2 3 4] [1 2 3 4]))
(println '(1 2 3 4))
(println '(+ 1 2))
(println (eval '(+ 1 2)))

(println "----------------------- CALLING JAVA -----------------------")
(.println System/out "hello world")

(println "----------------------- EXCEPTIONS -----------------------")
(println (try (throw (Exception. "hello exception!")) (catch Exception e (.getMessage e))))

(println "----------------------- LIST -----------------------")
(def x '(1 2 3 4 5))
(println (class x))
(println (first x))
(println (last x))
(println (nth x 2))
(println (rest x))
(println (pop x))
(println (peek x))

(println "----------------------- VECTOR -----------------------")
(def y [1 2 3 4 6])
(println (class y))
(println (nth y 2))

(println (doc conj))
(println (conj x 6))
(println (conj y 6))


(def t1 [1 "hello"])
(apply println t1)

(println "----------------------- CONDITIONS -----------------------")
(println (if (= 1 1) "hello" "world"))
(println (if (= 1 2) "hello" "world"))

(def x 3)
(println (case x
  1 "hello"
  2 "world"
  3 "dunno"))

(println (cond (= x 3) "hello" (= y 5) "world")) ; evaluate the expr, if true, then returns

(println "----------------------- FUNCTIONS -----------------------")
(defn say-name [n] (println "Hi " n))
(say-name "Helder")

(println (macroexpand '(defn say-hello [n] n)))

(println "----------------------- FIZZBUZZ -----------------------")
(defn fizzbuzz [ns]
  (for [n ns]
    (cond
      (= 0 (mod n 15)) "FizzBuzz"
      (= 0 (mod n 3)) "Fizz"
      (= 0 (mod n 5)) "Buzz"
      :else n
    )))
(println (fizzbuzz '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)))