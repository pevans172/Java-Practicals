public abstract class Item
{
    private int referenceId;
    private String name;
    private String description;
    private double vat;

    public Item(int referenceId, String name, String description, double vat){
        this.referenceId = referenceId;
        this.name = name;
        this.description = description;
        this.vat = vat;
    }
    
    public void print(){
        System.out.println();
        System.out.println("referenceId: " + referenceId);
        System.out.println("name: " + name);
        System.out.println("description: " + description);
        System.out.println("vat: " + vat);
    }
    
    public double priceAfterVat(double price){
        return price * (1+vat);
    }

    abstract public double getPricePreVat();
}
