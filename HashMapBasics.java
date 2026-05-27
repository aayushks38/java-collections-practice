import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {

        // =====================================================
        // 1) CREATE HASHMAP
        // =====================================================
        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("=== CREATE ===");
        System.out.println(map);


        // =====================================================
        // 2) put(key, value)
        // Inserts new pair or updates existing key
        // =====================================================
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("\n=== AFTER put() ===");
        System.out.println(map);

        // Updating existing key
        map.put(2, "TWO");
        System.out.println("After updating key 2:");
        System.out.println(map);


        // =====================================================
        // 3) get(key)
        // Returns value for the key
        // =====================================================
        System.out.println("\n=== get() ===");
        System.out.println("get(1): " + map.get(1));
        System.out.println("get(5): " + map.get(5)); // returns null


        // =====================================================
        // 4) containsKey(key)
        // Checks whether key exists
        // =====================================================
        System.out.println("\n=== containsKey() ===");
        System.out.println("containsKey(2): " + map.containsKey(2));
        System.out.println("containsKey(10): " + map.containsKey(10));


        // =====================================================
        // 5) containsValue(value)
        // Checks whether value exists
        // Slower than containsKey()
        // =====================================================
        System.out.println("\n=== containsValue() ===");
        System.out.println("containsValue(\"TWO\"): " + map.containsValue("TWO"));
        System.out.println("containsValue(\"Ten\"): " + map.containsValue("Ten"));


        // =====================================================
        // 6) getOrDefault(key, defaultValue)
        // If key not found, returns default
        // =====================================================
        System.out.println("\n=== getOrDefault() ===");
        System.out.println("getOrDefault(2, \"Zero\"): " + map.getOrDefault(2, "Zero"));
        System.out.println("getOrDefault(100, \"Zero\"): " + map.getOrDefault(100, "Zero"));


        // =====================================================
        // 7) putIfAbsent(key, value)
        // Adds only if key is not already present
        // =====================================================
        System.out.println("\n=== putIfAbsent() ===");
        map.putIfAbsent(3, "THREE");   // ignored because key 3 already exists
        map.putIfAbsent(4, "Four");    // added

        System.out.println(map);


        // =====================================================
        // 8) replace(key, value)
        // Replaces value only if key exists
        // =====================================================
        System.out.println("\n=== replace() ===");
        map.replace(1, "ONE");
        System.out.println(map);

        // replace(key, oldValue, newValue)
        map.replace(4, "Four", "FOUR");
        System.out.println(map);


        // =====================================================
        // 9) remove(key)
        // Removes key-value pair
        // =====================================================
        System.out.println("\n=== remove(key) ===");
        map.remove(3);
        System.out.println(map);


        // =====================================================
        // 10) remove(key, value)
        // Removes only if both key and value match
        // =====================================================
        System.out.println("\n=== remove(key, value) ===");
        boolean removed = map.remove(4, "FOUR");
        System.out.println("removed: " + removed);
        System.out.println(map);


        // =====================================================
        // 11) size(), isEmpty(), clear()
        // =====================================================
        System.out.println("\n=== size / isEmpty ===");
        System.out.println("size(): " + map.size());
        System.out.println("isEmpty(): " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("\nAfter clear(): " + map);
        System.out.println("isEmpty(): " + map.isEmpty());


        // =====================================================
        // 12) KEYSET, VALUES, ENTRYSET
        // =====================================================

        HashMap<Integer, String> demo = new HashMap<>();
        demo.put(10, "A");
        demo.put(20, "B");
        demo.put(30, "C");

        System.out.println("\n=== keySet() ===");
        for (int key : demo.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n=== values() ===");
        for (String value : demo.values()) {
            System.out.println(value);
        }

        System.out.println("\n=== entrySet() ===");
        for (Map.Entry<Integer, String> entry : demo.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // =====================================================
        // 13) FREQUENCY COUNTING PATTERN
        // =====================================================

        System.out.println("\n=== Frequency Counting ===");

        int[] arr = {1, 2, 1, 3, 2, 1};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);


        // =====================================================
        // 14) CHARACTER FREQUENCY
        // =====================================================

        System.out.println("\n=== Character Frequency ===");

        String s = "leetcode";
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charFreq);


        // =====================================================
        // 15) INDEX MAPPING PATTERN
        // Example: Two Sum style thinking
        // =====================================================

        System.out.println("\n=== Index Mapping ===");

        int[] nums = {2, 7, 11, 15};
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        System.out.println(indexMap);

        // Example lookup
        System.out.println("Index of 11: " + indexMap.get(11));


        // =====================================================
        // 16) ADVANCED: GROUPING PATTERN
        // Example: group by first letter
        // =====================================================

        System.out.println("\n=== Grouping Pattern ===");

        String[] words = {"apple", "ant", "bat", "ball", "cat"};
        HashMap<Character, ArrayList<String>> groups = new HashMap<>();

        for (String word : words) {
            char key = word.charAt(0);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(word);
        }

        System.out.println(groups);


        // =====================================================
        // 17) ADVANCED: ITERATE SAFELY WHILE READING
        // =====================================================

        System.out.println("\n=== Iterate Over Map Again ===");
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", 90);
        marks.put("Physics", 85);
        marks.put("CS", 95);

        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}