// remember if in generic class during creation of generic class or during creationof an object dont repeat any wrapper class or datatype either 
// it will give compile time error.
// sequence in dimond operator in lhs and paremeter in rhs muat be same we can do <INteger,String> obj= new obj(1,"manish ",2)
// but not manish 1,2
// we ahve to specify wrapper classes . we cant use normal datatypes.

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

public class firstt {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }
}


// if all the datamembers in the clas are of same type then we have to specify the class wrapper (datatype) only 1 tyme in the dimond operator on lhs
// but if we have different datatypes repeating each 1 tyme then we have to specify them and each must be in order
// 



class Pair<T,S> {
    private T first;
    private T second;
    private S third;
    

    public Pair(T first, T second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public S getThird() {
        return third;
    }
}

 class firstt {
    public static void main(String[] args) {
        Pair<Integer , String> pair = new Pair<>(1,2,"manish");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
        System.out.println("Second: " + pair.getThird());
    }
}


// if we have multiple parameter of same type togather then we can specify the type 1 tyme while creating the object and while creating the generic 
// class


class Pair<T,S> {
    private T first;
    private S second;
    private T third;
    

    public Pair(T first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    public T getThird() {
        return third;
    }
}

public class firstt {
    public static void main(String[] args) {
        Pair<Integer , String> pair = new Pair<>(1,"manish",2);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
        System.out.println("Second: " + pair.getThird());
    }
}


//

// if we have the sequence of the parameters differently like in above coode thn this willl work because we have to specify a datatype or wrapper class once
// el;se it will give error

// remember if in generic class during creation of generic class or during creationof an object dont repeat any wrapper class or datatype either 
// it will give compile time error.
