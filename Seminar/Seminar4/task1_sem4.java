// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
package Seminar.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task1_sem4 {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        LinkedList<Integer> arrList = new LinkedList<Integer>();
        long time=System.currentTimeMillis();
        for (int i = 0; i<=100_000;i++){
            arr.add(1);
        }
        System.out.println(System.currentTimeMillis() - time); 
        long time1=System.currentTimeMillis();
        for (int i = 0; i<=100_000;i++){
            arr.remove(0);
        }        
        System.out.println(System.currentTimeMillis() - time1);
        long time3=System.currentTimeMillis();
        for (int i = 0; i<=100_000;i++){
            arrList.add(1);
        }
        System.out.println(System.currentTimeMillis() - time3);
        long time4=System.currentTimeMillis();
        for (int i = 0; i<=100_000;i++){
            arrList.remove(0);
        }
        System.out.println(System.currentTimeMillis() - time4);
        
    
}
}
