package OOP.HomeWork.HWSeminar2;

// Реализовать, с учетом ооп подхода, приложение
// Для проведения исследований с генеалогическим древом.
// Идея: описать некоторое количество компонент, например:
// модель человека
// компонента хранения связей и отношений между людьми: родитель, ребёнок - классика,
// но можно подумать и про отношение, брат, свекровь, сестра и т. д.

// компонента для проведения исследований
// дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и
// сохранения в файл, 
// получение\построение отдельных моделей человека c “проведением исследования” можно 
// понимать получение всех детей выбранного человека.

// Используйя код написанный выше, необходимо гарантированно продумать иерархию компонент и
// взаимодействия их между собой.

// Обеспечить переход от использования явных классов в сторону использования абстрактных типов.
// Т е работаем не с:
// конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
// конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с
//  конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой
//  или хомяком т е с интерфейсом “животное”


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {public static void main(String[] args) {

    
   Person person1 = new Person(1, "Виталий Викторович", "Пшеничников","male", 7, 8);
   Person person2 = new Person(2, "Виктория Евгеньевна", "Пшеничникова","female", 6, 5);
   Person person3 = new Person(3, "Алиса Витальевна", "Пшеничникова","female", 1, 2);
   Person person4 = new Person(4, "Майя Витальевна", "Пшеничникова","female", 1, 2);
   Person person5 = new Person(5, "Наталия Петровна", "Бурдейная","female", null, null);
   Person person6 = new Person(6, "Евгений Владимирович", "Бурдейный","male", null, null);
   Person person7 = new Person(7, "Виктор Григорьевич", "Пшеничников","male", 9, 10);
   Person person8 = new Person(8, "Ирина Васильевна", "Пшеничникова","female", null, null);
   Person person9 = new Person(9, "Григорий Васильевич", "Пшеничников", "male", null, null);
   Person person10 = new Person(10, "Надежда Матвеевна", "Пшеничникова", "female", null, null);
   Person person11 = new Person(11, "Екатерина Евгеньевна", "Мельничук", "female", 6, 5);
   Person person12 = new Person(12, "Владимир Анатольевич", "Батарев", "male", 6, 5);


   List<Person> allPerson = new ArrayList<>(Arrays.asList(person1,person2,person3,person4,person5,person6,person7,person8,person9,person10,person11,person12));
   
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
        System.out.printf("\nИсследуемый объект: %s\n", investigate.firstName+" "+investigate.lastname );
    }
   } 
   
   for (int index=0; index<allPerson.size();index++){
    //родители
    
    if(allPerson.get(index).pesonID == investigate.parent1Id) System.out.printf("\n -папа - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
    if(allPerson.get(index).pesonID == investigate.parent2Id) System.out.printf("\n -мама - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
      
    //ребенок     
      if (allPerson.get(index).parent1Id == investigate.pesonID || allPerson.get(index).parent2Id == investigate.pesonID){
            child = allPerson.get(index);
            System.out.printf("\n -ваш ребенок - %s", child.firstName+" "+child.lastname);
            
            
            for(int ind=0; ind<allPerson.size();ind++){
                //супруг
                if(child.parent1Id == allPerson.get(ind).pesonID && child.parent1Id!=investigate.pesonID) 
                    marriage = allPerson.get(ind);
                if(child.parent2Id == allPerson.get(ind).pesonID && child.parent2Id!=investigate.pesonID) 
                    marriage = allPerson.get(ind);
               
            }              
            
        }
    }
            
    System.out.printf("\n -у вас брак с - %s ",marriage.firstName+" "+marriage.lastname);
    //тесть.теща.свекр.свекровь
    for(int index=0; index<allPerson.size();index++){  
        if (allPerson.get(index).pesonID == marriage.parent1Id && marriage.sex.equals("female"))
            System.out.printf("\n - тесть - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
        if (allPerson.get(index).pesonID == marriage.parent2Id && marriage.sex.equals("female"))
            System.out.printf("\n - теща - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
        if (allPerson.get(index).pesonID == marriage.parent1Id && marriage.sex.equals("male"))
            System.out.printf("\n - свекр - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);
        if (allPerson.get(index).pesonID == marriage.parent2Id && marriage.sex.equals("male"))
            System.out.printf("\n - свекровь - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname);        
    }
        //Внук
            for(int ind=0; ind < allPerson.size();ind++){           
                if(allPerson.get(ind).parent1Id == child.pesonID || 
                    allPerson.get(ind).parent2Id == child.pesonID)
                    
                System.out.printf("\n -ваш внук - %s", allPerson.get(ind).firstName+" "+allPerson.get(ind).lastname);
                
            }
        //Сестра брат
            for(int index=0; index < allPerson.size();index++){               
                
                // исключаю себя из списка брат сестра
                if (allPerson.get(index).parent1Id != null && 
                    allPerson.get(index).parent1Id == investigate.parent1Id && 
                    !allPerson.get(index).firstName.equals(investigate.firstName) && 
                    allPerson.get(index).sex.equals("male")) 
               
                System.out.printf("\n- брат - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname );                    
                
                if (allPerson.get(index).parent1Id != null && 
                    allPerson.get(index).parent1Id == investigate.parent1Id && 
                    !allPerson.get(index).firstName.equals(investigate.firstName) && 
                    allPerson.get(index).sex.equals("female")) 
                
                System.out.printf("\n- сестра - %s",allPerson.get(index).firstName+" "+allPerson.get(index).lastname );                    
                }

            

}   
}
    

