package day11.homework;

import java.util.Scanner;

public class SwitchStatementHomework2 {

//    write code to find out if a day is a weekday or a weekend day. use switch statement

//Input 5
//    Output:
//    Friday is Weekday
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please input your day");
        int day = scan.nextInt();


        //the word is hardcoded
//        int day = 5;

        switch(day){
            case 1 :
                System.out.println("Monday is a weekday");
                break;
            case 2:
                System.out.println("Tuesday is a weekday");
                break;
            case 3:
                System.out.println("Wednesday is a weekday");
                break;
            case 4:
                System.out.println("Thursday is a weekday");
                break;
            case 5:
                System.out.println("Friday is a weekday");
                break;
            case 6:
                System.out.println("Saturday is a weekend");
                break;
            case 7:
                System.out.println("Sunday is a weekend");
                break;

        }
    }
}
