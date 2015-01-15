
public class Patient 
{
    private String name;
    private String condition;
    
    public boolean setName(String nm)
    {
           name=nm;
           return true;       
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean setCondition(String option)
    {
           condition=option;
           return true;  
    }
    
    public String getCondition()
    {
        return name;
    }
}
