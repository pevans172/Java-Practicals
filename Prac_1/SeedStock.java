public class SeedStock
{
    private Flower seed;
    private int kg;
    private String bestBeforeDate;
    
    public SeedStock(int weight, String bestBeforeDate, String name,String species,
                    String genus,String family,String bestMonth,int monthsToBloom){
        seed = new Flower(name, species, genus, family, bestMonth, monthsToBloom);
        kg = weight;
        this.bestBeforeDate = bestBeforeDate;
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
        this.kg = kg;
    }
    public void setBestBeforeDate(String bestBeforeDate){
        this.bestBeforeDate = bestBeforeDate;
    }
}





