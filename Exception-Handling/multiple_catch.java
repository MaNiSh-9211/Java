import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class multiple_catch {

    public static void main(String[] args) {
        try {
            // Rule 1: This block may throw multiple exceptions.
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file); // May throw FileNotFoundException
            int data = fis.read(); // May throw IOException
            System.out.println("Data read from file: " + data);
            
        } catch (FileNotFoundException e) {
            // Rule 2: This block catches a specific exception.
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Rule 2: This block catches a different specific exception.
            System.err.println("IO error occurred: " + e.getMessage());
        } catch (Exception e) {
            // Rule 1: This block catches any other exceptions not caught by earlier blocks.
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

        try {
            // Rule 3: Multi-catch block to handle multiple exception types in a single catch.
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            System.out.println("Data read from file: " + data);
            
        } catch (FileNotFoundException | IOException e) {
            // Rule 3: This block handles both FileNotFoundException and IOException in the same way but int this case the io exception class 
            // is a superclas of filenot found exception so this will give compile time error.
            System.err.println("File not found or IO error occurred: " + e.getMessage());
        }

        try {
            // Rule 4: This block may throw exceptions. 
            String str = null;
            System.out.println(str.length()); // May throw NullPointerException
            
        } catch (NullPointerException e) {
            // Rule 4: Catching specific exception.
            System.err.println("Null pointer exception: " + e.getMessage());
            throw e; // Re-throwing the exception
        } catch (Exception e) {
            // Rule 4: General catch block for any other exceptions.
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

        // Rule 5: Incorrect order example (commented out to avoid compilation error)
        // Uncommenting the following lines would cause a compilation error because Exception is a superclass of FileNotFoundException and IOException.
    
        try {
            // Some code
        } catch (Exception e) {
            // General exception handler
        } catch (FileNotFoundException e) {// error: exception FileNotFoundException has already been caught} catch (FileNotFoundException e) {
            // This code will never be reached


// if we move the exception class to the bottom then it give eror: multiple_catch.java:59: error: exception FileNotFoundException is never thrown in body of corresponding try statement

// this error is because we have to throw the exception explixitly to the bottom classes if the bottom class is parent class.
        } catch (IOException e) {
            // This code will never be reached
        }
        
        
        // Rule 5: Correct order example
        // try {
        //     // Code that may throw exceptions
        // } catch (FileNotFoundException e) {
        //     // More specific exception handler
        // } catch (IOException e) {
        //     // Another specific exception handler
        // } catch (Exception e) {
        //     // General exception handler for all other exceptions
        // }
    }
}


// } catch (FileNotFoundException | IOException e) {

// will indeed give an error because FileNotFoundException is a subclass of IOException. When using multi-catch blocks (|), you cannot
//  catch both a superclass and its subclass together. The reason is  that catching IOException would already cover FileNotFoundException,
//   so there's no need to catch both in the same multi-catch block.