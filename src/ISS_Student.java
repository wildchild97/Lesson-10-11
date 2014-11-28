
public class ISS_Student implements Comparable
{
    private String name;
    private String address;
    private int id;
    
    public ISS_Student(String n, String a, int i)
    {
         name=n;
         address=a;
         id=i;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String toString()
    {
        String str="Name:\t" + name;
        str+="\nAddress:\t" + address;
        str+="\nID Number:\t"+ id;
        return str;
    }
    
    public int compareTo(Object o) {
        int differance=id-((ISS_Student)o).getID();
        return differance;
    }
    
}
