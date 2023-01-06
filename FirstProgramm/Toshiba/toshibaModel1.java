package toshiba;

public class ToshibaModel1 extends Toshiba {

    public ToshibaModel1(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("ToshibaModel1 connect();");
    }
}
