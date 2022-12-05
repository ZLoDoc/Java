// Задача1
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
package HomeWork.Seminar4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        reverseList(addList);        
    }
        public static void reverseList(LinkedList str){
            // //The first variant
            // System.out.println("The first variant using For\n");
            // for (int i=str.size();i>=1;i--){
            //     System.out.println(str.get(i-1));
            // }
            // System.out.println("=================================");
            // System.out.println("The second variant using Iterator\n");
            // //The second variant
            // Iterator<String> iterator = str.descendingIterator();        
            // while(iterator.hasNext()){
            //  System.out.println(iterator.next());
            // }
            System.out.println("=================================");
            System.out.println("The third variant using ListIterator\n");
            ListIterator<String> listIterator = str.listIterator(str.size());
            while (listIterator.hasPrevious())
            {
                System.out.println(listIterator.previous());
            }
        }        
        
        
}
