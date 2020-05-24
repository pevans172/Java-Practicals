public class SecondHandItem extends WholeItem
{
    private int grade;
    
    public SecondHandItem(int referenceId, String name, String description, double vat, double pricePerUnit, int grade){
        super(referenceId, name, description, vat, pricePerUnit);
        this.grade = grade;
    }
    
    public double getDiscountPrice(){
        if(grade == 1){return getPricePreVat() * 0.1;}
        else if(grade == 2){return getPricePreVat() * 0.2;}
        else if(grade == 3){return getPricePreVat() * 0.3;}
        else if(grade == 4){return getPricePreVat() * 0.5;}
        else{return getPricePreVat() * 0.7;}
    }
    
    public void print(){
        super.print();
        System.out.println("Current discount VAT price: " + getDiscountPrice());
    }
}
