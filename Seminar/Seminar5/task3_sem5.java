package Seminar.Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3_sem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        Map<Character,Integer> res = new HashMap<>();
        char [] input = scanner.nextLine().toLowerCase().toCharArray();
        
        for(char s:input){
            if (res.containsKey(s)) {res.put(s,res.get(s)+1);
            System.out.println(res);}            
            else {res.put(s,1);
            System.out.println(res);}
        }
        
        int answer=0;
        
        for(Character e:res.keySet()){
                if (e=='m') answer+=res.get(e)*1000;
                else if (e == 'x')answer+=res.get(e)*10;                                    
                else if (e == 'i')answer+=res.get(e);                
        }
        System.out.println(answer);

        
    }
    
}
