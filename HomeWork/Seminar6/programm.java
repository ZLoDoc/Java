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

        Notebook note1 = new Notebook(1, "Asus",512);
        Notebook note2 = new Notebook(2, "Accer",1024);
        Notebook note3 = new Notebook(3, "Dell",2048);
        Notebook note4 = new Notebook(4,"Asus", 256);
        

        AllNote.add(note1);
        AllNote.add(note2);
        AllNote.add(note3);
        AllNote.add(note4);
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
            System.out.println("4 - search notebooks");
            System.out.println("5 - clear filter");

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
                    System.out.print("Filter criteria : ");                    
                    filter.info();

                    for(Notebook value : AllNote){
                        if ((value.name.equals("") || value.name == null || value.name.equals(filter.Name))&(value.memory ==0 || value.memory>=filter.MinSize && value.memory<=filter.MaxSize))
                            FiltredNote.add(value);
                            // value.info(); 
                        }
                        
                    for (Notebook item : FiltredNote ){
                        item.info();
                    }       
                }
            
                }

                        
    }
        
       
                        
}

    
    
            
           
        

    

