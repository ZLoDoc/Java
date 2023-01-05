package FirstProgramm.Objects;

public class Computer extends Object{
    
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private String serialNumber;
   

    public Computer(String name, int ram, int hdd, double weight, String serialNumber) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.serialNumber = serialNumber;
        
    }
    public Computer(){
        // System.out.println("Computer : конструктор");
    }    
  
    
    //------------------------------------------Get ---- Set ----------

    public String getName(){
        return name;
    }
    public void setName(String newName){
        if (newName != null && !newName.trim().equals("")) {
            name = newName;
        }else {
            System.out.println("Name isn't be empty");
        }
    }
    public Integer getRam(){
        return ram;
    }
    public void setRam(Integer newRam){
        if (newRam >0 ) {
            ram = newRam;
        }else{
            System.out.println("This inputed value "+newRam+" is wrong !!!");
        }
    }
    public int getHdd(){
        return hdd;
    }
   
    public void setHdd(int newHdd){
        
        if (newHdd > 0) hdd = newHdd;
        else System.out.println(" Inputed value capasity "+newHdd+" is wrong !!! ");
    }
   
   
    public double getWeight(){
        return weight;
    }
   
    public void setWeight(Double newWeight){
        if (newWeight > 0 && newWeight < 15){
            weight = newWeight;
        }else{
            System.out.println("It's not a computer, it's a stone");
        }
    }


    public String getserialNumber(){
        if(serialNumber==null || serialNumber.equals("")){
           
            return "(ошибка)Нет серийника";
        
        }else{
            
            return serialNumber;
        }
    }
    
    public void setserialNumber (String SerialNumber){
        if(SerialNumber!=null && !SerialNumber.equals("")){
            this.serialNumber = SerialNumber;
            System.out.println(this.serialNumber);
        }else{
            System.out.println("The new serial number absent");

        }
        
        
            
        
        
    }





    public void on(){        
        print("Computer switching on. Model of computer: " + getName()+". It's weiht " +getWeight());
    }
    public void off(){        
        print("Computer switching off");

    }
    public void load(){
        print("Computer loading :" +getRam()+ " Гб " + getHdd()+" Гб");        

    }
    protected void print(String str){
        System.out.println(str);
    }

public void dvdRom(){
    System.out.println("DVD прочел");
    System.out.println("DVD записал");
}










   


}