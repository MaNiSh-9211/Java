
import java.io.Console;

class CustomException extends Exception{
CustomException(String message){
super(message);
}
}

public class Custom_exception{
    public static void main(String args[]){
        int a=10;
        int b=0;
        int c=0;
        try{
    if(b==0)
throw new CustomException("this is custom exception");
      c=a/b;
      System.out.println(" code after exception line");
        }
        catch(CustomException e){
System.out.print("custom exception is : "+e.getMessage());
        }
}
}
