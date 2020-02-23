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
    
    public int getMeanAge()
    {
        int average = 0;
        for (int i = 1; i < customers.size(); i++)
        {
            average += customers.get(i).getOwner().getAge();
        }
        average = average / customers.size();
        return average;
    }
    
    public ArrayList<BankAccount> getAllUnder18()
    {
        ArrayList<BankAccount> temp = new ArrayList<BankAccount>();
        for (int i = 0; i < customers.size(); i++)
        {
            if (customers.get(i).getOwner().getAge() <= 18) 
            {
                temp.add(customers.get(i));
            }
        }
        return temp;
    }
    
    public int getMedianAge()
    {
        ArrayList<BankAccount> list = customers;
        for(int j = 0; j < customers.size(); j++)
        {
            BankAccount temp = list.get(j);
            for (int i = 0; i < customers.size(); i++)
            {
                if (temp.getOwner().getAge() > customers.get(i).getOwner().getAge()) 
                {
                    Collections.swap(list, list.indexOf(temp), i);
                }
            }
        }
        
        int middle = list.size();
        int median = 0;
        if (middle % 2 == 0)
        {
            middle = middle / 2;
            median = ( list.get(middle).getOwner().getAge() + list.get(middle + 1).getOwner().getAge() )/2;
        }
        else
        {
            double middleDouble = list.size();
            middle = (int) ((middleDouble / 2) + 0.5);
            median = list.get(middle).getOwner().getAge();
        }
        return median;
    }
}