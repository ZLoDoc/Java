// Задача2
// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWork.Seminar4;

import java.util.LinkedList;

public class task2_HW4_sem4 {
    public static void main(String[] args) {
        String str1 = new String("First");
        String str2 = new String("Second");
        String str3 = new String("Third");
        String str4 = new String("Fourth");

        LinkedList<String> addList = new LinkedList<>();
        
        addList.add(str1);
        addList.add(str2);        
        // addList.add(str3);
        addList.add(str4);
        System.out.println("=================================");
        System.out.println("Изначально в списке нет третьего значения");
        prnList(addList);
        System.out.println("=================================");
        System.out.println("Добавляем третье значение в конец списка");
        enqueue(addList, str3);
        prnList(addList);
        System.out.println("=================================");
        System.out.println("Возвращаем первое значение и удаляем его из списка"); 
        System.out.println(dequeue(addList));
        System.out.println("И оно удалено из списка");
        prnList(addList); 
        System.out.println("=================================");
        System.out.println("Возвращаем первое значение и не удаляем из списка"); 
        System.out.println(first(addList));      
        prnList(addList); 
        
    }
    
    
    public static void prnList (LinkedList strList){
        System.out.println("=================================");
        for (int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
    }

    public static LinkedList <String> enqueue(LinkedList<String> str, String addVal){                    
        str.add(addVal);
        return str;       
    }
      
    public static  String dequeue(LinkedList str) {
        String firstElem =  (String)str.get(0);        
        str.remove(0);        
        return firstElem;
    }     
    public static String first(LinkedList str) {
        String firstElem =  (String)str.get(0);
        return firstElem;        
    }     
}
