// import java.io.IOException;
// import java.sql.SQLException;

// public class throws_2 {

//     public static void main(String[] args) {
//         try {
//             // Call methods that might throw exceptions
//             methodA();
//         } catch (IOException e) {
//             System.out.println("Caught IOException in main: " + e.getMessage());
//         } catch (SQLException e) {
//             System.out.println("Caught SQLException in main: " + e.getMessage());
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException in main: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Caught Exception in main: " + e.getMessage());
//         }
//     }

//     public static void methodA() throws IOException, SQLException ,ArithmeticException ,IOException{
//         System.out.println("Inside methodA");
//         // Simulate a condition that causes IOException
//         boolean fileError = true; // Just for demonstration
//         if (fileError) {
//             throw new IOException("Simulated file read error in methodA");
//         }
//         methodB();
//     }

//     public static void methodB() throws SQLException ,ArithmeticException ,IOException {
//         System.out.println("Inside methodB");
//         // Simulate a condition that causes SQLException
//         boolean dbError = true; // Just for demonstration
//         if (dbError) {
//             throw new SQLException("Simulated database error in methodB");
//         }
//         methodC();
//     }

//     public static void methodC() throws ArithmeticException ,IOException {
//         System.out.println("Inside methodC");
//         // Simulate a condition that causes ArithmeticException
//         boolean arithmeticError = true; // Just for demonstration
//         if (arithmeticError) {
//             throw new ArithmeticException("Simulated arithmetic error in methodC");
//         }
//         methodD();
//     }

//     public static void methodD() throws ArithmeticException , IOException {
//         System.out.println("Inside methodD");
//         // Simulate an actual arithmetic error
//         int a = 10;
//         int b = 0;
//         // This will throw ArithmeticException: division by zero
//         int result = a / b; 
//     }

//     public static void methodE() throws IOException {
//         System.out.println("Inside methodE");
//         // Simulate a condition that causes IOException
//         boolean fileError = true; // Just for demonstration
//         if (fileError) {
//             throw new IOException("Simulated file write error in methodE");
//         }
//     }
// }


// The reason why only the first exception (IOException) is being caught and printed is because once an exception is thrown and 
// caught in a try-catch block, the control flow does not continue to the next method calls within the same try block. Instead,
// it jumps to the corresponding catch block and then continues execution after the catch blocks.

// in the case of code above the function call is after the exception so the control do not went to the function call
import java.io.IOException;
import java.sql.SQLException;

public class throws_2 {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("Caught IOException in main: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Caught SQLException in main: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        try {
            methodB();
        } catch (IOException e) {
            System.out.println("Caught IOException in main: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Caught SQLException in main: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException in main: " + e.getMessage());
        }

        try {
            methodD();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException in main: " + e.getMessage());
        }

        try {
            methodE();
        } catch (IOException e) {
            System.out.println("Caught IOException in main: " + e.getMessage());
        }
    }

    public static void methodA() throws IOException, SQLException, ArithmeticException {
        System.out.println("Inside methodA");
        // Simulate a condition that causes IOException
        boolean fileError = true; // Just for demonstration
        if (fileError) {
            throw new IOException("Simulated file read error in methodA");
        }
        methodB();
    }

    public static void methodB() throws SQLException, ArithmeticException, IOException {
        System.out.println("Inside methodB");
        // Simulate a condition that causes SQLException
        boolean dbError = true; // Just for demonstration
        if (dbError) {
            throw new SQLException("Simulated database error in methodB");
        }
        methodC();
    }

    public static void methodC() throws ArithmeticException, IOException {
        System.out.println("Inside methodC");
        // Simulate a condition that causes ArithmeticException
        boolean arithmeticError = true; // Just for demonstration
        if (arithmeticError) {
            throw new ArithmeticException("Simulated arithmetic error in methodC");
        }
        methodD();
    }

    public static void methodD() throws ArithmeticException, IOException {
        System.out.println("Inside methodD");
        // Simulate an actual arithmetic error
        int a = 10;
        int b = 0;
        // This will throw ArithmeticException: division by zero
        int result = a / b;
    }

    public static void methodE() throws IOException {
        System.out.println("Inside methodE");
        // Simulate a condition that causes IOException
        boolean fileError = true; // Just for demonstration
        if (fileError) {
            throw new IOException("Simulated file write error in methodE");
        }
    }
}





// Key Points About try-catch Blocks:
// Single Execution of a try Block:

// When the code inside a try block is executed, it runs from the beginning of the block until an exception is thrown (if any).
// If an exception occurs, the execution jumps to the corresponding catch block.
// The remaining code inside the try block after the point where the exception occurred will not be executed.
// Control Does Not Return to the try Block:

// Once an exception is caught, control does not return to the try block to continue execution from where it left off. Instead, it moves to the catch block and then to the code after the try-catch structure.
// Example to Illustrate:
// java
// Copy code
// public class Example {

//     public static void main(String[] args) {
//         try {
//             System.out.println("Inside try block - Line 1");
//             int result = 10 / 0; // This will throw ArithmeticException
//             System.out.println("Inside try block - Line 2"); // This will never be executed
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException: " + e.getMessage());
//         }

//         System.out.println("After the try-catch block");
//     }
// }
// Control Flow in This Example:
// Execution Begins in the try Block:

// "Inside try block - Line 1" is printed.
// The line int result = 10 / 0; attempts to divide by zero, which causes an ArithmeticException.
// Exception Occurs:

// As soon as the ArithmeticException is thrown, the execution jumps out of the try block.
// The line "Inside try block - Line 2" is not executed because control has already left the try block.
// Control Moves to the catch Block:

// The catch block for ArithmeticException is executed, printing "Caught ArithmeticException: / by zero".
// Control Continues After the try-catch Block:

// After the catch block, the program continues executing the code after the try-catch structure, printing "After the try-catch block".