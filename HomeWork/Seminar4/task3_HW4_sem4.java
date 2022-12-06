// Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.
package HomeWork.Seminar4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3_HW4_sem4 {
    public static void main(String[] args) {
       
        double num1;
        double num2;
        int correct;
        Scanner input =  new Scanner(System.in);
        Map<Integer, String> db = new HashMap<>();
        
        num1 = getNum("Введите первое число: ");
        String value =Integer.toString((int)num1) ;
        db.put(1,value);
        System.out.printf("Вы ввели %d\n",(int)num1);
                 
        String operation = getOper("Введите знак действия: '+' , '-' , '*' , '/' : ");
        value = operation;
        db.put(2,value);
        
        System.out.printf("Вы ввели %s\n",operation);

    while(true){
        num2 = getNum("Введите второе число: ");
        System.out.printf("Вы ввели %d\n",(int)num2);        
        if (operation.equals("/") && num2 == 0 ){            
                System.out.printf("На ноль делить нельзя!\n");
            continue;
        }
        value = Integer.toString((int)num2);
        db.put(3,value);            
        break;
        }
    while(true){
        System.out.printf("Будет вычисленно выражение: %d %s %d ",(int)num1,operation,(int)num2);
        System.out.println();
        System.out.print("Для изменения ввода выберите '1, 2, 3' или '0' для вычисления  :");
        // System.out.println(db);
        for (HashMap.Entry entry: db.entrySet()) {

            System.out.printf("%s ",entry);
         
         }        correct = input.nextInt(); 

        if (correct == 1){
            System.out.print("Введите новое значение для первого числа :");
            num1 = input.nextInt();
        } 
        if (correct == 2){
            System.out.print("Введите новый операнд :");
            operation = input.next();

        } 
        if (correct == 3){
            System.out.print("Введите новое значение для второго числа :");
            num2 = input.nextInt();
        } 
        if (correct == 0) break;
        
    }   

    switch (operation) {
        case "+":
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case "-":
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case "*":
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;
        case "/":
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
               
    }   
    }     

    static String getOper(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        String s;
           
        while (true) {
            s = input.nextLine(); 
                        
            if (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                return s;
            }
            System.out.printf("Введите знак арифметического действия: ");
        }            
    }
    
    static double getNum(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);        
        while (!input.hasNextInt()) {
            System.out.printf("Введите правильное число :");
            input.next();
        }
        return input.nextInt();
    }
}
