public class Cat extends Pet
{
    private String breed;
    
    public Cat( String name, String owner, String type )
    {
        super( name, owner );
        breed = type;
    }
    
    public String getBreed()
    {
        return breed;
    }
    
    public String speak()
    {
        return "meow";
    }
    
    public void purr()
    {
        System.out.println( "Purring..." );
    }
    
    public String getName()
    {
        super.getName();
        return "Test";
    }
}