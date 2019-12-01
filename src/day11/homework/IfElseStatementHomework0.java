package day11.homework;

import java.util.Scanner;

public class IfElseStatementHomework0 {
//    Write a Java program that determines a student’s grade.?
//The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
//-if the average score >=90% =>grade=A
//-if the average score >= 70% and <90% => grade=B
//-if the average score>=50% and <70% =>grade=C
//-if the average score<50% =>grade=F
//See the example output below:
//
//Quiz score: 80
//

//Mid-term score: 68
//
//Final score: 90
//
//Your grade is B.

    public static void main(String[] args) {
        RunItInTheMethod();
    }

    private static void RunItInTheMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please type in your quiz score");
        int quiz = scan.nextInt();
        System.out.println("please type in your mmidterm score");
        int midterm = scan.nextInt();
        System.out.println("please type in your finals");
        int finals = scan.nextInt();

        int average = ((quiz + midterm + finals) / 3);
        System.out.println("your average score is:" + average);
        if (average > +90) {
            System.out.println("your grade is A");
        } else if (average >= 70) {
            System.out.println("your grade is B");

        } else if (average >= 50) {
            System.out.println("your grade is C");
        }

    }
}
