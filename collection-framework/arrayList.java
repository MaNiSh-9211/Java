import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
    public static void main(String[] args) {
        // 1. Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList after adding elements: " + names);

        // 3. Inserting an element at a specific position
        names.add(1, "David");
        System.out.println("ArrayList after inserting at index 1: " + names);

        // 4. Accessing an element by index
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // 5. Modifying an element at a specific index
        names.set(2, "Eve");
        System.out.println("ArrayList after modifying element at index 2: " + names);

        // 6. Removing an element by index
        names.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + names);

        // 7. Removing an element by value
        names.remove("Alice");
        System.out.println("ArrayList after removing 'Alice': " + names);

        // 8. Checking if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 9. Checking the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // 10. Checking if the ArrayList contains a specific element
        boolean containsEve = names.contains("Eve");
        System.out.println("Does the ArrayList contain 'Eve'? " + containsEve);

        // 11. Getting the index of an element
        int indexOfEve = names.indexOf("Eve");
        System.out.println("Index of 'Eve': " + indexOfEve);

        // 12. Getting the last index of an element
        names.add("Eve");
        int lastIndexOfEve = names.lastIndexOf("Eve");
        System.out.println("Last index of 'Eve': " + lastIndexOfEve);

        // 13. Converting the ArrayList to an array
        Object[] namesArray = names.toArray();
        System.out.print("ArrayList as an array: ");
        for (Object name : namesArray) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 14. Sorting the ArrayList
        // Sorting in descending order
        // Collections.sort(numbers, Collections.reverseOrder());   valid
        //         Collections.sort(numbers);   valid

        names.sort(Comparator.naturalOrder());
        System.out.println("ArrayList after sorting: " + names);

        // 15. Creating a sublist
        ArrayList<String> subList = new ArrayList<>(names.subList(1, 3));
        System.out.println("Sublist from index 1 to 2: " + subList);

        // 16. Clearing the ArrayList
        names.clear();
        System.out.println("ArrayList after clearing: " + names);
        System.out.println("Is the ArrayList empty after clearing? " + names.isEmpty());
    }
}


// Explanation:
// 1. Creates an ArrayList of String type.
// 2. Adds elements "Alice", "Bob", and "Charlie" to the ArrayList.
// 3. Inserts "David" at index 1.
// 4. Retrieves the first element in the ArrayList.
// 5. Modifies the element at index 2 to "Eve".
// 6. Removes the element at index 3.
// 7. Removes the first occurrence of "Alice" by value.
// 8. Checks if the ArrayList is empty.
// 9. Gets the size of the ArrayList.
// 10. Checks if the ArrayList contains "Eve".
// 11. Gets the index of "Eve".
// 12. Adds another "Eve" and gets the last index of "Eve".
// 13. Converts the ArrayList to an array and prints its elements.
// 14. Sorts the ArrayList in natural (alphabetical) order.
// 15. Creates a sublist from index 1 to 2 (exclusive of 3).
// 16. Clears the ArrayList and checks if it is empty after clearing.




