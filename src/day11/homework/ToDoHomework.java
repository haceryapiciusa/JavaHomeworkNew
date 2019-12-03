package day11.homework;

import java.util.Scanner;

public class ToDoHomework {
    // Task
    // 1. Write program that gets two inputs from user then prints sum
    // 2. Write simple calculator,
    //     a. reads first input
    //     b. reads operator (+, -, *, /)
    //     c. reads second input
    //     d. prints result
    // 3. Write program that calculates from string:
    //    ex: one plus nine => 10, four subtract 2 => 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide two numbers : ");

        int number = scan.nextInt();
        int second = scan.nextInt();

        int sum = number+second;
        System.out.println("sum is : " + sum);

        int sub = number -second;
        System.out.println( " sub is : " + sub);
        int multi = number * second;
        System.out.println("multi is : " + multi);

        double divide  = (double)number/(double)second;
        System.out.println("divide is : " +  divide);

    }
}
