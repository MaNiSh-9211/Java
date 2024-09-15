class Parent {
    static {
        System.out.println("Parent static block");
    }

   

    Parent() {
        System.out.println("Parent constructor");
    }
     {
        System.out.println("Parent instance block");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child instance block");
    }

    Child() {
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating an instance of Child class
        Child child = new Child();
    }
}




Main method started
Parent static block
Child static block
Parent instance block
Parent constructor
Child instance block
Child constructor