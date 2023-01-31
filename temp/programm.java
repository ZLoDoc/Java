package temp;

import java.util.Iterator;

public class programm {
    public static void main(String[] args) {
        Baloon baloon = new Baloon(1, "red");

        Iterator <String> choise = baloon;
        
        while(choise.hasNext()){
            System.out.println(baloon.next());
            


        }
    }
    
}
