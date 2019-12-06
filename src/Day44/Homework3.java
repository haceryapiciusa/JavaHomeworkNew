package Day44;

//public class Homework3 {
//1. what is polymorphism
// *** The word polymorphism means having many forms.
// In simple words, we can define polymorphism as the ability of a message
// to be displayed in more than one form.
//2. what are the types of polymorphism
//  *** Compile time Polymorphism
//  *** Runtime Polymorphism
//3. what is static binding, what is dynamic binding?
// *** Static Binding: The binding which can be resolved at compile time
// by compiler is known as static or early binding.
// Binding of all the static, private and final methods is done at compile-time .
// *** Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called.
// Overriding is a perfect example of dynamic binding.
// In overriding both parent and child classes have same method .

//Polymorphism in java

//1) What is the output of the following program?
//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//}
//
//public class Homework3
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getData();
//    }
//}
//a) Inside Poly
//b) Inside TechnoStudy *** Answer
//c) Compilation error
//d) Runtime error



//2) What is the output of the following program?

//class Test
//{
//    void myMethod()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    void myMethod()
//    {
//        System.out.println("Poly");
//    }
//
//
//    public static void main(String[] args)
//{
//    Derived object = new Test();
//    object.myMethod();
//}
//}
//a) TechnoStudy
//b) Poly
//c) Compilation error *** Answer
//d) Runtime error

//3) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//
//protected void getValue()
//{
//    System.out.println("TechnoStudy");
//}
//}
//
//public class Homework3
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getValue();
//    }
//}
//a) Compilation error *** Answer ==>it can not reach the protected method inside the derived class
//b) Runtime error
//c) TechnoStudy
//d) None of these


//4) What is the output of the following program?

//interface Poly
//{
//    void myMethod();
//    void getInfo();
//}
//
//abstract class Geeks implements Poly
//{
//    void getData()
//    {
//        System.out.println("Poly");
//    }
//}
//
//class Test extends Geeks
//{
//    public void myMethod()
//{
//    System.out.println("TechnoStudy");
//}
//public void getInfo()
//{
//    System.out.println("Geeks");
//}
//
//public static void main(String[] args)
//{
//    Geeks obj = new Test();
//    obj.getInfo();
//}
//}
//a) Geeks *** Answer
//b) Compilation error
//c) Runtime error
//d) None of these


//5) What is the output of the following program?

//filter_none
//edit
//play_arrow

//brightness_4
//class Test
//{
//    public void Poly()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
// class Derived extends Test
//{
//    public void Poly()
//{
//    System.out.println("Poly");
//}
//public static void main(String[] args)
//{
//    Derived obj = new Test();
//    obj.Poly();
//}
//}
//a) Compilation error *** Answer
//b) Runtime error
//c) Poly
//d) TechnoStudy
