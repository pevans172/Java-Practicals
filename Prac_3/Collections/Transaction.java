public class Transaction
{
    private int amountInvolved;
    private BankAccount sender;
    private BankAccount reciever;

    public Transaction(int amountInvolved, BankAccount sender, BankAccount reciever)
    {
        this.amountInvolved = amountInvolved;
        this.sender = sender;
        this.reciever = reciever;
    }

    // no sets once this object is made it must be final
    public int getAmountInvolved()
    {
        return amountInvolved;
    }
    public BankAccount getSender()
    {
        return sender;
    }
    public BankAccount getReciever()
    {
        return reciever;
    }
}
