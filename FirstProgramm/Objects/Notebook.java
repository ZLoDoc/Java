package objects;

public class Notebook extends Computer {

    public Notebook(String name) {
        super(name);
    }

    public Notebook(String name, boolean canWriteDvd) {
        super(name, canWriteDvd);
    }

    @Override
    public void connect() {
        System.out.println("Notebook connect();");
    }
}
