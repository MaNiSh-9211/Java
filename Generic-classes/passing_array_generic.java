public class passing_array_generic {

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        GenericClass<String> stringGenericClass = new GenericClass<>(stringArray);
        stringGenericClass.printArray();

        GenericClass<Integer> intGenericClass = new GenericClass<>(intArray);
        intGenericClass.printArray();
    }
}

class GenericClass<T> {
    private T[] array;

    public GenericClass(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (T element : array) {
            System.out.println(element);
        }
    }
}