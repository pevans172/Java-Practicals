public class Person
{
    private int age;
    private String firstName;
    private String lastName;
    private String birthDate;
    
    public Person(int age, String firstName, String lastName, String birthDate)
    {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void setAge(int x){
        this.age = age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.firstName = firstName;
    }
    
    public int getAge(){
        return age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return firstName;
    }
    public String getBirthDate(){
        return firstName;
    }

    public String toString(){
        return "The person's name is " + getFirstName() + " " + getLastName() + 
        " and is " + getAge() + " years old. Their birthday is " + 
        getBirthDate() + ".";
    }
}
