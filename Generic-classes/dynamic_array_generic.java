// this.array = new Object T[array.length];
// why this line dont work

// correct line
        // this.array = (T[]) new Object[array.length];
// 
// The line this.array = new Object T[array.length]; is incorrect in Java due to a syntax issue. Java does not support creating 
// arrays of generic types directly, and the syntax for array creation in Java does not allow specifying generic type parameters in
//  this way.

// Here's how to correctly create an array of a generic type:

// Correct Syntax for Array Creation
// Use Object Array as a Temporary Holder:

// First, create an array of Object and then cast it to the generic type. This is a common workaround in Java because generic
//  type arrays are not directly supported.
// Use Reflection:

// Another approach is to use reflection to create a new array of the generic type.



// with deep copy

public class dynamic_array_generic{
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Deep copy for String array
        GenericClass<String> stringGenericClass = new GenericClass<>(stringArray);
        System.out.println("Original String Array:");
        stringGenericClass.printArray();

        // Deep copy for Integer array
        GenericClass<Integer> intGenericClass = new GenericClass<>(intArray);
        System.out.println("Original Integer Array:");
        intGenericClass.printArray();
    }
}

class GenericClass<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericClass(T[] array) {
        // Perform deep copy directly in the constructor
        this.array = (T[]) new Object[array.length];// main main main main......................................MAIN..................................
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i]; // For mutable objects, this would involve cloning
        }
    }
// Java does not allow the direct creation of generic arrays. This is due to type erasure, which removes generic type information at runtime.
//  For example, new T[array.length] is not allowed because the runtime type information for T is not available.
    public void printArray() {
        for (T element : array) {
            System.out.println(element);
        }
    }
}


// with shalow copy


// import java.util.*;
// public class dynamic_array_generic {
//     public static void main(String[] args) {
//         String[] stringArray = {"apple", "banana", "cherry"};
//         Integer[] intArray = {1, 2, 3, 4, 5};

//         // Shallow copy for String array
//         GenericClass<String> stringGenericClass = new GenericClass<>(stringArray);
//         System.out.println("Original String Array:");
//         stringGenericClass.printArray();

//         // Shallow copy for Integer array
//         GenericClass<Integer> intGenericClass = new GenericClass<>(intArray);
//         System.out.println("Original Integer Array:");
//         intGenericClass.printArray();
//     }
// }

// class GenericClass<T> {
//     private T[] array;

//     @SuppressWarnings("unchecked")
//     public GenericClass(T[] array) {
//         // Perform shallow copy directly in the constructor
        
//         // this.array = Arrays.copyOf(array, array.length);
//                       // or
//                 this.array =array;

//     }

//     public void printArray() {
//         for (T element : array) {
//             System.out.println(element);
//         }
//     }
// }
// // 