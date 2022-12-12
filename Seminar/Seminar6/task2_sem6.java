// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
//     можно использовать не все придуманные поля и методы. 
//     Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, 
// выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

package Seminar.Seminar6;
// import Seminar.Seminar6.katz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class task2_sem6 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM--dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis() - 3600000);
        System.out.println(formatter.format(date));
        
        katz firstCat = new katz(1, "Барсик");
        
        katz secondCat = new katz(2, "Борис");
        
        katz thirdCat = new katz(3, "Мурзик");
        
        System.out.println("=========================");
        firstCat.info();
        System.out.println("=========================");
        secondCat.info();
        System.out.println("=========================");
        thirdCat.info();
        

       

    
    }
}
 