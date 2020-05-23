public class PlantingRecords
{
    private SeedStock seedUsed;
    private FlowerBed bedUsed;
    private String dateOfPlanting;
    
    public PlantingRecords(String dateOfPlanting, int weight, String bestBeforeDate, 
                            String name,String species,String genus,String family,
                            String bestMonth,int monthsToBloom, String id,int size, 
                            int areaInUse)
    {
        seedUsed = new SeedStock(weight,bestBeforeDate,name,species,genus,family,bestMonth,monthsToBloom);
        bedUsed = new FlowerBed(id,size,areaInUse);
        this.dateOfPlanting = dateOfPlanting;
    }

    // getters
    
    // setters
}