package HomeWork.Seminar6;

public class Notebook {
    
    protected Integer id;
    protected String name;
    protected Integer memory;
    protected String color;
    protected Integer hdd;
    
    
    public Notebook() {
    }


    public Notebook(Integer id, String name,Integer memory) {
        this.id = id;
        this.name = name;
        this.memory = memory;
        
    }
    

    public Notebook(Integer id, String name, Integer memory, String color, Integer hdd) {
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
