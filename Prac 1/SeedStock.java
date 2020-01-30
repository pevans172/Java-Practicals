public class SeedStock
{
    private Flower seed;
    private int kg;
    private String bestBeforeDate;
    
    public SeedStock(int weight, String bestBeforeDate, String name,String species,
                    String genus,String family,String bestMonth,int monthsToBloom){
        seed = new Flower(name, species, genus, family, bestMonth, monthsToBloom);
        kg = weight;
        bestBeforeDate = this.bestBeforeDate;
    }
    
    // getters
    public int getKg(){
        return kg;
    }
    public String getBestBeforeDate(){
        return bestBeforeDate;
    }
    // setters
    public void setKg(int kg){
        kg = this.kg;
    }
    public void setBestBeforeDate(String bestBeforeDate){
        bestBeforeDate = this.bestBeforeDate;
    }
}





