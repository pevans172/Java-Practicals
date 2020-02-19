public class Numbers
{
    private int limit;
    private int value;
    private String displayValue;
    
    public Numbers(int limit, int value){
        this.limit = limit;
        this.value = value;
    }
    
    // getters
    public int getLimit(){
        return limit;
    }
    public int getValue(){
        return value;
    }
    public String getDisplayValue(){
        return displayValue;
    }
    
    // setters
    public void setLimit(int x){
        limit = x;
    }
    public void setValue(int x){
        value = x;
    }
    
    public void setDisplayValue(){
        if(value < 10){
            displayValue = "0" + value;
        }
        else{
            displayValue = "" + value;
        }
    }
    
    public void increment(){
        value = (value + 1) % limit;
    }
}