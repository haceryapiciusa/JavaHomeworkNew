package Day44;

//public class Homework2 {


//2. Can we overload methods on return type?
//will this work???? why? why not?
    //You can not define more than one method with the same name,
    // Order and the type of the arguments. It would be compiler error.
    //The compiler does not consider the return type while differentiating the overloaded method.
    // But you cannot declare two methods with the same signature and different return type.
    // It will throw a compile time error.
    //If both methods have same parameter types, but different return type, then it is not possible.
//public class Homework2 {
//    public int foo() {
//        return 10;
//    }
//    public char foo(){
//        return 'a';
//    }
//    public static void main(String args[]) {
//
//    }
//}


//3. Can we overload static methods?
//Yes we can.We can have two more static methods with same name, but differences input parameters
//4. Can we overload methods that differ only by static keyword?
//will this work???? why? why not?
//We cannot overload two methods in Java if they differ only by static keyword

//public class Homework2
//{
//    public static void foo(int i )
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public void foo()
//    { // Compiler Error: cannot redefine foo()
//        //when we define different parameter it allows
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Homework2.foo(10);
//    }
//}

//5. Can we overload main() in Java?
//*** We can overload the main method in Java.
// But the program doesn’t execute the overloaded main method when we run your program,
// we need to call the overloaded main method from the actual main method only.
//6. What is the difference between Overloading and Overriding?
//*** Overriding is related to RUN-TIME polymorphism.
// A subclass (or derived class) provides a specific implementation of a method in superclass (or base class).
// The method in a subclass has the same name, same parameters or signature and
// same return type(or sub-type) as a method in its super-class,
// then the method in the subclass is said to override the method in the super-class.
//*** Overloading is related to COMPILE TIME (or static) polymorphism.
// It allows different methods to have same name,
// but different signatures, especially number of input parameters and type of input parameters.
//7. Can we Override static methods in java?
//it is related to question 7.
//***We can declare static methods with same signature in subclass,
// but it is not considered overriding as there won’t be any run-time polymorphism.
// So the answer is ‘No’.


//what is the output of this program? why? why not?
//Static or class method from Base ===> because its static coming from base
//Non-static or Instance method from Derived ===> its not static Coming from derived


//class Base
//{
//    public static void display()
//    {
//        System.out.println("Static or class method from Base");
//    }
//    public void print()
//    {
//        System.out.println("Non-static or Instance method from Base");
//    }
//}
//
//class Derived extends Base
//{
//public static void display()
//{
//    System.out.println("Static or class method from Derived");
//}
//public void print()
//{
//    System.out.println("Non-static or Instance method from Derived");
//}
//}
//
//public class Homework2
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();
//
//        obj1.print();
//    }
//}
//
