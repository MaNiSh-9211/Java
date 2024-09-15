import java.util.*;

public class vector {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");  // Adds element to the end of the vector
        vector.add("Banana");
        vector.add("Cherry");

        // Add element at specific index
        vector.add(1, "Mango");  // Adds "Mango" at index 1, shifts other elements

        // Access elements from the Vector
        System.out.println("Element at index 2: " + vector.get(2));  // Retrieves element at index 2

        // Update an element at a specific index
        vector.set(2, "Orange");  // Replaces element at index 2 with "Orange"

        // Remove an element by index
        vector.remove(3);  // Removes element at index 3 ("Cherry")

        // Remove an element by value
        vector.remove("Apple");  // Removes the first occurrence of "Apple"

        // Check if the Vector contains a specific element
        boolean containsMango = vector.contains("Mango");
        System.out.println("Contains 'Mango': " + containsMango);

        // Get the size of the Vector
        System.out.println("Size of Vector: " + vector.size());

        // Iterate over the elements using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate over the elements using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Get the first and last element
        System.out.println("First element: " + vector.firstElement());  // Retrieves the first element
        System.out.println("Last element: " + vector.lastElement());    // Retrieves the last element

        // Get the index of a specific element
        int index = vector.indexOf("Orange");  // Finds the index of the first occurrence of "Orange"
        System.out.println("Index of 'Orange': " + index);

        // Get the last index of a specific element
        vector.add("Mango");  // Add "Mango" again to demonstrate lastIndexOf
        int lastIndex = vector.lastIndexOf("Mango");  // Finds the index of the last occurrence of "Mango"
        System.out.println("Last index of 'Mango': " + lastIndex);

        // Check if the Vector is empty
        boolean isEmpty = vector.isEmpty();  // Checks if the vector is empty
        System.out.println("Is Vector empty: " + isEmpty);

        // Clear all elements from the Vector
        vector.clear();  // Removes all elements from the vector
        System.out.println("Size after clearing: " + vector.size());

        // Adding elements to demonstrate additional methods
        vector.addAll(Arrays.asList("Grapes", "Watermelon", "Papaya"));

        // Clone the Vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();  // Creates a shallow copy of the vector
        System.out.println("Cloned Vector: " + clonedVector);

        // Get a sublist of the Vector (from index 1 to 2)
        List<String> subList = vector.subList(1, 3);  // Creates a view of the vector between index 1 and 3 (exclusive)
        System.out.println("Sublist of Vector: " + subList);

        // Sort the Vector
        Collections.sort(vector);  // Sorts the vector in natural order (alphabetically for strings)
        System.out.println("Sorted Vector: " + vector);


        Collections.sort(vector, Collections.reverseOrder());

        Collections.sort(vector, Comparator.reverseOrder());



        // Ensure capacity (useful when you know the number of elements in advance)
        vector.ensureCapacity(10);  // Ensures that the vector can hold at least 10 elements without resizing

        // Trim the capacity to the current size
        vector.trimToSize();  // Trims the capacity of the vector to be the vector's current size
    }
}
