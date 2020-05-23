import java.util.ArrayList;

public class ListOfPeople
{
    // instance variables - replace the example below with your own
    private Person x;
    private ArrayList<Person> list;

    public ListOfPeople()
    {
        x = new Person(21, "Phil");
        
        list = new ArrayList<Person>();
        
        list.add(x);
        list.add(x);
    }

    public void printList()
    {
        /*
        for(Person i: list){
            System.out.println(i.toString());
        }
        */
       
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println();
    }
}
