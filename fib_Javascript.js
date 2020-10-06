<script type = "text/javascript"> 
	function fibonacci(num) 
	{ 
		var num1 = 0, num2 = 1, sum, i = 0; 
		for (i = 0; i < num; i++) 
		{ 
			sum = num1 + num2; 
			num1 = num2; 
			num2 = sum; 
		} 
		return num2; 
	} 

	document.write("Fibonacci(5): " + fibonacci(5) + "<br>"); 
	document.write("Fibonacci(8): " + fibonacci(8) + "<br>"); 
</script> 
