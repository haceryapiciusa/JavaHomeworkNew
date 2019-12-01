package Day41;

 //class Homework {
     //*********************************************************************************************
     //What will be the output of the following Java program?
  /*  class X
    {
        //Class X Members
    }

    class Y
    {
        //Class Y Members
    }

   // class Z extends X, Y
    {
        //Class Z Members
    }*/
// Answer : Class can not extend multiple classes
     //*********************************************************************************************
     // What will be the output of the following Java program?
   /* class A
    {
        int i = 10;
    }

    class B extends A
    {
        int i = 20;
    }

    public class MainClass {
        public static void main(String[] args) {
            A a = new B();

            System.out.println(a.i);
        }
    } */
     // Answer is 10.
     //*********************************************************************************************
     //What will be the output of the following Java program?
   /*  class A1 {
         {
             System.out.println(1);
         }
     }

     class B1 extends A1 {
         {
             System.out.println(2);
         }
     }

     class C1 extends B1 {
         {
             System.out.println(3);
         }
     }

     class MainClass1 {
         public static void main(String[] args) {
             C1 c = new C1();
         }
     }
// Answer is:
//1
//2
//3
*/
     //*********************************************************************************************
     // What will be the output of the following Java program?
 class A2 {
         String s = "Class A1";
     }

     class B2 extends A2 {
         String s = "Class B2";

         {
             System.out.println(super.s);
         }
     }

     class C2 extends B2 {
         String s = "Class C3";

         {
             System.out.println(super.s);
         }
     }

     class MainClass2 {
         public static void main(String[] args) {
             C2 c = new C2();

             System.out.println(c.s);
         }
     }

     //Answer is :
//     Class A1
//     Class B2
//     Class C3

    //*********************************************************************************************
    //What will be the output of the following Java program?

/*
     class A
    {
        static
        {
            System.out.println("THIRD");
        }
    }

    class B extends A
    {
        static
        {
            System.out.println("SECOND");
        }
    }

    class C extends B
    {
        static
        {
            System.out.println("FIRST");
        }
    }

    class MainClass
    {
        public static void main(String[] args)
        {
            C c = new C();
        }
    }
    //Answer is :
//    THIRD
//    SECOND
//    FIRST
*/
    //*********************************************************************************************
    //What will be the output of the following Java program?
  /*  class A
    {
        public A()
        {
            System.out.println("Class A Constructor");
        }
    }

    class B extends A
    {
        public B()
        {
            System.out.println("Class B Constructor");
        }
    }

    class C extends B
    {
        public C()
        {
            System.out.println("Class C Constructor");
        }
    }

    class MainClass
    {
        public static void main(String[] args)
        {
            C c = new C();
        }
    }
    */
//Answer is :
//Class A Constructor
//Class B Constructor
//Class C Constructor
    //*********************************************************************************************
    //What will be the output of the following Java program?
/*
    class X
    {
        static void staticMethod()
        {
            System.out.println("Class X");
        }
    }

    class Y extends X
    {
        static void staticMethod()
        {
            System.out.println("Class Y");
        }
    }

     class MainClass
    {
        public static void main(String[] args)
        {
            Y.staticMethod();
        }
    }
*/
//Answer is : Class Y
    //*********************************************************************************************
   // What will be the output of the following Java program?

    class X
    {
        public X(int i)
        {
            System.out.println(1);
        }
    }

    class Y extends X {
        public  Y(int i){
            super(i);
            System.out.println(2);
        }
    }


