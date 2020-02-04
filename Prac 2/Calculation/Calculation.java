public class Calculation
{
    private double x;
    private double y;

    public Calculation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public double getAverage(){
        return (x+y)/2;
    }
    public double getMax(){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public void swap(){
        double placehold = x;
        x = y;
        y = placehold;
    }
    public void getQuadraticRoots(int a, int b, int c){
        x = ((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        y = ((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
    }
    public boolean xIsOdd(){
        if((x%2) == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public void getMonthAndYear(String date){
        String[] dates = date.split("/");
        x = Double.parseDouble(dates[0]);
        String d = dates[1];
        if(d.length() == 2){
            d = "20" + d;
        }
        y = Double.parseDouble(d);
    }
    public int coins(){
        int oneP = 1;
        int twoP = 2;
        int fiveP = 5;
        int tenP = 10;
        int twentyP = 20;
        int fiftyP = 50;
        int pound = 100;
        int twoPounds = 200;
        int coins = 0;
        
        while(x>=twoPounds){
            x = x - twoPounds;
            coins++;
        }
        while(x>=pound){
            x = x - pound;
            coins++;
        }
        while(x>=fiftyP){
            x = x - fiftyP;
            coins++;
        }
        while(x>=twentyP){
            x = x - twentyP;
            coins++;
        }
        
        while(x>=tenP){
            x = x - tenP;
            coins++;
        }
        while(x>=fiveP){
            x = x - fiveP;
            coins++;
        }
        while(x>=twoP){
            x = x - twoP;
            coins++;
        }
        while(x>=oneP){
            x = x - oneP;
            coins++;
        }
        
        return coins;
    }
    
    public int getHoursInAWeek(){
        return (24*7);
    }
    public int getSecondsInAYear(){
        return (60*60*24*365);
    }
}
