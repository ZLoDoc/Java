package Seminar.Tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {public static void main(String[] args) {

    
   Person person1 = new Person(1, "Виталий Викторович", "Пшеничников", null, null);
   Person person2 = new Person(2, "Виктория Евгеньевна", "Бурдейная", 6, 5);
   Person person3 = new Person(3, "Алиса Витальевна", "Пшеничникова", 1, 2);
   Person person4 = new Person(4, "Майя Витальевна", "Пшеничникова", 1, 2);
   Person person5 = new Person(5, "Наталий Петровна", "Бурдейная", null, null);
   Person person6 = new Person(6, "Евгений Владимирович", "Бурдейный", null, null);

   List<Person> allPerson = new ArrayList<>(Arrays.asList(person1,person2,person3,person4,person5,person6));
   
   System.out.println(allPerson);
   

   Person investigate = new Person();
   Person child = new Person();

   Scanner input = new Scanner(System.in);
   System.out.println("Укажите ID человека из генеалогического древа: ");
   int id = input.nextInt();
   input.close();

   for (int index=0; index<allPerson.size();index++){
    if (id == allPerson.get(index).pesonID){
        investigate = allPerson.get(index);
    System.out.println(investigate);

    }
   } 
   for (int index=0; index<allPerson.size();index++){
    if (allPerson.get(index).parent1Id == investigate.pesonID || allPerson.get(index).parent2Id == investigate.pesonID){
        System.out.printf("\n%s ваш ребенок", allPerson.get(index).firstName);
        child = allPerson.get(index);
        
        for(int ind=0; ind < allPerson.size();ind++){
           
            if(allPerson.get(ind).parent1Id == child.pesonID){
                System.out.printf("\n%s ваш внук", allPerson.get(ind).firstName);

            }
        }
    }
   } 
}

    // System.out.println(person1+"\n\n"+ person2+"\n\n"+ person3+"\n\n"+ person4);
    
}
    

