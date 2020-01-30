public class Flower{
    private String name;
    private String species;
    private String genus;
    private String family;
    
    private String bestMonth;
    private int monthsToBloom;
    
    public Flower(){
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
        name = this.name;
    }
    public void setSpecies(String species){
        species = this.species;
    }
    public void setGenus(String genus){
         genus = this.genus;
    }
    public void setFamily(String family){
        family = this.family;
    }
    public void setBestMonth(String bestMonth){
        bestMonth = this.bestMonth;
    }
    public void setMonthsToBloom(int monthsToBloom){
        monthsToBloom = this.monthsToBloom;
    }
}
