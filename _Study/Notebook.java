package _Study;



public class Notebook extends Computer {

    public Notebook() {
    }

    
    

    public Notebook(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }




    public Notebook(String name, int ram, int hdd, double weight, String serialNumber) {
        super(name, ram, hdd, weight, serialNumber);
    }




    public Notebook(String name, int ram, int hdd, double weight, boolean canCdWrite) {
        super(name, ram, hdd, weight, canCdWrite);
    }




    @Override
    public void on(){               
              
        print("Notebook: I'm switshing on. My model : "+ getName());
    }




}
