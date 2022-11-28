// Задание1.
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package HomeWork.Seminar2;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;


public class task1_HW_s2 {
    public static void main(String[] args) {
        JSONObject resultJson = new JSONObject();        

        resultJson.put("name", "Ivanov");
        resultJson.put("country" , "Russia");
        resultJson.put("city", "Moscow");                        
        resultJson.put("age", "null");

        System.out.println(resultJson);

        JSONParser parser = new JSONParser();
        

       


        
    }
    
}
