(defn get-fib-seq [x]
  (let [lazy-fib-seq
  ((fn build-fib [a b]
      (lazy-seq (cons a (build-fib b (+ a b))))
  ) 0 1)]
  (rest (take (+ x 1) lazy-fib-seq)))
)

(get-fib-seq 10)