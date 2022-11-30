// 4*. Каталог товаров книжного магазина сохранен
//  в виде двумерного списка List<ArrayList<String>> так,
//  что на 0й позиции каждого внутреннего списка содержится
//   название жанра, а на остальных позициях - названия книг. 
//   Напишите метод для заполнения данной структуры.
package HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task4_HW_s3 {
    public static void main(String[] args) {

    

        ArrayList<ArrayList<String>> shelf = new ArrayList<ArrayList<String>>();
        shelf.add(new ArrayList<String>());
        shelf.add(new ArrayList<String>(Arrays.asList()));
               
        shelf.get(0).add(0, "1");
        shelf.get(0).add( 1,"Предтечи");
        shelf.get(1).add(0, "2");
        shelf.get(1).add(1, "Пушкин");
        // shelf.get(1).add( 1,"Пушкин");
       
    //    System.out.println(shelf);
    for(int i = 0;i<shelf.size();i++){
        System.out.println( shelf.get(i).get(0));
         
    } 
       
      
       Scanner input =  new Scanner(System.in);
       System.out.printf("Выберите раздел: ");
       String n = input.nextLine().toUpperCase();
       System.out.println(n);

       if (shelf.contains(n)){
        System.out.println("Yes");
       }
    }
    
}
