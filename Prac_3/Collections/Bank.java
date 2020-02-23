import java.util.ArrayList;
import java.util.Collections;

public class Bank
{
    private ArrayList<BankAccount> customers;
    private BankAccount temp;
    
    public Bank()
    {
        customers = new ArrayList<BankAccount>();
    }

    public void addCustomer(BankAccount account)
    {
        customers.add(account);
    }
    
    public String getOldest()
    {
        BankAccount temp = customers.get(0);
        for (int i = 1; i < customers.size(); i++)
        {
            if (temp.getOwner().getAge() < customers.get(i).getOwner().getAge()) 
            {
                temp = customers.get(i);
            }
        }
        return temp.getOwner().getFirstName();
    }
    
    public double getMeanAge()
    {
        int average = 0;
        double average = 0;
        for (int i = 0; i < customers.size(); i++)
        {
            average += customers.get(i).getOwner().getAge();
        }
        return average/customers.size();
    }
    
    public ArrayList<Integer> getAllUnder18()
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < customers.size(); i++)
        {
            if (customers.get(i).getOwner().getAge() <= 18) 
            {
                temp.add(customers.get(i).getUniqueAccountId());
            }
        }
        return temp;
    }
    
    public int getMedianAge()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < customers.size(); i++)
        {
            list.add(customers.get(i).getOwner().getAge());
        }
        
        Collections.sort(list); 
        
        int middle = list.size();
        int median = 0;
        if (middle % 2 == 0)
        {
            middle = middle / 2;
            median = ( list.get(middle) + list.get(middle - 1) )/2;
        }
        else
        {
            double middleDouble = list.size();
            middle = (int) ((middleDouble / 2) + 0.5);
            median = list.get(middle - 1);
        }
        return median;
    }
}