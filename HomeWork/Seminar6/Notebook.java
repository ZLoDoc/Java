package HomeWork.Seminar6;

public class Notebook {
    
    protected int id;
    protected String name;
    protected int memory;
    
    
    public Notebook() {
    }


    public Notebook(int id, String name,int memory) {
        this.id = id;
        this.name = name;
        this.memory = memory;
        
    }

    protected void info(){
        System.out.println("ID :"+id+", name : "+name+", memory :"+memory);
               
    }

   

     
}
