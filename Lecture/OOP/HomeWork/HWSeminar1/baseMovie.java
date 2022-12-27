package Lecture.OOP.HomeWork.HWSeminar1;

import java.util.HashSet;

public class baseMovie {

    HashSet<movie> allMovie = new HashSet<movie>();

    public baseMovie() {
    }
    
    protected void addMovie(movie film){
        allMovie.add(film);
    }    

    protected void getStorage(){
        movie film1 = new movie();
        film1.name = "Spiderman 1"; 
        film1.genre = "Детский";
        movie film2 = new movie();
        film2.name = "Spiderman 2"; 
        film2.genre = "Подростковый";
        addMovie(film1);
        addMovie(film2);
    }

    public void setAllMovie(HashSet<movie> allMovie) {
        this.allMovie = allMovie;
    }

    public HashSet<movie> getAllMovie() {
        return allMovie;
    }    
}
