// Задание3.Реализовать простой калькулятор
package HomeWork.Seminar1;
import java.util.Scanner;

public class task3_HW_s1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner input =  new Scanner(System.in);        
        num1 = getNum("Введите первое число: ");
        System.out.printf("Вы ввели %f\n",num1);
         
        String operation = getOper("Введите знак действия: '+' , '-' , '*' , '/' :");
        
        System.out.printf("Вы ввели %s\n",operation);

    while(true){
        num2 = getNum("Введите второе число: ");
        System.out.printf("Вы ввели %f\n",num2);        
        if (operation.equals("/") && num2 == 0 ){            
                System.out.printf("На ноль делить нельзя!\n");
            continue;
        }            
        break;
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
