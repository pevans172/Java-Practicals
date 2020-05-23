public class WholeItem extends Item
{
    private double pricePerUnit;

    public WholeItem(int referenceId, String name, String description, double vat, double pricePerUnit){
        super(referenceId, name, description, vat);
        this.pricePerUnit = pricePerUnit;
    }
    
    public void print(){
        super.print();
        System.out.println("price before VAT: " + pricePerUnit);
        System.out.println("price after VAT: " + priceAfterVat(pricePerUnit));
    }
    
    public double getPrice(){
        return pricePerUnit;
    }
}
