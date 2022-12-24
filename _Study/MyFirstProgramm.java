package _Study;

public class MyFirstProgramm {
    
    public static void main(String[] args) {
        
        
        Computer comp1 = new Computer("IBM", 2048, 1000, 2.5);
        Computer comp2 = new Computer("AMD", 1024, 500, 3.5);
        Notebook note1 = new Notebook("Dell", 512, 1000, 2.14);
        Asus asus1 = new Asus("Asus 1", 512, 1000, 5.4, false);
        Asus asus2 = new Asus("Asus 2", 2048, 2500, 3.5);
        Toshiba Toshiba1 = new Toshiba("Toshiba 1", 256, 1000, 5.6);
        Toshiba Toshiba2 = new Toshiba("Toshiba 2", 2048, 2000, 1.5);
        Toshiba Toshiba3 = new Toshiba("Toshiba 3", 256, 125, .5, "red");
        printer prn1 = new printer();
        printer prn2 = new printer(null, null);

        
        
        
        // System.out.println("Comp1 name = "+comp1.getName());
        // System.out.println("Comp2 name = "+comp2.getName());
        // Computer temp = comp2;
        // comp2 = comp1;
        // comp1 = temp;
        // System.out.println("Comp1 name = "+comp1.getName());
        // System.out.println("Comp2 name = "+comp2.getName());
        // temp = null;
        
        


          
        
        // comp.setName("AmD");
        // comp.setHdd(2000);
        // comp.setRam(2048);
        // comp.setWeight(14.00);
        // comp.setSerialNumber(".,njm,j54544");
        // System.out.println(comp.getSerialNumber());
        
        

        // comp.on();
        // comp.load();
        // comp.openCD();
        // comp.closeCD();
        // comp.off();
        // comp.resetButton();
        note1.on();
        asus1.on();
        asus2.on();
        asus1.closeCD();
        Toshiba1.on();
        Toshiba2.on();
        Toshiba2.openCD();
        Toshiba2.closeCD();
        prn1.printString("Hello World !!!!");
        prn1.printBold("hello");
        prn2.printTwoParams("Hello", 35);
        asus1.writeCD();
        Toshiba1.writeCD();
        
    }
    
}
