//Задача 3.
//Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее из этого списка. 


package HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task3_HW_s3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.printf("Введите количество элементов списка: ");
        int n = input.nextInt();
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();        
        for (int i = 0; i<n;i++){
            list.add(rand.nextInt(10));
        }
        System.out.printf("Сгенерированный список :%s\n",list);
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        int mid = 0;
        int midPos = 0;
        for(int value : list){
            if(value<min) min = value;
            if(value>max) max = value;
            sum+=value;
        } 
        mid = sum/list.size();

        System.out.printf("Минимальное значение в списке min = %d\n",min);
        System.out.printf("Максимальное значение в списке max = %d\n",max);
        System.out.printf("Среднее арифметическое списка mid = %d\n",mid);
        boolean checkToMid = list.contains(mid);
        if(checkToMid){
            System.out.printf("Число равное среднему арифметическому присутствует в списке и у него индекс [%d]\n",list.indexOf(mid));
        }
        else{System.out.println("Число равное среднему арифметическому оттствует в списке");

        }
        
        
        if (list.size() %2 !=0){
            midPos = list.get(list.size()/2);System.out.printf("В середине списка стоит : %d\n",midPos);
        }
        else{
            midPos = list.get(list.size()/2);System.out.printf("В середине списка стоят : %d и %d\n",list.get(list.size()/2-1),midPos);
        }


        

        // System.out.printf("min=%d,max=%d,sum=%d,mid=%d",min,max,sum,mid);

        
    }
    
}
