public class Clock
{
    private Numbers hours;
    private Numbers minutes;
    private String time;
    
    public Clock()
    {
        hours = new Numbers(24, 0);
        minutes = new Numbers(60, 0);
    }
    
    public void run()
    {
         hours.setDisplayValue();
         minutes.setDisplayValue();
         String time = hours.getDisplayValue() + " : " + minutes.getDisplayValue();
         System.out.println(time);
                
         minutes.increment();
         if(minutes.getValue() == 0){
             hours.increment();
         }
    }
}
