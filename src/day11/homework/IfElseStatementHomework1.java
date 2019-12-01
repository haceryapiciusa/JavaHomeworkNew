package day11.homework;

import java.util.Scanner;

public class IfElseStatementHomework1 {
//Find the Largest Number Among Three Numbers using user Input
//Finding largest of three numbers using if-else..if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//Output:
//
//78 is the largest Number
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Provide three numbers : ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if (num1>=num2 && num1>=num3){
        System.out.println("num1 is max");
    }
    else if(num2>=num1&& num2>=num1){
        System.out.println("num2 is max");
    }
    else {
        System.out.println("num3 is max");
    }
}
}
