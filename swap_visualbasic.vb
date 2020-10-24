Module Program
		Sub Main()
        Dim a As Integer = Nothing
        Dim b As Integer = Nothing
        Dim c As Integer = Nothing
        Console.WriteLine("Enter first number")
       a = Console.ReadLine()
        Console.WriteLine("Enter second number")
       b = Console.ReadLine()
        Console.WriteLine("Before Swapping : a = " & a & " b = " & b)
        c = a
        a = b
        b = c
        Console.WriteLine("After Swapping : a = " & a & " b = " & b)
	End Sub
End Module
	
