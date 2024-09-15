// in this if we specify parent class in the generic clas creation and object creation then we can send parameter or set datamembers of their child 
// classes
// like if we specify Number class wrapper during object and generic class creation then we can send int double float lomg short etx as paemeter and
//  there will be no error

    class Box<T extends Number> {
        // also allowed
        // public class BoundedGenericClass<T extends Number, S> { 
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Bounded_type_parameters {
    public static void main(String[] args) {
        // Create Box instances for various numeric types
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println("Double Value: " + doubleBox.get());

        Box<Float> floatBox = new Box<>();
        floatBox.set(2.718f);
        System.out.println("Float Value: " + floatBox.get());

        Box<Long> longBox = new Box<>();
        longBox.set(100000L);
        System.out.println("Long Value: " + longBox.get());

        Box<Short> shortBox = new Box<>();
        shortBox.set((short) 5);
        System.out.println("Short Value: " + shortBox.get());

        Box<Byte> byteBox = new Box<>();
        byteBox.set((byte) 127);
        System.out.println("Byte Value: " + byteBox.get());

        // BigDecimal is not a direct subclass of Number, but it's commonly used for precise decimal calculations
        // However, `BigDecimal` does not extend `Number`, so it cannot be used with the current `Box<T extends Number>` definition

        // Uncommenting the following line would cause a compilation error since BigDecimal does not extend Number
        // Box<BigDecimal> bigDecimalBox = new Box<>(); // Compile-time error
    }
}


