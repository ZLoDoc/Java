package HomeWork.Seminar6;

public class filter {
    public String Name;
    public int MinSize;
    public int MaxSize;
    public String Color;
    public int MinHdd;
    public int MaxHdd;

    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getMinSize() {
        return MinSize;
    }
    public void setMinSize(int minSize) {
        MinSize = minSize;
    }
    public int getMaxSize() {
        return MaxSize;
    }
    public void setMaxSize(int maxSize) {
        MaxSize = maxSize;
    }    
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getMinHdd() {
        return MinHdd;
    }
    public void setMinHdd(int minHdd) {
        MinHdd = minHdd;
    }
    public int getMaxHdd() {
        return MaxHdd;
    }
    public void setMaxHdd(int maxHdd) {
        MaxHdd = maxHdd;
    }
   
    protected void info(){
        System.out.println("(Модель ноутбука : "+getName()+", min size : "+getMinSize()+", max size : "+getMaxSize()+")");
               
    }
   
    

}
