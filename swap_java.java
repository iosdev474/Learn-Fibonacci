import java.io.*;
public class swap_java
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        double c,d;
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());

        c = c-d;
        d = c+d;
        c = d-c;

        System.out.println("After swapping\n");
        System.out.println(a+" "+b);
    }
}