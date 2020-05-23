public class FlowerBed{
    private String id;
    private int size;
    private int areaInUse;
    
    public FlowerBed(String id,int size, int areaInUse){
        this.id = id;
        this.size = size;
        this.areaInUse = areaInUse;
    }
    
    //get methods
    public String getId(){
        return id;
    }
    public int getSize(){
        return size;
    }
    public int getAreaInUse(){
        return areaInUse;
    }
    
    //set methods
    public void setId(String id){
        this.id = id;
    }
    public void setSize(int size){
         this.size = size;
    }
    public void setAreaInUse(int areaInUse){
        this.areaInUse = areaInUse;
    }
}
