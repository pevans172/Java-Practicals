import java.util.ArrayList;

public class BankAccount
{
    private int uniqueAccountId;
    private Person owner;
    private int balance;
    private Transaction t;
    
    private ArrayList<Transaction> transactions;

    public BankAccount(int uniqueAccountId, Person owner, int balance)
    {
        this.uniqueAccountId = uniqueAccountId;
        this.owner = owner;
        this.balance = balance;
        transactions = new ArrayList<Transaction>();
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
            System.out.println("Sent to: " + transactions.get(i).getReciever());
            System.out.println("Sent by: " + getUniqueAccountId());
        }
    }
}