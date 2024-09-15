
// throws Keyword
// Purpose:

// The throws keyword is used in method declarations to indicate that a method might throw certain types of exceptions. It is a way for a method
//  to declare that it may throw exceptions, which must be handled by the calling code.
// Usage:

// You use throws in the method signature to specify which exceptions a method might throw. This allows the caller of the method to handle or 
// declare these exceptions.

public class throws_1 {

    public static void main(String[] args) {
        try {
            // Call methods that might throw exceptions
            methodA();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }

    public static void methodA() throws Exception {
        System.out.println("Inside methodA");
        methodB();
    }

    public static void methodB() throws Exception {
        System.out.println("Inside methodB");
        methodC();
    }

    public static void methodC() throws Exception {
        System.out.println("Inside methodC");
        methodD();
    }

    public static void methodD() throws Exception {
        System.out.println("Inside methodD");
        // Throwing an exception
        throw new Exception("Exception thrown in methodD");
    }
}


// Default Exception Handler
// Purpose:

// The default exception handler is part of Java’s runtime system. It handles exceptions that are not caught by any try-catch blocks within the application.
// Usage:

// When an exception is thrown and not caught by any catch block, the Java Virtual Machine (JVM) invokes the default exception handler. This is usually
//  a part of the JVM that prints the stack trace of the uncaught exception and terminates the program.

//  Exception Handling:

// The default exception handler prints the exception details to the standard error stream and terminates the application. It provides a stack trace 
// that helps in debugging.

// Uncaught Exception:

// This handler is invoked when an exception propagates up the call stack without being caught, meaning no catch block has handled it.