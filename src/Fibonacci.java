import TerminalIO.*;

public class Fibonacci 
{
    public static void main (String[] args)
    {
        KeyboardReader k=new KeyboardReader();
       int f=k.readInt("Enter a Fibonacci number: ");
       
        int fibonacci(int n)
        {
            if (n<=2)
                return 1;
            else
                return fibonacci (n-1) + fibonacci (n-2);
        }
        System.out.println(fibonnaci(f));
    }
}
