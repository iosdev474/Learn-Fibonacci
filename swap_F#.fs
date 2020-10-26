let mutable (a, b) = (1, 2)

let swap (left : 'a byref) (right : 'a byref) =
  let temp = left
  left <- right
  right <- temp

printfn "a: %i - b: %i" a b
swap (&a) (&b)
printfn "a: %i - b: %i" a b