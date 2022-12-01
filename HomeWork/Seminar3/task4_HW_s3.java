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
            System.out.println("There are sections : "); 
            for( int i=0;i<shelf.size();i++){
                System.out.println(shelf.get(i).get(0));
            }

            Scanner input =  new Scanner(System.in);
            System.out.print("Select a section or enter a new one : " );
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
            System.out.print("Enter the name of the book : ");
            String bookName = input.nextLine().toLowerCase();
            
            if(!shelf.get(currentSection).contains(bookName)){                 
                shelf.get(currentSection).add(bookName);
                for(int i =1;i<shelf.get(currentSection).size();i++)
                System.out.printf("Others book in this collection : %s\n",shelf.get(currentSection).get(i));
            }
            else{
                System.out.printf("This book is present in the collection : %s\n",shelf.get(currentSection).get(0));                
                for(int i =1;i<shelf.get(currentSection).size();i++)
                System.out.printf("Others book in this collection : %s\n",shelf.get(currentSection).get(i));             
            }            
            System.out.println("=====================================================");
            
        }
}
}
