// import java.io.*;
// import java.util.*;
// public class FilewriterExample{
//     public static void main(String args[]){
//         Scanner scanner=new Scanner(System.in);
//         String userInput=scanner.nextLine();
//         try {
//            FileWriter obj=new FileWriter("newFile.txt");
//            obj.write(userInput);
//            obj.close();
//         System.out.println("new file is created with the data from user in it");
//            }   
//          catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
// finally {
//             scanner.close();
//         }
//     }
// }
import java.io.*;
import java.util.*;

public class FileWrExample {  // Class name follows conventions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to write to the file: ");
        String userInput = scanner.nextLine();

        // Correctly using FileWriter
        try (FileWriter writer = new FileWriter("newile.txt")) {
            writer.write(userInput);  // Writing user input to the file
            System.out.println("New file is created with the data from user in it.");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();  // Closing the scanner to prevent resource leak
        }
    }
}


