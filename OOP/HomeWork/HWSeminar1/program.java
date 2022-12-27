// Прошу вас написать приложение,
// которое хранит информацию о фильмах
// и позволяет получaть все детали о них.
// +реализовать поиск по части имени фильма
package OOP.HomeWork.HWSeminar1;

import java.util.HashSet;
import java.util.Scanner;

public class program {public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);    
    baseMovie base = new baseMovie();
    base.getStorage();       
    String movieName;
    while (true){
        System.out.println("-------------------------");
        System.out.println("1 - Список фильмов");
        System.out.println("2 - Веести имя фильма для получения информации");
        System.out.println("3 - Добавить фильм");   
        System.out.println("-------------------------");
        System.out.print("Ваш выбор: ");
        
        String key = input.nextLine(); 
        System.out.println("-------------------------");

        switch(key){
            case ("1"):
                for( movie index: base.allMovie){                    
                    System.out.println(index.name);                    
                }
                continue;
            case ("2"):            
            System.out.print("Введите название фильма: ");
                 movieName = input.nextLine();                 
                for(movie index : base.allMovie){                                                
                    if(index.name.toLowerCase().contains(movieName.toLowerCase())){ 
                        System.out.println("---------------------------");                       
                        index.movieInfo();                        
                    }
                }
                continue;
                case ("3"):
                
                movie newFilm = new movie();               
                base.addMovie(newFilm.createMovie());
                newFilm.movieInfo();
                continue;    

        }
    }
}   
}
