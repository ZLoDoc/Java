// Римские цифры в арабские(не работает)
package Seminar.Seminar5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3_sem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        Map<Character,Integer> res = new HashMap<>();
        char [] input = scanner.nextLine().toLowerCase().toCharArray();
        
        char sumbol = ' ';
        char [] shablon = new char [] {'i','v','x','l','c','d','m'};
        
        for(char s:input)
        {
            if(( sumbol != ' ') && (Arrays.asList(shablon).indexOf(s) > Arrays.asList(shablon).indexOf(sumbol)))
            {
                res.put(sumbol,-1 );
            }
            if (res.containsKey(s)) 
            {
                res.put(s,res.get(s)+1);                
            }            
                else res.put(s,1);
                
            sumbol = s;
            System.out.println(res);                           
        }    
        
        
        int answer=0;
        
        for(Character e:res.keySet()){
                if (e =='m') answer+=res.get(e)*1000;
                else if(e =='c')answer+=res.get(e)*100;
                else if (e == 'x')answer+=res.get(e)*10;                                                    
                else if (e == 'i')answer+=res.get(e);                
        }
        System.out.println(answer);        
    }    
}
