// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
package HomeWork.Seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {

        ArrayList <Notebook> AllNote = new ArrayList<Notebook>();        
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
        int maxMem = 0;
        int maxHdd = 0;
        
        for(Notebook item : AllNote){
            if (item.memory>maxMem){
                    maxMem = item.memory;
            if (item.hdd>maxHdd){
                maxHdd = item.hdd;
            }                
            }            
            item.info();
        }
        filter.MaxSize=maxMem;
        filter.MaxHdd=maxHdd;        
                
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1 - add name filter");
            System.out.println("2 - add min memory filter");
            System.out.println("3 - add max memory filter");
            System.out.println("4 - add color");
            System.out.println("5 - add min HDD size");
            System.out.println("6 - add max HDD size");            
            System.out.println("7 - clear filter");
            System.out.println("8 - search notebooks");

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
                    System.out.print("Enter min memory size: ");
                    filter.setMinSize(input.nextInt());
                continue;

                case("3"):
                    System.out.print("Enter max memory size: ");
                    filter.setMaxSize(input.nextInt());
                continue;
                case("4"):
                //TODO color
                    System.out.print("Enter color: ");
                    filter.setColor(input.nextLine());
                continue;
                case("5"):
                //TODO min HDD
                    System.out.print("Enter min HDD size: ");
                    filter.setMinHdd(input.nextInt());
                continue;
                case("6"):
                //TODO max HDD
                    System.out.print("Enter max HDD size: ");
                    filter.setMaxHdd(input.nextInt());
                continue;
                case ("7"):   
                filter.clearFilter();
                for(Notebook item : AllNote){
                    if (item.memory>maxMem){
                            maxMem = item.memory;
                    if (item.hdd>maxHdd){
                        maxHdd = item.hdd;
                    }                        
                    }           
                 
                }
                filter.MaxSize=maxMem;
                filter.MaxHdd=maxHdd;

                    continue;
                case("8"):
                    System.out.print("Filter criteria : ");                    
                    filter.info();
                    FiltredNote.removeAll(FiltredNote);                    

                    for(Notebook value : AllNote){                        
                        boolean NameBool = false;
                        boolean MemMinBool = false;
                        boolean MemMaxBool = false;
                        boolean ColorBool = false;
                        boolean MinHddBool = false;                  
                        boolean MaxHddBool = false;                  
                        
                        if ((filter.Name == null) || value.name.equals(filter.Name)){                            
                            NameBool = true;                            
                        }
                        if (filter.MinSize == null || value.memory>=filter.MinSize){                            
                            MemMinBool = true;
                        }
                        if (value.memory<=filter.MaxSize){
                            MemMaxBool = true;                            
                        }
                        if ((filter.Color == null)||value.color.equals(filter.Color)){ 
                            ColorBool = true;                                                       
                        }                        
                        if(filter.MinHdd == null || value.hdd>=filter.MinHdd){
                            MinHddBool = true;
                        }
                        if (value.hdd<=filter.MaxHdd){
                            MaxHddBool = true;
                        }
                        if(NameBool==true & MemMinBool == true & MemMaxBool == true & ColorBool == true & MinHddBool == true & MaxHddBool == true){
                            FiltredNote.add(value);                                 
                        }       
                    }

                    for (Notebook item : FiltredNote ){                                
                            item.info();
                    }
                    continue;
                    
                                
                
                
            }   
        }       
    }                      
}

    
    
            
           
        

    

