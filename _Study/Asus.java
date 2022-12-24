package _Study;

public class Asus extends Notebook{

    public Asus() {
    }

   

    
    public Asus(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }




    public Asus(String name, int ram, int hdd, double weight, String serialNumber) {
        super(name, ram, hdd, weight, serialNumber);
    }




    public Asus(String name, int ram, int hdd, double weight, boolean canCdWrite) {
        super(name, ram, hdd, weight, false);
    }




    @Override
    public void on() {
        
        System.out.println( getName()+" : I'm switching on.");
    }
    
    
}
