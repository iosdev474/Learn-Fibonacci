fun main(args: Array<String>) {

    var first = 1.20f
    var second = 2.45f

    println("Before swap")
    println("First number = $first")
    println("Second number = $second")
    
    val temporary = first
    
    first = second

    second = temporary

    println("After swap")
    println("First number = $first")
    println("Second number = $second")
}
