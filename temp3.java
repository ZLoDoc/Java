import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
 
class Main
{
    public static void main(String[] args)
    {
        Map<String, String> country = new HashMap<>();
 
        country.put("India", "New Delhi");
        country.put("USA", "Washington D.C.");
        country.put("Japan", "Tokyo");
        country.put("China", "Beijing");
 
        // Сортировка карты по значениям с использованием Java 8 Stream
        country = country.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue,
                                        LinkedHashMap::new
                    ));
 
        System.out.println("Sorted map by values: " + country);
    }
}