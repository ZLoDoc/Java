package asus;

public class AsusModel1 extends Asus {

    public AsusModel1(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel1 connect();");
    }
}
