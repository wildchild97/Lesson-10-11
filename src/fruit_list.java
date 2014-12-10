
public class fruit_list {
    
    static int logicalSize=5;
    
    public static void main(String[] args) {
        String fruits[]= new String[10];
        fruits[0]="Apple";
        fruits[1]="Banana";
        fruits[2]="Kiwi";
        fruits[3]="Orange";
        fruits[4]="Strawberry";
       
        printFruits(fruits);
        
        System.out.println("Adding Pineapple to the list");
        //add pineapple to list
        int loc=findInsertPoint(fruits,"Pineapple");
        insert(fruits,"Pineapple",loc);
        
        System.out.println("Adding Plum, Grape, Lemon");
        // add plum,grape,lemon to list
        loc=findInsertPoint(fruits,"Plum");
        insert(fruits,"Plum",loc);
        
        loc=findInsertPoint(fruits,"Grape");
        insert(fruits,"Grape",loc);
        
        loc=findInsertPoint(fruits,"Lemon");
        insert(fruits,"Lemon",loc);
        
        //print updated list
        printFruits(fruits);
        
        //now removing kiwi
        System.out.println("\nRemoving Kiwi from List\n");
        loc=search(fruits,"Kiwi");
        delete(fruits,loc);
        printFruits(fruits); 
    }
    
    public static void printFruits(String f[])
    {
        for (int x=0; x<logicalSize;x++)
        {
            System.out.println("Fruits[" + x + "]=" + f[x]);
        }
    }
    
    
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = a.length-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
    }
  
    public static boolean insert(Object array[], Object newItem, int targetIndex)
    {   
	// Check for a full array and return false if full
	if (logicalSize == array.length)
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array[i] = array[i - 1];
	// Add new item, increment logical size,return true                       
	array[targetIndex] = newItem; 
	logicalSize++;
	return true; 
    }
    
    public static boolean delete(Object array[], int targetIndex)
    {
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array[i] = array[i + 1];
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
    }

    public static int findInsertPoint (Object a[], Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
    }
}
