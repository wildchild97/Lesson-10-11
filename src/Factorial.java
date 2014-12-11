import TerminalIO.*;

public class Factorial {
  
    public static void main(String[] args)
    {
        int factorial (int n)
        {
            if (n==1)
                return 1;
            else
                return n * factorial (n-1);
        }
        
        System.out.println(factorial);
    }
}
