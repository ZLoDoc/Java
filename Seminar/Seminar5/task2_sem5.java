// Задача2
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
package Seminar.Seminar5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task2_sem5 {
    public static void main(String[] args) {
        char[]open = new char[]{'(','{','[','<'};
        char[]close = new char[]{')','}',']','>'};
        Scanner input = new Scanner(System.in);
        char [] inp=input.nextLine().toLowerCase().toCharArray();
        Deque<Object> opn = new LinkedList<>();
        boolean result = true;

        for (char s:inp){
            {if(result)
                {
                for (int i = 0; i < open.length;i++)
                {
                    if(s == open[i])
                    {
                        opn.push(s);
                        System.out.println(opn);        
                    }
                    
                    else if(s == close[i])
                    {
                        if((char)opn.getFirst()==open[i])
                        {
                            opn.remove();
                        }
                        else
                        {
                            result = false;
                            break;
                        }

                    } 
                }
                }
                else break;
            }

        
    }
    System.out.println(result);
}
}