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
        System.out.printf("Введите уравнение q + w = e , где q, w, e >= 0 но < 99.\nМежду значениями и знаками введите пробел\nМожете заменить одну из цифр в значениях q или w на знак ? \nи комп сам подставит цифру для сходимости равенства:   ");
        String qwe = input.nextLine();                
        // System.out.printf("%s \n",qwe);
        input.close();            
        String[] valArr = qwe.split(" ");
        int xq = -1;
        int xw = -1;
        int q = 0;
        int w = 0;
        int num1 = -1;
        int num2 = -1;
        int res = -1;
        

        for (int index = 0; index< valArr.length; index++) {
            int value = valArr[index].indexOf('?');//Проверяем наличие знака вопроса в элементе строки
            if (index == 0 & value != -1)xq = value;//Сохраняем позицию знака вопроса в 1 числе
                if (xq == 0) q = Integer.parseInt(valArr[0].substring(1));
                if (xq == 1) q = Integer.parseInt(valArr[0].substring(0,1))*10;        
            
            if (index == 2 & value != -1) xw = value;//Сохраняем позицию знака вопроса во 2 числе
                if (xw == 0) w = Integer.parseInt(valArr[2].substring(1));
                if (xw == 1) w = Integer.parseInt(valArr[2].substring(0,1))*10;                
                
                if (index == 0 & value == -1) num1 = Integer.parseInt(valArr[index]);//Сохраняем значение первого числа если нет знака вопроса
                if (index == 2 & value == -1) num2 = Integer.parseInt(valArr[index]);//Сохраняем значение второго числа если нет знака вопроса
                if (index == 4) res = Integer.parseInt(valArr[index]);//Сохраняем значение результата                

            
           
        }
        if (num1 == -1 & num2 == -1) doubleVariable(q,w,res) ;
        if (num1 != -1 || num2 != -1) oneVariable(num1,num2,q,w,res);
        
    }

    public static void oneVariable (int num1, int num2, int q, int w, int res ) {
        int count = 0;
        // System.out.printf("num1 = %d, num2 = %d, q = %d, w = %d, res = %d",num1,num2,q,w,res);
        if(num1 != -1 & num2 != -1){
            if(num1+num2==res){
                System.out.println("Равенство верно:");
                System.out.printf("\n%d + %d = %d",num1,num2,res);
                return;
            } 
            else{
                System.out.println("Не верное равенство");
                return;
            } 
        }
            System.out.println("\nВарианты решения: ");
            
                for (int i = 0; i<=9;i++){ 

                    if(num1 == -1 & q > 9){
                        if(q+i+num2==res){
                            System.out.printf("\n%d + %d = %d",q+i,num2,res);
                            count++;
                        } 
                    }
                    if(num1 == -1 & q < 10){
                        if(10*i+q+num2==res){
                            System.out.printf("\n%d + %d = %d",10*i+q,num2,res);
                            count++;
                        } 
                    }
                    if(num2 == -1 & w > 9){
                        if(num1+w+i==res){
                            System.out.printf("\n%d + %d = %d",num1,w+i,res);
                            count++;
                        } 
                    }
                    if(num2 == -1 & w < 10){
                        if(num1+10*i+w==res){
                            System.out.printf("\n%d + %d = %d",num1,10*i+w,res);
                            count++;
                        } 
                    }
                                      
                }
                if(count == 0) System.out.println("\nРешений нет"); 
    }

    public static void doubleVariable(int q, int w, int res) {
        int count = 0;        
        System.out.printf("q = %d, w = %d, res = %d",q,w,res);
            
            System.out.println("\nВарианты решения: ");
            for (int i = 0; i<=9;i++){
                for(int j = 0; j<=9;j++){
                    
                    if (q > 9 & w > 9){
                        if((q+i)+(w+j)==res){                        
                            System.out.printf("\n%d + %d = %d",q+i,w+j,res);
                            count++;
                        }
                    }
                    if (q > 9 & w < 10){                    
                        if((q+i)+(j*10+w)==res){                        
                            System.out.printf("\n%d + %d = %d",q+i,j*10+w,res);
                            count++;
                       }
                    }                             
                    if (q < 10 & w > 9){
                        if((i*10+q)+(w+j)==res){                        
                            System.out.printf("\n%d + %d = %d",i*10+q,w+j,res);
                            count++;
                       }
                    }
                    if (q < 10 & w < 10){                        
                        if(((10*i+q)+(10*j+w))==res){                                                       
                            System.out.printf("\n%d + %d = %d",10*i+q,10*j+w,res);
                            count++;
                       }
                    }
                }
            }
        if(count == 0) System.out.println("\nРешений нет");   
    }
}