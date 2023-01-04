import java.util.*;
import java.util.Map.Entry;

public class MapDemo{
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        try {
            map.put(123, "abs");
            map.put(345, "efg");
            map.put(567, "hij");
            map.put(678, "klm");

            String value = map.get(345);
            System.out.println("Value is: " + value);

            Set<Entry<Integer, String>> entries = map.entrySet();

            for (Entry<Integer, String> entry : entries){

                System.out.println(entry.getKey() + " " + entry.getValue());

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

