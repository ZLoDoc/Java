// Задача1
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
package HomeWork.Seminar4;

import java.util.Iterator;
import java.util.LinkedList;

public class task1_HW4_sem4 {
    public static void main(String[] args) {
        String str1 = new String("Hello.");
        String str2 = new String("This is an example of");
        String str3 = new String("using a collection");
        String str4 = new String("used in the java language");

        LinkedList<String> addList = new LinkedList<>();
        addList.add(str1);        
        addList.add(str3);
        addList.add(str4);
        addList.add(1,str2);
       
        System.out.println("=================================");
        for (int i=0;i<addList.size();i++){
            System.out.println(addList.get(i));
        }

        System.out.println("=================================");        
        Iterator<String> iterator = reverseList(addList).listIterator();        
        while(iterator.hasNext()){
             System.out.println(iterator.next());
            }
        System.out.println("=================================");         
    }
        public static LinkedList <String>  reverseList(LinkedList<String> str){        
            LinkedList<String> reversList = new LinkedList<>();            
            for (int i=str.size();i>=1;i--){
                reversList.add(str.get(i-1));
            }
            return reversList;       
           
        }               
        
}
