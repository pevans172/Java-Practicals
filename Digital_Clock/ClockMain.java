import java.util.concurrent.TimeUnit;
public class ClockMain
{
    public static void main(String[] args){
        Clock cl = new Clock();
        int runtime = 0;
        while (runtime < 120){
            cl.run();
            runtime = runtime++;
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
        
    } 
}