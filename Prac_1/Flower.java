public class Flower{
    private String name;
    private String species;
    private String genus;
    private String family;
    
    private String bestMonth;
    private int monthsToBloom;
    
    public Flower(String name,String species,String genus,String family,String bestMonth,int monthsToBloom){
        this.species = species;
        this.genus = genus;
        this.family = family;
        this.bestMonth = bestMonth;
        this.monthsToBloom = monthsToBloom;
    }
    
    //get methods
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public String getGenus(){
        return genus;
    }
    public String getFamily(){
        return family;
    }
    public String getBestMonth(){
        return bestMonth;
    }
    public int getMonthsToBloom(){
        return monthsToBloom;
    }
    //set methods
    public void setName(String name){
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setGenus(String genus){
         this.genus = genus;
    }
    public void setFamily(String family){
        this.family = family;
    }
    public void setBestMonth(String bestMonth){
        this.bestMonth = bestMonth;
    }
    public void setMonthsToBloom(int monthsToBloom){
        this.monthsToBloom = monthsToBloom;
    }
}
