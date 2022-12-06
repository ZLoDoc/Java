// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
package Seminar.Seminar4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;



public class task3_sem4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
String input = "";
while (!input.contains("exit")) {
    input = scanner.next();
    if (input.contains("print")) {
        for (String el:deque) {
            System.out.println(el);
        }
    } else if (input.contains("revert")) {
    deque.removeFirst();
    } else {
    deque.addFirst(input);
    
    }
}




        
    }
    
}
