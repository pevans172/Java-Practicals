public class FlowerBed{
    private String id;
    private int size;
    private int areaInUse;
    
    public FlowerBed(String id,int size, int areaInUse){
        id = this.id;
        size = this.size;
        areaInUse = this.areaInUse;
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
        id = this.id;
    }
    public void setSize(int size){
         size = this.size;
    }
    public void setAreaInUse(int areaInUse){
        areaInUse = this.areaInUse;
    }
}
