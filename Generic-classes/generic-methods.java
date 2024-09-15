eneric functions (or generic methods) in Java allow you to define methods that can operate on various types while
 providing compile-time type safety. By using generics, you can write methods that are more flexible and reusable, avoiding the need for type casting 
 and enhancing code readability.

Syntax of Generic Methods
A generic method is defined with a type parameter before the return type. Here’s the general syntax:

java
Copy code
public <T> ReturnType methodName(T param) {
    // Method body
}
// Example of Generic Methods
// Here are several examples demonstrating different use cases of generic methods:

// 1. Basic Generic Method
// A simple example of a generic method that returns the value of the type parameter:

java
Copy code
public class GenericMethodExample {
    
    // Generic method to return the value of the input parameter
    public <T> T identity(T value) {
        return value;
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        
        // Using the generic method with different types
        System.out.println(example.identity("Hello")); // Output: Hello
        System.out.println(example.identity(123));     // Output: 123
    }
}
2. Generic Method with Multiple Type Parameters
A method that swaps two elements in an array:

java
Copy code
public class GenericSwap {
    
    // Generic method to swap elements at index i and j
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};
        swap(strings, 0, 2);
        System.out.println(Arrays.toString(strings)); // Output: [three, two, one]
        
        Integer[] integers = {1, 2, 3};
        swap(integers, 1, 2);
        System.out.println(Arrays.toString(integers)); // Output: [1, 3, 2]
    }
}
3. Generic Method with Bounded Type Parameters
A method that finds the maximum element in an array, where the type parameter is bounded by Comparable:

java
Copy code
public class BoundedGenericMethod {
    
    // Generic method to find the maximum element
    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            return null; // or throw an exception
        }
        
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 2, 5, 4};
        System.out.println(max(numbers)); // Output: 5
        
        String[] words = {"apple", "banana", "cherry"};
        System.out.println(max(words)); // Output: cherry
    }
}
4. Generic Method with Wildcards
A method that prints elements of a list using wildcards:

java
Copy code
import java.util.List;

public class WildcardExample {
    
    // Generic method to print elements of a list
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        printList(strings);

        List<Integer> integers = List.of(1, 2, 3, 4);
        printList(integers);
    }
}
Summary
Generic Methods: Allow you to write methods that work with different data types while maintaining type safety.
Type Parameters: Defined within angle brackets (<T>) before the return type of the method.
Bounded Type Parameters: Restrict the type parameter to a specific type or its subtypes using extends.
Wildcards: Use ? to represent an unknown type, allowing methods to handle different types of collections flexibly.
By using generics, you can make your methods more versatile and reusable, reducing redundancy and improving type safety in your code.







