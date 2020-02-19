import java.util.ArrayList;
public class BankAccount
{
    private int uniqueAccountId;
    private Person owner;
    private int balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(int uniqueAccountId, Person owner, int balance)
    {
        this.uniqueAccountId = uniqueAccountId;
        this.owner = owner;
        this.balance = balance;
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void addTransaction(int amountInvolved, BankAccount sender, BankAccount reciever)
    {
        Transaction temp = new Transaction(amountInvolved, sender, reciever);
        transactions.add(temp);
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
}