import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListBasics {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding elements
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("Original ArrayList: " + arr);

        // Removing element using index
        arr.remove(0);

        System.out.println("After remove(): " + arr);

        // Creating another ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(101);
        list.add(102);

        // Merging lists
        arr.addAll(list);

        System.out.println("After addAll(): " + arr);

        // Removing collection elements
        arr.removeAll(list);

        System.out.println("After removeAll(): " + arr);

        // Size of lists
        System.out.println("Size of arr: " + arr.size());
        System.out.println("Size of list: " + list.size());

        // Printing list
        System.out.println("Printing list: " + list);

        // Clearing list
        list.clear();

        System.out.println("List size after clear(): " + list.size());

        // Iterator
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Accessing element
        System.out.println("Element at index 0: " + arr.get(0));

        // Updating element
        arr.set(0, 999);

        System.out.println("After set(): " + arr);

        // Checking element existence
        System.out.println("Contains 30? " + arr.contains(30));

        // Checking if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Finding index
        System.out.println("Index of 30: " + arr.indexOf(30));

        // Adding duplicate element
        arr.add(30);

        System.out.println("ArrayList after duplicate: " + arr);

        // Last occurrence index
        System.out.println("Last index of 30: " + arr.lastIndexOf(30));

        // Cloning ArrayList
        ArrayList<Integer> cloneList = (ArrayList<Integer>) arr.clone();

        System.out.println("Cloned ArrayList: " + cloneList);

        // Sublist
        System.out.println("SubList: " + arr.subList(0, 2));

        // Sorting
        Collections.sort(arr);

        System.out.println("Sorted ArrayList: " + arr);

        // Reversing
        Collections.reverse(arr);

        System.out.println("Reversed ArrayList: " + arr);

        // Maximum element
        System.out.println("Maximum element: " + Collections.max(arr));

        // Minimum element
        System.out.println("Minimum element: " + Collections.min(arr));

        // Enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}