// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import java.util.*;

public class task2 {

    public static void main(String[] args) {
        String[] solarSystem = {"Меркурий", "Венера", "Земля", "Марс" , "Юпитер" , "Сатурн" , "Нептун"};


        ArrayList <String> myList = new ArrayList<>();

        Random rand = new Random();
        int size = rand.nextInt(1000);
        System.out.println(size);
        for (int i = 0; i < size; i++) {

            int n = rand.nextInt(7);
            myList.add(solarSystem[n]);
        }
            System.out.println(myList);

        HashMap <String, Integer> answer = new HashMap() ;

        for (int i = 0; i < myList.size(); i++) {

            if (!answer.containsKey(myList.get(i))) {
            answer.put(myList.get(i), 1);
        }
            else {
                answer.put(myList.get(i), answer.get(myList.get(i)) + 1);
            }
    }
        System.out.println(answer.toString());
}}
