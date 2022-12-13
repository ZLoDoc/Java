package HomeWork.Seminar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {      
        

        HashMap<Integer,Object> notes = new HashMap<>();
        for (int i = 1; i<=10;i++ ){
            note first = new note(i);
            first.info();
            notes.put(i, first);
            
           
        }
        for (Map.Entry key: notes.entrySet()) {
            System.out.println(key.getValue());
            
        }   
           
            
        
    }
}
// katz firstCat = new katz(1, "Барсик");
// firstCat.info();