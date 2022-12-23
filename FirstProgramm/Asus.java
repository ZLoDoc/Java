package FirstProgramm;

public class Asus extends Note {

    public Asus() {
    }
   
    
    public Asus(String name, int ram, int hdd, double weight, String serialNumber) {
        super(name, ram, hdd, weight, serialNumber);
    }




    @Override
    public void off() {
        
        super.off();
        System.out.println("Asus выключился");
    }
    @Override
    public void dvdRom() {
        // TODO Auto-generated method stub
        super.dvdRom();
        System.out.println("DVD читает");
    }
}
