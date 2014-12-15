import TerminalIO.*;

public class Factorial {
  
    public static void main(String[] args)
    {
        KeyboardReader k=new KeyboardReader();
        int n=k.readInt("Enter the factorial max 15");
        
        int factorial ()
        {
            if (n==1)
                return 1;
            else
                return n * factorial (n-1);
        }
        
        System.out.println(factorial);
    }
}
