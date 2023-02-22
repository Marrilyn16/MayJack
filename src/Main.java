//Recursion
//public class Main {
//    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//    }
//     static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k-1);
//        }
//        else {
//            return 0;
//        }
//    }
//    public static void main (String[] args) {
//        int result = sum(15);
//        System.out.println(result);
//    }
//    static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k-1);
//        } else {
//            return 0;
//        }
//    }
    //Recursion_Example 2
//    public static void main(String[] args) {
//        int result = sum(5,10);
//        System.out.println(result);
//    }
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return end + sum(start, end - 1);
//        } else {
//            return end;
//        }
//    }
//
//}
////To create a class
//public class Main {
//    int x = 5;
//}

// //To create an object from the main class
//public class Main {
//    int x = 5;
//
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x); //To access attributes using dot notation(.)
//    }
//}

// //To Modify Attributes e.g set the value of x to 40
//public class Main {
//    int x;
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        myObj.x = 40;
//        System.out.println(myObj.x);
//    }
//}
// //To override existing values e.g change the value of x from 40 to 25
//public class Main{
//    int x = 40;
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        myObj.x = 25;
//        System.out.println(myObj.x);
//    }
//}
//Note: To avoid the overriding ability, use final to declare the attribute.

// //Multiple Objects
// //Change the value of x to 25 in myObj2 and leave x in myObj1 unchanged
//public class Main {
//    int x = 5;
//
//    public static void main(String[] args) {
//        Main myObj1 = new Main();
//        Main myObj2 = new Main();
//        myObj2.x = 25;
//        System.out.println(myObj1.x);
//        System.out.println(myObj2.x);
//    }
//}

// //Multiple Attributes
//public class Main{
//    String fname = "John";
//    String lname = "Doe";
//    int age = 24;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//        System.out.println("Age: " + myObj.age);
//    }
//}

// // Java Class Methods
// //To  create a method
//public class Main {
//    static void myMethod() {
//        System.out.println("Hello world");
//    }
////    Call myMethod inside main(method's name followed by parentheses)
//    public static void main(String[] args) {
//        myMethod();
//    }
//}

////Static vs. Public
//public class Main {
////    Static Method
//    static void myStaticMethod() {
//        System.out.println("Static methods can be called without creating objects");
//    }
////    Public Method
//    public void myPublicMethod() {
//        System.out.println("Public methods must be called by creating objects");
//    }
////    Main method
//    public static void main (String[] args) {
//        myStaticMethod(); //Call the static method
////        myPublicMethod(); This would compile an error
//
//        Main myObj = new Main(); //create an object of main
//        myObj.myPublicMethod(); //call the public method on the object
//    }
//}

//Access Methods With an Object
//Create a main class
//public class Main{
////    Create a fullthrottle method
//    public void fullThrottle() {
//        System.out.println("The car is going as fast as it can");
//    }
////    Create a speed() method and add a parameter
//    public void speed(int maxSpeed) {
//        System.out.println("Max speed is: " + maxSpeed);
//    }
////    Inside main, call the methods on the myCar object
//    public static void main (String[] args) {
//        Main myCar = new Main(); //create an object named myCar
//        myCar.fullThrottle();
//        myCar.speed( 40);
//    }
//
//
//}

//To create a class constructor
//public class Main {
//    int x;
////    create a constructor
//    public Main() {
//        x = 10; //initialize
//    }
//    public static void main (String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//
//}
//Constructor with parameters
//public class Main {
//    int x;
//    public Main(int y){
//        x = y;
//    }
//    public static void main(String[] args){
//        Main myObj = new Main(20);
//        System.out.println(myObj.x);
//    }

//    Note: You can have multiple parameters.
//    They work in the same way as the single parameters
//}


//Abstract class
abstract class House {
    abstract void study(); //abstract method
}
//Subclass (inherit from Main)
class Student extends House {
    String fName = "Marrilyn";
    int age = 24;
    public void study() {
        System.out.println("Studies all day long");
    }
    public int graduationYear = 2018;
}
class Main {
    public static void main(String[] args) {
        Student read = new Student();
        read.study();
    }
}
