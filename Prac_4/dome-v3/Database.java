import java.util.ArrayList;

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void createDatabase()
    {
        // local variables
        CD item;

        item = new CD("Lungs", "Florence", 10, 100);
        item.setComment("Breathes easily");
        this.addItem(item);

        item = new CD("My Worlds", "Justin", 10, 100);
        item.setComment("Why ???");
        this.addItem(item);
        
        // local variables
        DVD i; 
        i = new DVD("Titanic", "James Cameron", 120);
        i.setComment("Romance");
        this.addItem(i);
        
        // local variables
        VideoGame x; 
        x = new VideoGame("Gears 5", "XBOX One");
        x.setComment("Action");
        this.addItem(x);
    }
}
