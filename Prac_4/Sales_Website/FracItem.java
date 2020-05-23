public class FracItem  extends Item
{
    private double pricePerMeasure;

    public FracItem(int referenceId, String name, String description, double vat, double pricePerMeasure){
        super(referenceId, name, description, vat);
        this.pricePerMeasure = pricePerMeasure;
    }
    
    public void print(){
        super.print();
        System.out.println("price before VAT: " + pricePerMeasure);
        System.out.println("price after VAT: " + priceAfterVat(pricePerMeasure));
    }
    
    public double getPrice(){
        return pricePerMeasure;
    }
}