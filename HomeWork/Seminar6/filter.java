package HomeWork.Seminar6;

public class filter {
    public String Name;
    public int MinSize;
    public int MaxSize;
    
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
    protected void info(){
        System.out.println("(Модель ноутбука : "+getName()+", min size : "+getMinSize()+", max size : "+getMaxSize()+")");
               
    }
    
    

}
