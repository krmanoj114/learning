import java.util.HashMap;
import java.util.Map;

public class HashBasedSearchExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alice", 42);
        map.put("Bob", 35);

        String key = "Jane";

        if (map.containsKey(key)) {
            int value = map.get(key);
            System.out.println("Value for key " + key + ": " + value);
        } else {
            System.out.println("Key not found");
        }
    }
}