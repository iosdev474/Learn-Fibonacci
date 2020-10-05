fun main(args: Array<String>) {

    val febCount = 15
    val feb = IntArray(febCount)
    feb[0] = 0
    feb[1] = 1
    for (i in 2 until febCount) {
        feb[i] = feb[i - 1] + feb[i - 2]
    }

    for (i in 0 until febCount) {
        print(feb[i].toString() + " ")
    }
}
