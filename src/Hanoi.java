import TerminalIO.*;

public class Hanoi 
{
    static int nummoves=0;
    
    public static void main (String[] args)
    {
       KeyboardReader k=new KeyboardReader();
       int numrings=k.readInt("Enter number of rings (3 to 10): ");
       
       if (numrings<3 || numrings>10)
       {
           System.out.println("Invalid number");
           return;
       }
       
       //call move-number of rings, going from here to there
       //which ring is the in-between step
       
       move (numrings,1,3,2);
       System.out.println("Total moves = " + nummoves);
    }
    
    public static void move (int n, int i, int j, int k)
    {
        //stop moving when no more rings
        if (n>0)
        {
            nummoves++;
            move (n-1,i,k,j); // move calls itself
            System.out.println("Move ring " + n +" from peg " + i + " to peg" +j);
            move (n-1,k,j,i);
        }
    }
}
