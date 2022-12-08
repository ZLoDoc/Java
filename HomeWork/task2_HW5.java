// Задача2
// Пусть дан список сотрудников:
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package HomeWork;

import java.lang.foreign.VaList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class task2_HW5 {
    public static void main(String[] args) {

    Map <Integer,String> employers = new HashMap<>();      
    String temp;
    int count=0;
    String list = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
    System.out.println(list);   
    String[] valList = list.split(",");
    
    for(int i = 0;i<valList.length;i++){
   
    employers.put(i,valList[i]); 
    }
    System.out.println(employers.toString());

    for (Map.Entry keyz: employers.entrySet()) {
        temp = keyz.getValue().toString();
        temp = (temp.split(" "))[0];        
        keyz.
        // for (int i = 0; i< employers.size();i++){
            

        // // System.out.println("\n номер :" + key.getKey() + " \n сотрудник : " + key.getValue());
        // System.out.println( temp.split(" ").toString());
        // }
        
    }
}

}
