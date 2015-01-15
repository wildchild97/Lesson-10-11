import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue{

    private ArrayList list[];
    private int size;
    
    public LinkedPriorityQueue(int s)
    {
        size=s;
	list = new ArrayList[size];
        for(int x=0; x<size; x++)
        {
            list[x]= new ArrayList();
        }
    } 
 
    public void enqueue(Object obj, int i) 
    {
        //add to correct priority list
        list[i].add(0);
    }

    public Object peekFront() 
    {
        if (list.isEmpty()) 
            throw new IllegalStateException("Queue is empty");
            return list.get(0);
    }
  
    public Object dequeue() 
    {
        if (list.isEmpty())
            throw new IllegalStateException("Queue is empty");
            return list.remove(0);
    }
   
    public void enqueue(Object o) {
        //required to implement queue
        throw new IllegalStateException ("Must give a priority");
    }
  
    public int size() {
        return list.length;
    }
    
    public int queueSize(int i)
    {
        return list[i].size();
    }
    
    public boolean hasData()
    {
        //see if a queue has someone waiting
        for(int i=0; i<size; i++)
        {
            if (queueSize(1)>0) return true;     
        }
        return false;
    }
}
