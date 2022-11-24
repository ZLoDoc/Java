package Seminar.Seminar2;

import java.util.Scanner;

public class task1_Sem2 {
    public static void main(String[] args) {
        
        
        
        String c1 = "1";
        String c2 = "0";
        int userInt = -1;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Введите число N, для формирования строки чередующихся символов");
        userInt = userInput.nextInt();

        StringBuffer myBuilder = new StringBuffer();

        for (int i = 0; i<= userInt; i++){
            if(i%2==0){
                myBuilder.append(c1);
            }
            else{
                myBuilder.append(c2);
            }
        }
        System.out.println(myBuilder);
        // System.out.printf());


        

    }
}
