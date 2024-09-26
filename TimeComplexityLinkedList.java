import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            linkedList.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for inserting one element at the head
            startTime = System.nanoTime();
            linkedList.addFirst(-1);  // Inserting at head
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for inserting at the head in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for inserting one element at the tail
            startTime = System.nanoTime();
            linkedList.addLast(size + 1);  // Inserting at tail
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for inserting at the tail in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting one element from the head
            startTime = System.nanoTime();
            linkedList.removeFirst();  // Deleting from head
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deleting from the head in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting one element from the tail
            startTime = System.nanoTime();
            linkedList.removeLast();  // Deleting from tail
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deleting from the tail in LinkedList of size " + size + ": " + duration + " nanoseconds");

        }
    }
}
