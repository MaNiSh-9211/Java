import java.util.List;

public class wildcard {
    
    // Generic method to print elements of a list
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        printList(strings);

        List<Integer> integers = List.of(1, 2, 3, 4);
        printList(integers);
    }
}
