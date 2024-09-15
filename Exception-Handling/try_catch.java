
class try_catch{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        try {
        System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("You cant have 5 indexes in an array of size 5");
        }
        finally{
            System.out.print("i will run always if the exception occur or if it does not");
        }
        // first i will run and then the compiller will give error of exception. because exception stops the exicution of the line next to
        // the line having error , so this finally block helps in cases like closing resourses if an exception occurs
    }
}
// If the try or catch block contains a System.exit(0) call, the finally block will not execute because the JVM will terminate before reaching it.
// Infinite loops or abrupt terminations within the try or catch block can also prevent the finally block from executing.

// Best Practices for Using the finally Block:

// Resource Cleanup:

// Use the finally block for closing resources like files, network connections, or database connections, ensuring they are closed even if 
// an exception occurs. Avoid Return Statements in finally:

// While Java allows return statements in finally, it’s best to avoid them as they can obscure the flow of the program and override the
//  return value from the try or catch block.