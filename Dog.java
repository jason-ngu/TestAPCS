import java.util.ArrayList;

public class Dog extends Pet
{
    private int trainability = ( int )Math.random() * 101;
    private ArrayList<String> trickList = new ArrayList<String>();
    
    public Dog( String name, String owner )
    {
        super( name, owner );
    }
    
    public String speak()
    {
        if( ( ( int )Math.random() * 11 ) <= 7 )
            return "Woof!";
        else
            return "Bark!";
    }
    
    public void learnNewTrick( int difficulty, String trickName )
    {
        if( difficulty <= trainability )
        {
            trickList.add( trickName );
        }
    }
    
    public String doTrick()
    {
        int trick = ( int )Math.random() * trickList.size();
        return trickList.get( trick );
    }
}