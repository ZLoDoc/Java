package FirstProgramm;

public class MyFirstProgramm {
    public static void main(String[] args) {
        
        Computer comp = new Computer("IBM", 2048, 3000, 2.5, "sdsdsds");
          

        
        // comp.setName("AmD");
        // comp.setHdd(2000);
        // comp.setRam(2048);
        // comp.setWeight(14.00);
        // comp.setserialNumber("2323232");
        
        // System.out.println(comp.getserialNumber());
        

        // comp.on();
        // comp.load();
        // comp.off();
        
     Note notebook = new Note("AMD", 512, 1000, 1, "dfsdf3434dfdsf");
     Asus as1 = new Asus(null, 512, 256, 10,"dfdfdf34343"); 
     
     
     notebook.on();
     as1.off();
     as1.dvdRom();
    //  comp.on();
        
    }
    
}
