public class Person{
    
    private String name;
    private int age;
    
    public Person(int x, String y){
        age = x;
        name = y;
    }

    public String toString(){
        return name + " is age " + age;
    }
}