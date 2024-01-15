import java.util.HashMap;

public class HashMapHelper {
    public static void main(String[] args) {
        // a HashMap is similar to a dictionary in Python
        // key:value pairs
        HashMap<String, String> wordsDefs = new HashMap<String, String>();
        wordsDefs.put("algorithm", "step by step instructions");
        wordsDefs.put("array", "a static list");

        System.out.println(wordsDefs);

        System.out.println(wordsDefs.get("algorithm"));
    }
}
