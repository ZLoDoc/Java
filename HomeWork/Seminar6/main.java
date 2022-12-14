package HomeWork.Seminar6;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {      
        

        HashMap<Integer,note> notes = new HashMap<>();
        for (int i = 1; i<=10;i++ ){
            note first = new note(i);
            first.info();
            notes.put(i, first);           
        }
        
        
        // System.out.println(notes.get(1));
        // Object temp = (notes.get(1));
        
        
        for (Map.Entry key: notes.entrySet()) {
            System.out.println(key.getValue().getClass().toGenericString());
            
        }   
       
           
            
        
    }
}
