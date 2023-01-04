package FirstProgramm.Objects;

public class Printer extends Computer{
    public String printerPRN;
    public String printerScan;
    
    public void printerPrn(String printerPRN) {
        this.printerPRN = printerPRN;
        System.out.println("Принтер печатает.....");
    }

    public void printerScan(String printerScan) {
        this.printerScan = printerScan;
        System.out.println("Сканирую....");
    }

    
    


    

}
