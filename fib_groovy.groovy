def fibonacci={int n->
    def a = 0, b= 1;
      n.times{ // times is used to for looping n times 
       (a,b) = [b,a+b] // groovy way of multiple assignment where a is assigned b and b is assigned  a+b
      }
     a // no need of explicit return statement since groovy treats last statement as implicit return
}
fibonacci(10)