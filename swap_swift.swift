var a = 0
var b = 1
print("Before:")
print("a", a)
print("b", b)

func swap(_ a: inout Int, _ b: inout Int) {
    let temporaryA = a
    a = b
    b = temporaryA
}

swap(&a, &b)

print("After:")
print("a", a)
print("b", b)
