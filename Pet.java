public class Pet
{
    private String origName;
    private String origOwner;
    
    public Pet( String name, String owner )
    {
        origName = name;
        origOwner = owner;
    }
    
    public String getOwner()
    {
        return origOwner;
    }
    
    public void changeOwner( String owner )
    {
        origOwner = owner;
    }
    
    public String getName()
    {
        return origName;
    }
    
    public String speak()
    {
        return "";
    }
}