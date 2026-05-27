import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {

        // =====================================================
        // CREATE HASHSET
        // =====================================================

        HashSet<Integer> set = new HashSet<>();


        // =====================================================
        // add()
        // Adds element into HashSet
        // =====================================================

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("After add(): " + set);


        // =====================================================
        // Duplicate values are ignored
        // =====================================================

        set.add(10);

        System.out.println("After duplicate add(10): " + set);


        // =====================================================
        // contains()
        // Checks if element exists
        // =====================================================

        System.out.println("contains(20): " + set.contains(20));
        System.out.println("contains(100): " + set.contains(100));


        // =====================================================
        // remove()
        // Removes element
        // =====================================================

        set.remove(20);

        System.out.println("After remove(20): " + set);


        // =====================================================
        // size()
        // Returns total elements
        // =====================================================

        System.out.println("size(): " + set.size());


        // =====================================================
        // isEmpty()
        // Checks whether set is empty
        // =====================================================

        System.out.println("isEmpty(): " + set.isEmpty());


        // =====================================================
        // Traversing HashSet
        // =====================================================

        System.out.println("Traversing:");

        for(int num : set) {
            System.out.println(num);
        }


        // =====================================================
        // clear()
        // Removes all elements
        // =====================================================

        set.clear();

        System.out.println("After clear(): " + set);


        // =====================================================
        // HashSet with String
        // =====================================================

        HashSet<String> names = new HashSet<>();

        names.add("Aayush");
        names.add("Rahul");
        names.add("Aman");

        System.out.println("String HashSet: " + names);


        // =====================================================
        // IMPORTANT DSA PATTERN
        // Duplicate Detection
        // =====================================================

        int[] arr = {1,2,3,1};

        HashSet<Integer> seen = new HashSet<>();

        boolean duplicate = false;

        for(int num : arr) {

            if(seen.contains(num)) {

                duplicate = true;

                break;
            }

            seen.add(num);
        }

        System.out.println("Duplicate Found: " + duplicate);


        // =====================================================
        // Jewels and Stones Pattern
        // =====================================================

        String jewels = "aA";
        String stones = "aAAbbbb";

        HashSet<Character> jewelSet =
                new HashSet<>();

        for(int i = 0; i < jewels.length(); i++) {

            jewelSet.add(jewels.charAt(i));
        }

        int count = 0;

        for(int i = 0; i < stones.length(); i++) {

            if(jewelSet.contains(stones.charAt(i))) {

                count++;
            }
        }

        System.out.println("Jewels Count: " + count);
    }
}
