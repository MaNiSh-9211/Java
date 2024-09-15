import java.io.*;
public class creatingNewFile{
    public static void main(String args[]){
        try {
           File obj=new File("newFile.txt") ;
           if(obj.createNewFile()){
        System.out.println("new file is created :"+obj.getName());
           }
           else
           System.out.println("File already exixts");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
