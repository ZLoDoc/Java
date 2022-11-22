// Задача1 Вычислить сумму от 1 до N
package HomeWork;
import java.util.Scanner;

public class task1_HW_s1 { 
    
    
    
    public static void main(String[] args) {        
        int sum =0;
        // int result = 0
        Scanner input =  new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = input.nextInt();
        System.out.println(n);
        input.close();

        for (int i =0;i<=n;i++){
            sum += i;
        }        
        System.out.printf("Сумма чисел от 0 до " + n + " = %d \n",sum);
        
        System.out.printf("Произведение чисел от 0 до " + n + "  = %.1f",factorial(n));
    }              
        static double factorial(int n) {
            if (n == 0 || n == 1) {
               return 1;
            }
            else {
               return n * factorial(n - 1);
            }
        }
        
        

}
              
