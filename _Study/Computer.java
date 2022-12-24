package _Study;

public class Computer{
    
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private String serialNumber;
    private String resetButton;
    private boolean canCdWrite = true;
    
    
   
    public Computer() {
    }





    public Computer(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }





    public Computer(String name, int ram, int hdd, double weight, String serialNumber) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.serialNumber = serialNumber;
    }





    protected Computer(String name, int ram, int hdd, double weight, boolean canCdWrite) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.canCdWrite = canCdWrite;

        // on();

    }

    


    
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

   
    public String getSerialNumber(){ 
        if(serialNumber == null || serialNumber.trim().equals("")){
            return "Нет серийника";
        }
        return serialNumber;
                   
            
    }

    public void setSerialNumber(String newSerialNumber){
        if (newSerialNumber != null || newSerialNumber.trim().equals("")){
            
            this.serialNumber = newSerialNumber;
            
        }else{
            System.out.println("The serial number is empty");  

        }

              
    }

    
  






    public void on(){        
        print("Computer switching on. Model of computer: " + getName()+". It's weiht "+getWeight());
    }
    public void off(){        
        print("Computer switching off");

    }
    public void load(){
        print("Computer loading :" +getRam()+ " Гб " + getHdd()+" Гб");        

    }
    public void resetButton(){
        reset();
    }
    
    
    
    private void reset(){
        print(getName()+" : The computer is rebooting");
    }
    public void openCD(){
        System.out.println(getName()+" : The cd-rom is open");
    }
    public void closeCD(){
        System.out.println(getName()+" : The cd is close");
        readCD();
    }
    private void readCD(){
        System.out.println(getName()+" : CD-Rom reading the cd disk");
    }
    protected void writeCD(){
        if(canCdWrite==true){
            System.out.println(getName()+" : Disk writing........");
        }else{
            System.out.println(getName()+" : I'm can't write the disk");
        }
    }
    
    protected void print(String str){
        System.out.println(str);
    }
    

}