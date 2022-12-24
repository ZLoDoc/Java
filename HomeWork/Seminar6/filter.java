package HomeWork.Seminar6;



public class filter {
    public String Name;
    public Integer MinSize = null;
    public Integer MaxSize;
    public String Color;
    public Integer MinHdd = null;
    public Integer MaxHdd;

    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Integer getMinSize() {
        return MinSize;
    }
    public void setMinSize(Integer minSize) {
        MinSize = minSize;
    }
    public Integer getMaxSize() {
        return MaxSize;
    }
    public void setMaxSize(Integer maxSize) {
        MaxSize = maxSize;
    }    
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public Integer getMinHdd() {
        return MinHdd;
    }
    public void setMinHdd(Integer minHdd) {
        MinHdd = minHdd;
    }
    public Integer getMaxHdd() {
        return MaxHdd;
    }
    public void setMaxHdd(Integer maxHdd) {
        MaxHdd = maxHdd;
    }
   
    protected void info(){
        System.out.println("(Модель ноутбука : "+getName()+", min size : "+getMinSize()+", max size : "+getMaxSize()+
                        ", color : "+getColor()+", HDD min size : "+getMinHdd()+", HDD max size :"+getMaxHdd()+")");
               
    }
   
    protected void clearFilter(){
        
        setName(null);
        setMinSize(null);
        setMaxSize(0);
        setColor(null);
        setMinHdd(null);
        setMaxHdd(0);

        
        

    }

}
