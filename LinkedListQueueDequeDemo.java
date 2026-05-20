import java.util.*;

public class LinkedListQueueDequeDemo {

    public static void main(String[] args) {
        demoLinkedListAsList();
        demoQueue();
        demoDeque();
    }
    // --------------------------------------------------
    // 1) LinkedList as Queue
    // Queue = FIFO (First In, First Out)
    // --------------------------------------------------
    private static void demoQueue() {
        System.out.println("=== LinkedList as Queue ===");

        Queue<Integer> q = new LinkedList<>();

        // offer() -> add element
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // peek() -> front element without removing
        System.out.println("peek(): " + q.peek());

        // poll() -> remove front element
        System.out.println("poll(): " + q.poll());
        System.out.println("After poll(): " + q);

        // add() also works, but offer() is preferred in queue problems
        q.add(40);
        System.out.println("After add(40): " + q);

        // remove() -> removes front (throws exception if empty)
        System.out.println("remove(): " + q.remove());
        System.out.println("After remove(): " + q);

        // element() -> front element without removing (throws exception if empty)
        System.out.println("element(): " + q.element());

        // size(), isEmpty()
        System.out.println("size(): " + q.size());
        System.out.println("isEmpty(): " + q.isEmpty());

        q.clear();
        System.out.println("After clear(): " + q);
        System.out.println();
    }

    // --------------------------------------------------
    // 2) LinkedList as Deque
    // Deque = Double Ended Queue
    // add/remove from both front and back
    // --------------------------------------------------
    private static void demoDeque() {
        System.out.println("=== LinkedList as Deque ===");

        Deque<Integer> dq = new LinkedList<>();

        // addFirst() / addLast()
        dq.addFirst(20);
        dq.addLast(40);
        dq.addFirst(10);
        dq.addLast(50);

        System.out.println("Deque: " + dq);

        // offerFirst() / offerLast()
        dq.offerFirst(5);
        dq.offerLast(60);
        System.out.println("After offerFirst(5), offerLast(60): " + dq);

        // peekFirst() / peekLast()
        System.out.println("peekFirst(): " + dq.peekFirst());
        System.out.println("peekLast(): " + dq.peekLast());

        // pollFirst() / pollLast()
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println("After pollFirst() and pollLast(): " + dq);

        // getFirst() / getLast()
        System.out.println("getFirst(): " + dq.getFirst());
        System.out.println("getLast(): " + dq.getLast());

        // removeFirst() / removeLast()
        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + dq);

        // descendingIterator()
        System.out.print("descendingIterator(): ");
        Iterator<Integer> it = dq.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // size(), isEmpty()
        System.out.println("size(): " + dq.size());
        System.out.println("isEmpty(): " + dq.isEmpty());

        dq.clear();
        System.out.println("After clear(): " + dq);
        System.out.println();
    }
}