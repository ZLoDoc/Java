// Задание 2. Вывести все простые числа от 1 до 1000
package HomeWork.Seminar1;
import java.util.Scanner;

public class task2_HW1_s1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = input.nextInt();        
        input.close();
        int count=0;        
        System.out.printf("Простые числа от 0 до %d: ",n);
        for (int i=2; i<=n;i++){
            for(int j=2; j<=i;j++){                
                if (i%j==0){
                    count+=1;
                }                
            }
            if (count==1) System.out.printf("%d ",i); 
            count=0;           
        }
    }
}
