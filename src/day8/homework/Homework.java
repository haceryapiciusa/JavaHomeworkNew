package day8.homework;

public class Homework {

//    1. What is the range of short data type in Java?
//    a) -128 to 127
//    b) -32768 to 32767
//    c) -2147483648 to 2147483647
//    d) None of the mentioned
    // Answer is b.
    short s1 = Short.MAX_VALUE;
    short s2 = Short.MIN_VALUE;
//
//
//
//    2. What is the range of byte data type in Java?
//    a) -128 to 127
//    b) -32768 to 32767
//    c) -2147483648 to 2147483647
//    d) None of the mentioned
//    View Answer
    //Answer is a.
    byte aByte = Byte.MAX_VALUE;
    byte bByte = Byte.MIN_VALUE;
//
//
//
//    3. Which of the following are legal lines of Java code?
//    1. int w = (int)888.8;
//    2. byte x = (byte)100L;
//    3. long y = (byte)100;
//    4. byte z = (byte)100L;

//    a) 1 and 2
//    b) 2 and 3
//    c) 3 and 4
//    d) All statements are correct.
//
//
//
//    What is the output of this program?
//
//    class increment {
//        public static void main(String args[])
//        {
//            int g = 3;
//            System.out.print(++g * 8);
//        }
//    }
//    a) 25
//    b) 24
//    c) 32
//    d) 33
    //Answer is c.
public static void main1(String args[])
        {
            int g = 3;
            System.out.print(++g * 8);
        }
//
//
//    What is the output of this program?
//
//    class area {
        public static void main2(String args[])
        {
            double r, pi, a;
            r = 9.8;
            pi = 3.14;
            a = pi * r * r;
            System.out.println(a);
        }
//    }
//    a) 301.5656
//    b) 301
//    c) 301.56
//    d) 301.56560000
    //Answer is a.

}
