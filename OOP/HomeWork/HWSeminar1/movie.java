package OOP.HomeWork.HWSeminar1;

import java.util.Scanner;

public class movie {
    protected  String name;
    protected String genre;
    protected String country;          
    
    public movie() {
    }

    public movie(String name) {
        this.name = name;
    }

    public movie(String name, String genre) {
        this.name = name;
        this.genre = genre;     
    }       
    
    protected void movieInfo(){
        System.out.println("Название фильма: "+name+"\nЖанр: "+genre);
    }

   protected movie createMovie(){
                Scanner input =  new Scanner(System.in);   
                movie newFilm = new movie();
                System.out.print("Введите название фильма: ");
                newFilm.name = input.nextLine(); 
                System.out.print("Введите жанр: ");
                newFilm.genre = input.nextLine();
            return newFilm;    
                
   }

}

