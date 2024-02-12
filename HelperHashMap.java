import java.util.HashMap;

public class HelperHashMap {
    public static void main(String[] args) {
        // a HashMap is similar to a dictionary in Python
        // key:value pairs
        HashMap<String, String> wordsDefs = new HashMap<String, String>();
        
        // primary methods: .put() and .get()
        wordsDefs.put("algorithm", "step by step instructions");
        wordsDefs.put("array", "a static list");
        System.out.println(wordsDefs);
        System.out.println(wordsDefs.get("algorithm"));

        // TODO
        // use .put() and .get() one more time
        


    }
}
