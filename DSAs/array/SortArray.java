import java.util.Arrays;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        // Array of primitives for ascending order sorting
        int[] intArray = {5, 2, 8, 7, 1};
        
        // Sorting in ascending order
        Arrays.sort(intArray);
        System.out.println("Ascending Order: " + Arrays.toString(intArray));

        // Array of objects for descending order sorting
        Integer[] integerArray = {5, 2, 8, 7, 1};
        
        // Sorting in descending order
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(integerArray));

        Integer[] inttArray = {5, 2, 8, 1, 3};
Arrays.sort(inttArray, Comparator.reverseOrder());
System.out.println(Arrays.toString(intArray)); // Output: [8, 5, 3, 2, 1]
    }
}
// \
// The Arrays.sort(array, Collections.reverseOrder()) line will not work because Collections.reverseOrder()
//  requires an array of objects, not primitives. You need to use Integer[] instead of int[] for the descending order sorting.

