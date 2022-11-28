package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.Random;
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        Random rnd = new Random();
        for (int i =0;i<10;i++){
            arr.add(rnd.nextInt(99));
        }
        System.out.println(arr.toString());
        arr.sort(null);
        System.out.println(arr.toString());
    }
    
}
