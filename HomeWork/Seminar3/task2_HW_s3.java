// Задача2
// Пусть дан произвольный список целых чисел, удалить из него четные числа
package HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Random;

public class task2_HW_s3 { 
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i = 0; i<30;i++){
            list.add(rand.nextInt(10));
        }
        //Вариант решения 1        
        System.out.printf("Сгенерированный список :%s\n",list);
        for(int value: list){//Создает новый список без четных чисел
            if(value%2!=0){
                resList.add(value);                
            }
        }
        //Вариант решения 2
        for(int i=0;i<list.size();i++){//Удаляет четные числа из существующего списка
            if((list.get(i)%2)==0){             
            list.remove(i);
            i--;
            }
        }       
        System.out.printf("Существующий список с удаленными четными числами :%s\n",list);
        System.out.printf("Новый список с удаленными четными числами :%s",resList);       
    }     
}
