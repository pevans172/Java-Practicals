/**
 * A simple class to apply a transformation iteratively
 * 
 * @author Steven Bradley
 * 
public class CountExpr
{
    private double x;
    public double y;
    
    public CountExpr(int startx, int starty){
         x=startx/10.0;
        y=starty/10.0;
    }
    
    public void doOnce(){
        y=(x-25)*Math.tan(y/3) - (y-30)*Math.tan(x/3);
    }
    
    public boolean finished(){
            return x+y>100; 
    }
}
*/

public class CountExpr
{
    private double x;
    public double y;
    
    public CountExpr(int startx, int starty){
         x=startx/10.0;
        y=starty/10.0;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x=x/10.0;
    }
    public void setY(double y){
        this.y=y/10.0;
    }
    
    public void doOnce(){
        x=(y-25)*Math.tan(x/3) - (x-30)*Math.tan(y/3);
    }
    
    public boolean finished(){
            return x+y>100; 
    }
}