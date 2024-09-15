public class Main {
    public static void main(String[] args) {
        Child child = new Child("Manish", 123);
        child.displayInfo();

        Child child2 = new Child("Abishek", 456);
        child2.displayInfo();

        child2.setName("Abi");
        child2.setId(789);

        child.displayInfo();
        child2.displayInfo();
    }
}

class Parent {
    private String name;
    private int id;

    public Parent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Child extends Parent {
    public Child(String name, int id) {
        super(name, id);
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
    }
}


