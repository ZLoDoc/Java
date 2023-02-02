package Seminar.Tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {public static void main(String[] args) {

    
   Person person1 = new Person(1, "Виталий Викторович", "Пшеничников", 7, 8);
   Person person2 = new Person(2, "Виктория Евгеньевна", "Пшеничникова", 6, 5);
   Person person3 = new Person(3, "Алиса Витальевна", "Пшеничникова", 1, 2);
   Person person4 = new Person(4, "Майя Витальевна", "Пшеничникова", 1, 2);
   Person person5 = new Person(5, "Наталий Петровна", "Бурдейная", null, null);
   Person person6 = new Person(6, "Евгений Владимирович", "Бурдейный", null, null);
   Person person7 = new Person(7, "Виктор Григорьевич", "Пшеничников", null, null);
   Person person8 = new Person(8, "Ирина Васильевна", "Пшеничникова", null, null);


   List<Person> allPerson = new ArrayList<>(Arrays.asList(person1,person2,person3,person4,person5,person6,person7,person8));
   
//    System.out.println(allPerson);
   

   Person investigate = new Person();//исследуемый объект
   Person child = new Person();//дети
   Person marriage = new Person();//с кем брак

   Scanner input = new Scanner(System.in);
   System.out.println("Укажите ID человека из генеалогического древа: ");
   for (int index=0; index<allPerson.size();index++){
    System.out.printf("%s - %s %s\n",allPerson.get(index).pesonID,allPerson.get(index).firstName,allPerson.get(index).lastname); 
   }
   int id = input.nextInt();
   input.close();

   for (int index=0; index<allPerson.size();index++){
    if (id == allPerson.get(index).pesonID){
        investigate = allPerson.get(index);
    System.out.println(investigate);
    }
   } 
   
   for (int index=0; index<allPerson.size();index++){
    if(allPerson.get(index).pesonID == investigate.parent1Id) System.out.printf("\n -папа - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
    if(allPerson.get(index).pesonID == investigate.parent2Id) System.out.printf("\n -мама - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
      //ребенок 
    if (allPerson.get(index).parent1Id == investigate.pesonID || allPerson.get(index).parent2Id == investigate.pesonID){
            child = allPerson.get(index);
            System.out.printf("\n -ваш ребенок - %s", child.firstName+" "+child.lastname);
            
            //супруг
            for(int ind=0; ind<allPerson.size();ind++){
                
                if(child.parent1Id == allPerson.get(ind).pesonID && child.parent1Id!=investigate.pesonID) marriage = allPerson.get(ind);
                if(child.parent2Id == allPerson.get(ind).pesonID && child.parent2Id!=investigate.pesonID) marriage = allPerson.get(ind);
               
            }              
            
        }
    }
            
    System.out.printf("\n -у вас брак с - %s ",marriage.firstName+" "+marriage.lastname);
    
    
        //Внук
            for(int ind=0; ind < allPerson.size();ind++){           
                if(allPerson.get(ind).parent1Id == child.pesonID || allPerson.get(ind).parent2Id == child.pesonID){
                    System.out.printf("\n -ваш внук - %s", allPerson.get(ind).firstName+" "+allPerson.get(ind).lastname);
                }
            }
    
    

}   
}
    
