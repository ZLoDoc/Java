// Задание 4.
// Задано уравнение вида q + w = e, где q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
package HomeWork.Seminar1;
import java.util.Scanner;

public class task4_HW_s1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.printf("Введите уравнение q + w = e , где q, w, e >= 0. Можете добавить знак ? к символам q или w и комп сам подставит цифру для сходимости равенства:   ");
        String qwe = input.nextLine();                
        System.out.printf("%s \n",qwe);
        input.close();            
        String[] valArr = qwe.split(" ");
        int xq=-1;
        int xw=-1;
        int q=0;
        int w = 0;
        int num1 = -1;
        int num2 = -1;
        int res = -1;
        int temp = 0;
        

        for (int index = 0; index< valArr.length; index++) {
            int value = valArr[index].indexOf('?');
            if (index == 0 & value != -1)xq = value;//Сохраняем позицию знака вопроса в 1 числе
                if (xq == 0) q = Integer.parseInt(valArr[0].substring(1));
                if (xq == 1) q = Integer.parseInt(valArr[0].substring(0,1))*10;        
            
            if (index == 2 & value != -1) xw = value;//Сохраняем позицию знака вопроса во 2 числе
                if (xw == 0) w = Integer.parseInt(valArr[2].substring(1));
                if (xw == 1) w = Integer.parseInt(valArr[2].substring(0,1))*10;                
                
                if (index == 0 & value == -1) num1 = Integer.parseInt(valArr[index]);//Сохраняем значение первого числа если нет знака вопроса
                if (index == 2 & value == -1) num2 = Integer.parseInt(valArr[index]);//Сохраняем значение второго числа если нет знака вопроса
                if (index == 4) res = Integer.parseInt(valArr[index]);//Сохраняем значение результата                

            System.out.printf("index =%d ", index);
            System.out.printf("слово %s\n",valArr[index]);
            System.out.printf("value = %d",value);
           
        }
        System.out.printf("\nxq = %d, xw = %d ", xq, xw);
        System.out.printf("num1 = %d, num2 = %d, res = %d \n", num1, num2, res);
        System.out.printf("q = %d",q);
        System.out.printf("w = %d",w);

    }

    // public static int oneVariable(int num, int figure, int value, int res ) {
    
    // }

    // public static void dubleVariable(str num1) {
    
    // }

}
