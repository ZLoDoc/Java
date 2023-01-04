package FirstProgramm.Objects;

public class Note extends Computer{

    protected Note() {
        System.out.println("Note : конструктор");
    }

      
    public Note(String name, int ram, int hdd, double weight, String serialNumber) {
        super(name, ram, hdd, weight, serialNumber);
    }

    @Override
    public void on(){ 
        // super.on();       
        print("Notebook : я включился. Моя модель : " + getName()+". А мой вес : " +getWeight());
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        // super.off();
        System.out.println("Notebook выключился");
    }

        
}
