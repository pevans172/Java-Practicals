import java.util.ArrayList;

public class BankAccount
{
    private int uniqueAccountId;
    private int balance;
    private Person owner;
    private Transaction t;
    private ArrayList<Transaction> transactions;

    public BankAccount(int uniqueAccountId, int balance, int age, String firstName, String lastName, String birthDate)
    {
        this.uniqueAccountId = uniqueAccountId;
        this.balance = balance;
        transactions = new ArrayList<Transaction>();
        
        owner = new Person(age, firstName, lastName, birthDate);
    }
    public BankAccount()
    {
        this.uniqueAccountId = 12345;
        this.balance = 1000;
        transactions = new ArrayList<Transaction>();
        
        owner = new Person(20, "Phil", "Evans", "25/09/98");
    }
    public BankAccount(int uniqueAccountId, int age, String firstName)
    {
        this.uniqueAccountId = uniqueAccountId;
        this.balance = 1000;
        transactions = new ArrayList<Transaction>();
        
        owner = new Person(age, firstName, "Evans", "25/09/98");
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void addTransaction(int amountInvolved, BankAccount reciever)
    {
        t = new Transaction(amountInvolved, reciever);
        transactions.add(t);
    }
    
    public int getUniqueAccountId()
    {
        return uniqueAccountId;
    }
    public Person getOwner()
    {
        return owner;
    }
    public int getBalance()
    {
        return balance;
    }
    public ArrayList<Transaction> getTransactions()
    {
        return transactions;
    }
    
    public void printTransactions()
    {
        for (int i=0; i < transactions.size(); i++)
        {
            System.out.println("Transaction " + i);
            System.out.println("Amount: " + transactions.get(i).getAmountInvolved());
            System.out.println("Sent to: " + transactions.get(i).getReciever().getUniqueAccountId());
            System.out.println("Sent by: " + getUniqueAccountId());
            System.out.println();
        }
    }
}