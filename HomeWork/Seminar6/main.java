package HomeWork.Seminar6;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class main {
    public static void main(String[] args)   {      
        

        HashSet<note> notes = new HashSet<>();
        for (int i = 1; i<=10;i++ ){
            note first = new note(i);
            // first.info();
            notes.add(first);           
        }
        
        System.out.println(notes);
        for (note item : notes) {
            item.info();
        }
        System.out.println(notes.);
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



    // }
        
       
           
            
        
    }
}
