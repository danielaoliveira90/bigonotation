import java.util.ArrayList;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            arrayList.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in ArrayList of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
