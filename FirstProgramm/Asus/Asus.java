package FirstProgramm.Asus;

import FirstProgramm.Objects.Note;

public class Asus extends Note {

    protected Asus() {
    }
   
    
    protected Asus(String name, int ram, int hdd, double weight, String serialNumber) {
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
        // super.dvdRom();
        System.out.println("DVD толькео читаю ");
    }
}
