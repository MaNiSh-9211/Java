package DSAs.string;

public class mutable_string {
    public static void main(String[] args) {
        // StringBuilder Example
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb.toString());
        
        sb.append(" World");
        System.out.println("After append: " + sb.toString());
        
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb.toString());
        
        sb.delete(6, 16);
        System.out.println("After delete: " + sb.toString());
        
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb.toString());
        
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
        
        // StringBuffer Example
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("\nOriginal StringBuffer: " + sbf.toString());
        
        sbf.append(" Programming");
        System.out.println("After append: " + sbf.toString());
        
        sbf.insert(5, "Advanced ");
        System.out.println("After insert: " + sbf.toString());
        
        sbf.delete(5, 14);
        System.out.println("After delete: " + sbf.toString());
        
        sbf.replace(0, 4, "C++");
        System.out.println("After replace: " + sbf.toString());
        
        sbf.reverse();
        System.out.println("After reverse: " + sbf.toString());
    }
}
