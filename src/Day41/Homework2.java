package Day41;

import java.awt.*;

public class Homework2 {
    //
//Which two classes use the Shape class correctly?

//
//A.
// public class Circle extend Shape
//   {
//    private int radius;
//   }
//B.
//    public abstract class Circle extends Shape
//   {
//    private int radius;
//   }
//C.
// public class Circle extends Shape
//   {
//   private int radius;
//   public void draw();
//   }
//D.
// public abstract class Circle implements Shape
//   {
//    private int radius;
//    public void draw();
//   }
//E.
// public class Circle extends Shape
//   {
//    private int radius;
//    public void draw()
//    {
//     /* code here */
//    }
//   }
//F.
// public abstract class Circle implements Shape
//   {
//     private int radius;
//     public void draw()
//     {
//      /* code here */
//     }
//   }
//a) B,E***Answer
//b) A,C
//c) C,E
//d) T,H
//
//What will be the output of the following Java program?
//
//     static class A {
//
//        int i;
//        void display()
//        {
//            System.out.println(i);
//        }
//    }
//     static class B extends A
//    {
//        int j;
//        void display()
//        {
//            System.out.println(j);
//        }
//    }
//     static class inheritance_demo
//    {
//        public static void main(String args[])
//        {
//            B obj = new B();
//            obj.i=1;
//            obj.j=2;
//            obj.display();
//        }
//   }
//a) 0
//b) 1
//c) 2*** Answer
//d) Compilation Error
//
//What will be the output of the following Java program?
//
//   static class A
//    {
//        int i;
//    }
//     static class B extends A {
//        int j;
//        void display()
//        {
//            super.i = j + 1;
//            System.out.println(j + " " + i);
//        }
//    }
//    static class inheritance
//    {
//        public static void main(String args[]) {
//            B obj = new B();
//            obj.i=1;
//            obj.j=2;
//            obj.display();
//        }
//   }
//a) 2 2
//b) 3 3
//c) 2 3 *** Answer
//d) 3 2
//
//What will be the output of the following Java program?
//
//    static class A
//    {
//        public int i;
//        public int j;
//        A()
//        {
//            i = 1;
//            j = 2;
//	}
//    }
//    static class B extends A
//    {
//        int a;
//        B()
//        {
//            super();
//        }
//    }
//    static class super_use
//    {
//        public static void main(String args[])
//        {
//            B obj = new B();
//            System.out.println(obj.i + " " + obj.j);
//        }
//   }
//a) 1 2 *** Answer
//b) 2 1
//c) Runtime Error
//d) Compilation Error
//
//Which of this keyword must be used to inherit a class?
//a) super
//b) this
//c) extent
//d) extends *** Answer
//
//A class member declared protected becomes a member of subclass of which type?
//a) public member
//b) private member *** Answer
//c) protected member
//d) static member
//
//Which of these is correct way of inheriting class A by class B?
//a) class B + class A {}
//b) class B inherits class A {}
//c) class B extends A {} *** Answer
//d) class B extends class A {}
//
}
