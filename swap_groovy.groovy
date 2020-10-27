class SwapExample {
	public static void main(String[] args) {
		def a = 3
		def b = 6

		println("The value of a before swap is " + a)
		println("The value of b before swap is " + b)
	
		// Swapping of two numbers using temp variable
        def temp = a
        a = b
        b = temp
		
		println("The value of a after swap is " + a)
		println("The value of b after swap is " + b)
	}

}