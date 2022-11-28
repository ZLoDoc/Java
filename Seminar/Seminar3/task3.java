// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        
ArrayList<Object> inArr = new ArrayList<>();
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);
inArr.add("s");
inArr.add(4);

ArrayList<Object> outArr = new ArrayList<>();


System.out.println("Исходный лист:");
System.out.println(inArr.toString());

for (Object object: inArr){
    if(!(object instanceof Integer)){
        outArr.add(object);        
    }
}
System.out.println("Результирующий лист:");
System.out.println(outArr.toString());

    }
    
}
