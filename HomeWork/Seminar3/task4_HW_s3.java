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
               
        shelf.get(0).add(0, "сказки");
        shelf.get(0).add( 1,"репка");
        shelf.get(1).add(0, "стихи");
        shelf.get(1).add(1, "кот");
        // shelf.get(1).add( 1,"Пушкин");
       
    //    System.out.println(shelf);
    for(int i = 0;i<shelf.size();i++){
       
        System.out.println( shelf.get(i).get(0));
         
    } 
       
      
       Scanner input =  new Scanner(System.in);
       System.out.printf("Выберите раздел: ");
       String n = input.nextLine().toLowerCase();
       System.out.println(n);
       boolean present = false;
       for(int i = 0;i<shelf.size();i++){

            if (shelf.get(i).get(0).equals(n)){
                present = true;
                System.out.println("lalalal");              // Проверяем есть ли введенный раздел n
                // System.out.println("Введите название книги : ");
                // String bookName = input.nextLine().toLowerCase();

                // if(!shelf.get(i).contains(bookName)){      // Проверяем есть ли такая книга
                //     shelf.get(i).add(bookName);
                // }
                // else{
                // System.out.println("Такая книга есть в списке");
                // }        
            }
            
        }
        if(present == false){
            shelf.add(new ArrayList<String>(Arrays.asList(n)));
            
                        
        }
       
       
       
    //    for(int i = 0;i<shelf.size();i++){
       
    //     System.out.println( shelf.get(i).get(0));
    //     System.out.println(shelf);
    // }
    System.out.println(shelf);
}
}
