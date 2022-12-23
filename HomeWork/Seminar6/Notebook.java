package HomeWork.Seminar6;

public class Notebook {
    
    protected int id;
    protected String name;
    protected int memory;
    protected String color;
    protected int hdd;
    
    
    public Notebook() {
    }


    public Notebook(int id, String name,int memory) {
        this.id = id;
        this.name = name;
        this.memory = memory;
        
    }
    

    public Notebook(int id, String name, int memory, String color, int hdd) {
        this.id = id;
        this.name = name;
        this.memory = memory;
        this.color = color;
        this.hdd = hdd;
    }


    protected void info(){
        System.out.println("ID :"+id+", name : "+name+", memory :"+memory+", color : "+color+", HDD size : "+hdd);
               
    }

   

     
}
