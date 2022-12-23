package HomeWork.Seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {

        ArrayList <Notebook> AllNote = new ArrayList<Notebook>();
        // ArrayList <Notebook> FiltredNote = new ArrayList<Notebook>();
        HashSet<Notebook> FiltredNote = new HashSet<Notebook>();
        
        filter filter = new filter();

        Notebook note1 = new Notebook(1, "Asus",512,"black",2000);
        Notebook note2 = new Notebook(2, "Accer",1024,"blue", 1000);
        Notebook note3 = new Notebook(3, "Dell",2048,"white",512);
        Notebook note4 = new Notebook(4,"Asus", 256,"black",1000);
        Notebook note5 = new Notebook(5, "Toshiba", 2048, "red", 2000);
        
        

        AllNote.add(note1);
        AllNote.add(note2);
        AllNote.add(note3);
        AllNote.add(note4);
        AllNote.add(note5);
        int max =0;

        for(Notebook item : AllNote){
            if (item.memory>max){
                    max = item.memory;
            }            
            item.info();
        }
        filter.MaxSize=max;        
                
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1 - add name filter");
            System.out.println("2 - add min memory filter");
            System.out.println("3 - add max memory filter");
            System.out.println("4 - add color");
            System.out.println("5 - add min HDD size");
            System.out.println("6 - add max HDD size");
            System.out.println("7 - search notebooks");
            System.out.println("8 - clear filter");

            Scanner input =  new Scanner(System.in);
            String key = input.nextLine(); 
            switch(key){
                case ("1"):
                    System.out.print("Choise model of notebook :");       
                    
                    for(Notebook value : AllNote){
                    System.out.print(value.name+", ");
                    }
                    System.out.print("\nChoise name: ");
                    filter.setName(input.nextLine());
                continue;
    
                case("2"):
                    System.out.println("Enter min memory size: ");
                    filter.setMinSize(input.nextInt());
                continue;

                case("3"):
                    System.out.println("Enter max memory size: ");
                    filter.setMaxSize(input.nextInt());
                continue;
                case("4"):
                //TODO color
                    System.out.println("Enter color: ");
                    filter.setColor(input.nextLine());
                continue;
                case("5"):
                //TODO min HDD
                    System.out.println("Enter min HDD size: ");
                    filter.setMinHdd(input.nextInt());
                continue;
                case("6"):
                //TODO max HDD
                    System.out.println("Enter max HDD size: ");
                    filter.setMaxHdd(input.nextInt());
                continue;
                
                case("7"):
                    System.out.print("Filter criteria : ");                    
                    filter.info();
                    FiltredNote.removeAll(FiltredNote);

                    for(Notebook value : AllNote){                        
                        boolean NameBool = false;
                        boolean MemBool = false;
                        boolean ColorBool = false;
                        boolean HddBool = false;                  
                        
                        if ((filter.Name == null) || value.name.equals(filter.Name)){                            
                            NameBool = true;                            
                        }
                        if (filter.MinSize == 0 || value.memory>=filter.MinSize && value.memory<=filter.MaxSize){                            
                            MemBool = true;
                        if (filter.Color.equals(null)||value.color.equals(filter.Color)) 
                            ColorBool = true;                                                       
                        }                        
                        if(filter.MinHdd==0 || value.hdd>=filter.MinHdd||value.hdd<=filter.MaxHdd){
                            HddBool = true;
                        }
                        if(NameBool==true & MemBool== true & ColorBool == true & HddBool == true){
                            FiltredNote.add(value);                                 
                        }       
                    }
                    for (Notebook item : FiltredNote ){                                
                            item.info();
                    }
                    case("8"):
                        FiltredNote.removeAll(FiltredNote);                
                }

                        
    }
        
       
}                      
}

    
    
            
           
        

    

