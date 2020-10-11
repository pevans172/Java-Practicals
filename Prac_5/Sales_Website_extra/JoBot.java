public class JoBot extends Jo
{
    public JoBot (String n) {
        super(n);
    }
    public JoBot () {
        super("Ed");
    }
    public String toString () {
        return "This is a " + "subclass of Jo"; 
    }
    public int returnNumber()
    {
        return 4+4;
    }
    public int returnNumber(int x)
    {
        return x;
    }
 }
