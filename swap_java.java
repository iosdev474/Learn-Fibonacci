import java.io.*;
public class swap_java
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        double a,b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        a = a-b;
        b = a+b;
        a = b-a;

        System.out.println("After swapping\n");
        System.out.println(a+" "+b);
    }
}