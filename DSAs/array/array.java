package DSAs.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class array {

    public static void main(String[] args) {
        // Sample arrays for demonstration
        int[] intArray = {5, 2, 8, 7, 1};
        Integer[] integerArray = {5, 2, 8, 7, 1};
        String[] stringArray = {"apple", "banana", "cherry"};
        
        // 1. binarySearch(int[] array, int key)
        System.out.println("Index of 7 in intArray: " + Arrays.binarySearch(intArray, 7));
        
        // 2. binarySearch(Object[] array, Object key)
        Arrays.sort(integerArray); // Sorting is required for binarySearch
        System.out.println("Index of 7 in integerArray: " + Arrays.binarySearch(integerArray, 7));
        
        // 3. copyOf(int[] original, int newLength)
        int[] copiedArray = Arrays.copyOf(intArray, 10);
        System.out.println("Copied array with new length: " + Arrays.toString(copiedArray));
        
        // 4. copyOfRange(int[] original, int from, int to)
        int[] rangeArray = Arrays.copyOfRange(intArray, 1, 4);
        System.out.println("Range copied array: " + Arrays.toString(rangeArray));
        
        // 5. copyOfRange(Object[] original, int from, int to)
        String[] rangeStringArray = Arrays.copyOfRange(stringArray, 1, 3);
        System.out.println("Range copied string array: " + Arrays.toString(rangeStringArray));
        
        // 6. fill(int[] array, int value)
        Arrays.fill(intArray, 3);
        System.out.println("Filled intArray with 3: " + Arrays.toString(intArray));
        
        // 7. fill(int[] array, int fromIndex, int toIndex, int value)
        Arrays.fill(intArray, 1, 4, 9);
        System.out.println("Filled intArray from index 1 to 4 with 9: " + Arrays.toString(intArray));
        
        // 8. fill(Object[] array, Object value)
        Arrays.fill(stringArray, "filled");
        System.out.println("Filled stringArray with 'filled': " + Arrays.toString(stringArray));
        
        // 9. fill(Object[] array, int fromIndex, int toIndex, Object value)
        Arrays.fill(stringArray, 1, 2, "newValue");
        System.out.println("Filled stringArray from index 1 to 2 with 'newValue': " + Arrays.toString(stringArray));
        
        // 10. getLength(Object array) - Not a method in Arrays, length can be obtained using array.length
        System.out.println("Length of intArray: " + intArray.length);
        
        // 11. equals(int[] a, int[] b)
        int[] anotherIntArray = {5, 2, 8, 7, 1};
        System.out.println("Are intArray and anotherIntArray equal? " + Arrays.equals(intArray, anotherIntArray));
        
        // 12. equals(Object[] a, Object[] b)
        String[] anotherStringArray = {"filled", "newValue", "cherry"};
        System.out.println("Are stringArray and anotherStringArray equal? " + Arrays.equals(stringArray, anotherStringArray));
        
        // 13. hashCode(int[] array)
        System.out.println("Hash code of intArray: " + Arrays.hashCode(intArray));
        
        // 14. hashCode(Object[] array)
        System.out.println("Hash code of stringArray: " + Arrays.hashCode(stringArray));
        
        // 15. toString(int[] array)
        System.out.println("String representation of intArray: " + Arrays.toString(intArray));
        
        // 16. toString(Object[] array)
        System.out.println("String representation of stringArray: " + Arrays.toString(stringArray));
        
        // 17. asList(T... a)
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println("List from stringArray: " + stringList);
        
        // 18. sort(int[] array)
        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));
        
        // 19. sort(int[] array, int fromIndex, int toIndex)
        Arrays.sort(intArray, 1, 4);
        System.out.println("Partially sorted intArray from index 1 to 4: " + Arrays.toString(intArray));
        
        // 20. sort(Object[] array)
        Arrays.sort(stringArray);
        System.out.println("Sorted stringArray: " + Arrays.toString(stringArray));
        
        // 21. sort(Object[] array, Comparator<? super T> c)
        Arrays.sort(stringArray, Comparator.reverseOrder());
        System.out.println("Reverse sorted stringArray: " + Arrays.toString(stringArray));
        
        // 22. stream(int[] array)
        IntStream intStream = Arrays.stream(intArray);
        System.out.println("Sum of intStream: " + intStream.sum()); // Demonstrates stream operations
        
        // 23. stream(Object[] array)
        Stream<String> stringStream = Arrays.stream(stringArray);
        System.out.println("Count of stringStream: " + stringStream.count()); // Demonstrates stream operations
        
        // 24. parallelStream(int[] array)
        // 24. parallelStream(int[] array) - Not directly available; use IntStream for parallel streams
        IntStream parallelIntStream = Arrays.stream(intArray).parallel();
        System.out.println("Parallel sum of intStream: " + parallelIntStream.sum()); // Demonstrates parallel stream operations

        // 25. parallelStream(Object[] array) - Not directly available; convert to List first
        List<String> parallelStringList = Arrays.asList(stringArray);
        Stream<String> parallelStringStream = parallelStringList.parallelStream();
        System.out.println("Parallel count of stringStream: " + parallelStringStream.count()); // Demonstrates parallel stream operationsons
    }
}
