package HomeWork.Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)   {      
        

        HashSet<note> notes = new HashSet<>();

        for (int i = 1; i<=10;i++ ){
            note first = new note(i);
            // first.info();
            notes.add(first);                       
        }
        // System.out.println(notes.size());

        main_menu(notes);
                
    }   
        
        // System.out.println(notes.);
// if (notes.size()) System.out.println("ddddddd");
        
    //     note.class.getDeclaredFields();
    // System.out.println( notes.getOrDefault(1, null).name);
    
    
    // HashMap<Integer,String> filter = new HashMap<>();
    // Scanner scan = new Scanner(System.in);
    // String brend;
    // System.out.println((note.class.getDeclaredField("name")));
    // while(true){
    //     System.out.println("1 - Фирма производитель.\n2 - Диагональ экрана\n3 - Цвет");
    //     Integer filterChoise = (scan.nextInt());
    //     if(filterChoise.equals(1)){
    //        System.out.println( note.class.getFields());

    //         }
            // System.out.println("1- Accer\n2 -Asus\n3 - HP\n4 - Samsung\n5 - Dell");
            // Integer firmChoise = (scan.nextInt());
            //  if(firmChoise.equals(1)) filter.put(1, "Accer");
            

            // System.out.println("Pft,bcm"); 
    //     }



    

    public static void main_menu(HashSet<note> notes) {
       while(true){
            // Scanner input = new Scanner(System.in);
            System.out.println("\n1 - Вывести список ноутбуков\n2 - Отфильтровать по критерию\n3 - Выход");
            System.out.print("Выберите : ");
            String choise = input.nextLine();
            if (choise.equals("1")){        
                System.out.println(notes);
                for (note item : notes) {
                    item.info();
                }
            }
            if (choise.equals("2")){
                filter_menu(notes);
                System.out.println("вызов метода фильтрации списка по критерию"); 
            }
            if (choise.equals("3")){
                break;
            }                    
        }
    }

    
    public static void filter_menu(HashSet<note> notes) {
        // Scanner input = new Scanner(System.in);
        
        HashSet<note> filter = new HashSet<>();
        boolean flag = false;
        while (!flag) {            
            System.out.println("\n1. Отсортировать по производителю\n2. Отсортировать по цвету\n3. Отсортировать по размеру HDD\n4. Выход");
            System.out.print("Выберите : ");
           
            String choise = input.nextLine();
            if (choise.equals("1") || choise.equals("2") || choise.equals("3") || choise.equals("4")) {
                switch (choise) {
                    case "1" -> brend_sorted(notes, filter);
                    case "2" -> color_sorted(notes, filter);
                    case "3" -> hdd_sorted(notes, filter);
                    case "4" -> {
                        return;                        
                    }
                    
                   
                }
            }
        }
    
    }
    
    public static void brend_sorted(HashSet<note>notes,HashSet<note>filter){
        // System.out.println(Arrays.toString(note.names) );
        System.out.println("-----------------------------------");          
        for(int i =0; i<note.names.length;i++){
            System.out.println(note.names[i]);
        }


        System.out.println("-----------------------------------");
        System.out.println("Для сортировки по бренду введите назввание фирмы");
        String choise = input.nextLine();
        for (note item : notes) {
            // item.info();
        
            if (item.name.equals(choise)){
                System.out.println(" Ура !!!!! ");
                System.out.println(input);
            }
        }


    }
    public static void color_sorted(HashSet<note>notes,HashSet<note>filter){
        System.out.println("-----------------------------------");          
        for(int i =0; i<note.colors.length;i++){
            System.out.println(note.colors[i]);
        }
        System.out.println("-----------------------------------");
    }


    public static void hdd_sorted(HashSet<note>notes,HashSet<note>filter){
        System.out.println("-----------------------------------");          
        for(int i =0; i<note.hdds.length;i++){
            System.out.println(note.hdds[i]);
        }
        System.out.println("-----------------------------------");
    }






}
       


 

