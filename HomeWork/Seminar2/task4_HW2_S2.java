// Задание4
// К калькулятору из предыдущего дз добавить логирование.
package HomeWork.Seminar2;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class task4_HW2_S2 {

    public static Logger logger = Logger.getLogger(task4_HW2_S2.class.getName());
    public static void main(String[] args) throws SecurityException, IOException {
        
        
        Logger logger = Logger.getLogger(task4_HW2_S2.class.getName());
        
        
        FileHandler fh = new FileHandler("text.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // fh.setFormatter(xml);

        logger.log(Level.INFO,"Program started");
        
        
        
        
        
        
        double num2 = 0;
        Scanner input =  new Scanner(System.in);        
        double num1 = getNum("Введите первое число: ");
        logger.log(Level.INFO,"The first number {0} inputed " ,num1);
        System.out.printf("Вы ввели %f\n",num1);
         
        String operation = getOper("Введите знак действия: '+' , '-' , '*' , '/' :");
        logger.log(Level.INFO,"The arifmetical sign {0} inputed " ,  operation );
        System.out.printf("Вы ввели %s\n",operation);

    
        while(true){
        num2 = getNum("Введите второе число: ");
        logger.log(Level.INFO,"The second number {0} inputed " ,num2);
        System.out.printf("Вы ввели %f\n",num2);
        if (num2 !=0 && operation != "/") {            
            break;
        }
        System.out.printf("На ноль делить нельзя!\n");
        logger.log(Level.INFO,"Incorrect input will result in division by zero ");
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
            logger.log(Level.INFO,"The arithmetical sign {0} is't correct input" ,s);
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
