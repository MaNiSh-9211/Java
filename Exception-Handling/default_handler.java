public class default_handler {

    public static void main(String[] args) {
        System.out.println("Program starts.");

        try {
            methodA(); // Call a method that causes an exception
        } finally {
            System.out.println("Finally block in main method.");
        }

        System.out.println("Program ends."); // This line won't execute because of the uncaught exception
    }

    public static void methodA() {
        System.out.println("Inside methodA.");
        methodB(); // Call another method that causes an exception
    }

    public static void methodB() {
        System.out.println("Inside methodB.");
        int result = 10 / 0; // This will cause an ArithmeticException (divide by zero)
        System.out.println("This line will not be executed.");
    }
}

// above code will give error

Output:
Program starts.
Inside methodA.
Inside methodB.
Finally block in main method.
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at DefaultHandlerExample.methodB(DefaultHandlerExample.java:20)
    at DefaultHandlerExample.methodA(DefaultHandlerExample.java:14)
    at DefaultHandlerExample.main(DefaultHandlerExample.java:8)


public class default_handler {

    public static void main(String[] args) {
        System.out.println("Program starts.");

        try {
            methodA(); // Call a method that causes an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // Optionally, you can print the stack trace if needed
            // e.printStackTrace();
        } finally {
            System.out.println("Finally block in main method.");
        }

        System.out.println("Program ends."); // This line will now execute
    }

    public static void methodA() {
        System.out.println("Inside methodA.");
        methodB(); // Call another method that causes an exception
                System.out.println("after B s function call");

    }

    public static void methodB() {
        System.out.println("Inside methodB.");
        int result = 10 / 0; // This will cause an ArithmeticException (divide by zero)
        System.out.println("This line will not be executed.");
    }
}


Output:

Program starts.
Inside methodA.
Inside methodB.
Caught an exception: / by zero
Finally block in main method.
Program ends.

