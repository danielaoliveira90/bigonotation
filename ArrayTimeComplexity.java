import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];
            int j = 1;

            // Fill the array with integers
            for (int i = 0; i < 10; i++) {
                array[i] = j;
                j++;

            }

//             Measure time for search operation
            long startTime = System.nanoTime();

            // Searching for the last element
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == size - 1) {
                    found = true;
                    break;
                }
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search by index in array of size " + size + ": " + duration + " nanoseconds");
//            System.out.println("The value of index 0 is: " + array[0]);

            // Measure time for inserting a new element at the tail
            long startTimeNew = System.nanoTime();

            // Simulate inserting an element at the tail (resize array if necessary)
            int[] newArray = Arrays.copyOf(array, size + 1); // This simulates resizing
            newArray[size] = size + 1; // Insert new element at the tail

            long endTimeNew = System.nanoTime();
            duration = endTimeNew - startTimeNew;
            System.out.println("Time taken for inserting at the tail in array of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting an element at the tail
            long startTimeDel = System.nanoTime();

            // Simulate deleting the element at the tail (resize array)
            int[] smallerArray = Arrays.copyOf(newArray, size); // Remove the last element

            long endTimeDel = System.nanoTime();
            duration = endTimeDel - startTimeDel;
            System.out.println("Time taken for deleting the element at the tail in array of size " + size + ": " + duration + " nanoseconds");

        }
    }
}

