public class Transaction
{
    private int amountInvolved;
    private BankAccount sender;
    private BankAccount reciever;

    public Transaction(int amountInvolved, BankAccount reciever)
    {
        this.amountInvolved = amountInvolved;
        this.reciever = reciever;
    }

    // no sets once this object is made it must be final
    public int getAmountInvolved()
    {
        return amountInvolved;
    }
    public BankAccount getReciever()
    {
        return reciever;
    }
}
