import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics{

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original LinkedList: " + list);

        // Adding element at first position
        list.addFirst(5);

        // Adding element at last position
        list.addLast(40);

        System.out.println("After addFirst() and addLast(): " + list);

        // Removing elements
        list.remove();

        System.out.println("After remove(): " + list);

        // Removing first and last element
        list.removeFirst();
        list.removeLast();

        System.out.println("After removeFirst() and removeLast(): " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 0: " + list.get(0));

        // Updating element
        list.set(0, 999);

        System.out.println("After set(): " + list);

        // Checking element existence
        System.out.println("Contains 30? " + list.contains(30));

        // Finding index
        System.out.println("Index of 30: " + list.indexOf(30));

        // Adding duplicate element
        list.add(30);

        System.out.println("LinkedList after duplicate: " + list);

        // Last occurrence index
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // Size of LinkedList
        System.out.println("Size of LinkedList: " + list.size());

        // Iterator
        Iterator<Integer> iterator = list.iterator();

        System.out.println("Using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (Integer num : list) {
            System.out.println(num);
        }

        // Cloning LinkedList
        LinkedList<Integer> cloneList = (LinkedList<Integer>) list.clone();

        System.out.println("Cloned LinkedList: " + cloneList);

        // SubList
        System.out.println("SubList: " + list.subList(0, 2));

        // Sorting
        Collections.sort(list);

        System.out.println("Sorted LinkedList: " + list);

        // Reversing
        Collections.reverse(list);

        System.out.println("Reversed LinkedList: " + list);

        // Maximum element
        System.out.println("Maximum element: " + Collections.max(list));

        // Minimum element
        System.out.println("Minimum element: " + Collections.min(list));

        // Clearing LinkedList
        list.clear();

        System.out.println("LinkedList after clear(): " + list);

        // Checking if empty
        System.out.println("Is LinkedList empty? " + list.isEmpty());
    }
}