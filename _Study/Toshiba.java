package _Study;

public class Toshiba extends Notebook {

    public Toshiba() {
    }

    public Toshiba(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }

    public Toshiba( String name, int ram, int hdd, double weight,String color){
        super(name, ram, hdd, weight);
        System.out.println(getName()+ ": I'm very fashionable. I'm "+color);
    }
    
    
    @Override
    public void closeCD() {        
        super.closeCD();
        System.out.println(getName()+" : Then i'm recording this disk");
    }
    
    
}
