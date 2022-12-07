import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class temp3 
{
    public static void main(String[] args)
    {
        Deque<String> deque = new LinkedList<>();

        deque.add("Apple"); // Добавляет элемент Apple в конец очереди
        deque.addFirst("Orange"); // Добавляет элемент Orange в начало очереди
        deque.addLast("Pineapple"); // Добавляет элемент Pineapple в конец очереди
        System.out.println(deque.getFirst());  
        deque.remove();

        System.out.println(deque);
    }
}