// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
package Seminar.Seminar4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class task4_sem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Введите слова через пробел: ");
String input = sc.nextLine();
String[] inputArray = input.split(" ");
System.out.println(Arrays.toString(inputArray));
Stack<String> stackInput = new Stack<>();
for (String s: inputArray) {
stackInput.add(s);
}
System.out.println(stackInput);

Queue<String> queueInput = new LinkedList<>();
for (String s: inputArray) {
queueInput.add(s);
}
System.out.println(queueInput);
        
    }
    
}
