import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            hashSet.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in HashSet of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
