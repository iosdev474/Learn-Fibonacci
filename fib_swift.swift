func F(_ n: Int) -> Int {
  if n == 0 {
    return 0
  }
  if n == 1 {
    return 1
  }
  else {
    return F(n-1) + F(n-2)
  }
}
