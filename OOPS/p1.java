// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// public class p1 {
//     public static void main(String[] args) {
//         //Car G_wagon = new Car();
//         Car Bronco = new Car("Bronco", 300, 20000000);
//         Bronco.startEngine();
//         Bronco.printDetails();
        
//         // Creating an instance of superCar and calling methods
//         superCar Buggati = new superCar("Buggati", 350, 30000000);
//         Buggati.printDetails();
//     }
// }

// // Car class
// class Car {
//     String Name;
//     int maxSpeed;
//     int Prise;
    
//     Car() {
//         // Default constructor
//     }
    
//     Car(String Name, int maxSpeed, int Prise) {
//         this.Name = Name;
//         this.maxSpeed = maxSpeed;
//         this.Prise = Prise;
//     }
    
//     void startEngine() {
//         System.out.println("Engine is started");
//     }
    
//     void printDetails() {
//         System.out.println(Name + " " + maxSpeed + " " + Prise);
//     }
// }

// // superCar class
// class superCar extends Car {
//     superCar(String Name, int maxSpeed, int Prise) {
//         super(Name, maxSpeed, Prise); // Call the constructor of the superclass
//     }
    
// }
