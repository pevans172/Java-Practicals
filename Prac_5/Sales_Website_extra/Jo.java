public class Jo {
    private String name;
    private int size;
    public Jo( String n) {
        name = n; size = 0;
    }
    public void grow () {
        size ++;
    }
    public String toString () {
        return " Name : " + name + " Size : " + size ;
    }
 }
