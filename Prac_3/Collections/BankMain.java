public class BankMain
{
    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        
        BankAccount temp = new BankAccount(123, 3, "Tim");
        bank.addCustomer(temp);
        
        BankAccount temp1 = new BankAccount(456, 5, "Phil");
        bank.addCustomer(temp1);
        
        BankAccount temp2 = new BankAccount(789, 7, "Peter");
        bank.addCustomer(temp2);
        
        BankAccount temp3 = new BankAccount(560, 9, "Cha");
        bank.addCustomer(temp3);
        
        BankAccount temp4 = new BankAccount(321, 20, "Sarah");
        bank.addCustomer(temp4);
        
        System.out.println("Oldest");
        System.out.println(bank.getOldest());
        System.out.println();
        
        System.out.println("Mean Age");
        System.out.println(bank.getMeanAge());
        System.out.println();
        
        System.out.println("All those under 18");
        System.out.println(bank.getAllUnder18());
        System.out.println();
        
        System.out.println("Medain Age");
        System.out.println(bank.getMedianAge());
        System.out.println();
        
        System.out.println("######################");
    }
}
