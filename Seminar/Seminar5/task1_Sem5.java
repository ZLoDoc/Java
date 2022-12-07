// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
// если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву
// во втором слове, при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с 
// сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true
package Seminar.Seminar5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task1_Sem5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите первое слово :");
        String word1 = userInput.nextLine().toLowerCase();
        System.out.println("Введите второе слово :");
        String word2 = userInput.nextLine().toLowerCase();

        char[]word1Char = word1.toCharArray();
        char[]word2Char = word2.toCharArray();

        boolean wrongInput = word1.length() != word2.length();
        Map<Integer,String> tempValue = new HashMap<>();
        ArrayList<Character> tempLetters = new ArrayList<Character>();
        if (!wrongInput){
            String tempWord1 = word1;
            for (int i = 0;i<word2.length();i++){
                if(! tempLetters.contains(word2Char[i])){
                    tempWord1 = tempWord1.replace(word1Char[i], word2Char[i]);
                    tempValue.put(i,tempWord1);
                    tempLetters.add(word2Char[i]);
                }
            }
            wrongInput = ! tempValue.containsValue(word2);
        }
if(wrongInput){
    System.out.printf("Слово %s не является изоморфом слова %s", word1,word2);
}
else{
    System.out.printf("Слово %s является изоморфом слова %s",word1,word2);
}
userInput.close();

}        
}
    

