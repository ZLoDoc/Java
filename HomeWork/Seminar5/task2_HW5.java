// Задача2
// Пусть дан список сотрудников:
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package HomeWork.Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.Map;


public class task2_HW5 {
    public static void main(String[] args) {

    Map <Integer,String> employers = new HashMap<>();
    Map <String,Integer> frequensy= new HashMap<>();        
    String temp;
    int count=0;
    int max=0;
    String list = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";      
    String[] valList = list.split(",");    
    for(int i = 0;i<valList.length;i++){   
    employers.put(i,valList[i]); // MAP всех сотрудников
    }    
    //=============================================
 
    for (Map.Entry keyz: employers.entrySet()) {
        temp = keyz.getValue().toString().split(" ")[0];               
        for (Map.Entry key: employers.entrySet()) {        
            if(temp.equals((key.getValue().toString()).split(" ")[0])){
                count++;
                if (max<count) max=count; 
            }
            frequensy.put(temp, count);
        }
        count=0;
    }
    //=============================================

    int curNum;
    LinkedHashMap <String,Integer> result= new LinkedHashMap<>(); 
    if (max!=0);    
    {
        for (int i = max; i>0;i--){
            for (Map.Entry keyz: frequensy.entrySet()) 
            {
                curNum = (Integer)keyz.getValue();
                if (curNum == max)
                {
                    result.put((String)keyz.getKey(),(Integer)keyz.getValue());                     
                }                    
            }
            max--;
        }
    }

    String temp1;
    List resList = new ArrayList();
    for (Map.Entry key: result.entrySet()) {
        temp = key.getKey().toString();        
        for (Map.Entry keyz: employers.entrySet()) {
            temp1 = keyz.getValue().toString();            
            if(temp1.split(" ")[0].contains(temp)){
                resList.add(keyz.getValue());
            }                
        }            
    }    

    System.out.println("\n=======================================================================");        
    System.out.printf("Исходный список:\n %s",list);
    System.out.println("\n=======================================================================");     
    System.out.printf("Частота встречаемых имен:\n %s",result);
    System.out.println("\n=======================================================================");  
    System.out.printf("Список отсортированный по популярности имен:\n %s",resList);
    System.out.println("\n=======================================================================\n");
    for(int i = 0; i < resList.size(); i++) { 
        System.out.println(resList.get(i));
        }
    System.out.println("\n=======================================================================\n");
  
       
}
}


