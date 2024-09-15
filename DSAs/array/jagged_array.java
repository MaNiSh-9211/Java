import java.util.*;
class jagged_array{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int r=scanner.nextInt();
        int arr[][]=new int[r][];
        for(int i=0;i<r;i++){
            System.out.println("enter the no of columns in row "+(i+1));
            int c=scanner.nextInt();
            arr[i]=new int[c];
    System.out.println("enter "+c+" elements for row "+(i+1));
            for(int j=0;j<c;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating a jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Using enhanced for loop to print the jagged array
        for (int[] outerArray : jaggedArray) {
            for (int element : outerArray) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each inner array
        }
    }
}