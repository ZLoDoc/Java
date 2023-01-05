package FirstProgramm.Objects;

public class Printer extends Computer{
    public String printerPRN;
    public String printerScan;
    
    public void printerPrn(String printerPRN) {
        this.printerPRN = printerPRN;
        System.out.println("Принтер печатает.....");
        System.out.println(printerPRN);
    }

    public void printerScan() {
        
        System.out.println("Сканирую....");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("Printer is switched off....");
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("Printer is switched on....");
    }

    

    
    


    

}
