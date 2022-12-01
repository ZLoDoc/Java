// 4*. Каталог товаров книжного магазина сохранен
//  в виде двумерного списка List<ArrayList<String>> так,
//  что на 0й позиции каждого внутреннего списка содержится
//   название жанра, а на остальных позициях - названия книг. 
//   Напишите метод для заполнения данной структуры.
package HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task4_HW_s3 {
    public static void main(String[] args) {    

        ArrayList<ArrayList<String>> shelf = new ArrayList<ArrayList<String>>();
        shelf.add(new ArrayList<String>());
        shelf.add(new ArrayList<String>(Arrays.asList()));
               
        shelf.get(0).add(0, "prose");
        shelf.get(0).add( 1,"bulat");
        shelf.get(1).add(0, "poems");
        shelf.get(1).add(1, "mtsyri");   

        while(true){
            for( int i=0;i<shelf.size();i++){
                System.out.println(shelf.get(i).get(0));
            }
            Scanner input =  new Scanner(System.in);
            System.out.println("Choise chapter:" );
            String chapter = input.nextLine().toLowerCase();    
            int currentSection=0;       
            for(int i = 0;i<shelf.size();i++){
                if (shelf.get(i).get(0).equals(chapter)){                                   
                    currentSection = i;                
                    break;                
                }                           
                else if(i == shelf.size()-1){
                    shelf.add(new ArrayList<String>(Arrays.asList(chapter)));                                       
                    currentSection = shelf.size()-1;
                    break;
                }
            }            
            System.out.println("Enter the name of the book : ");
            String bookName = input.nextLine().toLowerCase();
            if(!shelf.get(currentSection).contains(bookName)){                 
                shelf.get(currentSection).add(bookName);
            }                         
            System.out.println(shelf.toString());
            System.out.println(currentSection);
            System.out.println(shelf.get(currentSection).size());
            System.out.println(shelf.size());
        }
}
}
