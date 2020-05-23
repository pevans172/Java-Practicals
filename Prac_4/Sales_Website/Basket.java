import java.util.ArrayList;

public class Basket
{
    private ArrayList<Item> basket;
    
    public Basket(){
        basket = new ArrayList<Item>();
    }
    
    public void addToBasketFrac(int referenceId, String name, String description, double vat, double pricePerMeasure){
        FracItem i = new FracItem(referenceId, name, description, vat, pricePerMeasure);
        basket.add(i);
    }
    
    public void addToBasketWhole(int referenceId, String name, String description, double vat, double pricePerUnit){
        WholeItem i = new WholeItem(referenceId, name, description, vat, pricePerUnit);
        basket.add(i);
    }
    
    public void addToBasketSecondHand(int referenceId, String name, String description, double vat, double pricePerUnit, int grade){
        SecondHandItem i = new SecondHandItem(referenceId, name, description, vat, pricePerUnit, grade);
        basket.add(i);
    }
    
    public void print(){
        System.out.println();
        for(Item i: basket){
            i.print();
        }
    }
    
    public void createBasket(){
        addToBasketFrac(123, "Phone", "Use to make calls", 0.2, 160);
        addToBasketWhole(456, "Fabric", "Use to make clothes", 0.05, 9);
        addToBasketSecondHand(789, "Phone", "Use to make calls", 0.1, 40, 3);
    }
    
    public double getPriceOfBasketB4Tax(){
        double total = 0;
        for(Item i: basket){
            total += i.getPrice();
        }
        return total;
    }
    
    public double getPriceOfBasketAfterTax(){
        double total = 0;
        for(Item i: basket){
            total += i.priceAfterVat(i.getPrice());
        }
        return total;
    }
}