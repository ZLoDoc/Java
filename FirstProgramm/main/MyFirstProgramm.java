package FirstProgramm.main;

import FirstProgramm.Asus.Asus;
import FirstProgramm.Asus.asusModel1;
import FirstProgramm.Asus.asusModel2;
import FirstProgramm.Objects.Computer;
import FirstProgramm.Objects.Note;
import FirstProgramm.Objects.Printer;
import FirstProgramm.Toshiba.Toshiba;
import _Study.printer;


public class MyFirstProgramm {
    public static void main(String[] args) {
        
        // Computer comp = new Computer("IBM", 2048, 3000, 2.5, "sdsdsds");
        // Note notebook = new Note("AMD", 512, 1000, 1, "dfsdf3434dfdsf");


        
        // comp.setName("AmD");
        // comp.setHdd(2000);
        // comp.setRam(2048);
        // comp.setWeight(14.00);
        // comp.setserialNumber("2323232");
        
        // System.out.println(comp.getserialNumber());
        

        // comp.on();
        // comp.load();
        // comp.off();
        
        
        asusModel1 as1 = new asusModel1("Asus1", 512, 256, 10,"dfdfdf34343");
        asusModel2 as2 = new asusModel2("Asus2", 256, 100, 10, "345474dfdfd564654"); 

        Toshiba tos1 = new Toshiba("Toshiba1", 512, 200, 5, "454dfd545df54");
        Toshiba tos2 = new Toshiba("Toshiba2", 256, 85, 4, "4sd54dsa54fd54sfd");

    //  
    //  notebook.on();

    
     as1.on();
     as2.on();
     tos1.on();
     tos2.on();
     as1.dvdRom();
     as2.dvdRom();
     tos1.dvdRom();
     tos2.dvdRom();
   Printer prNt = new Printer();
   prNt.on();
   prNt.printerPrn("lalalal");
   prNt.printerScan();
   prNt.off();

comp.load();

    //  comp.on();
        
    }
    
}
