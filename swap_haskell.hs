swap n m (x:xs)
  | n == x = m : (swap n m xs)
  | m == x = n : (swap n m xs)
  | otherwise = x : (swap n m xs)