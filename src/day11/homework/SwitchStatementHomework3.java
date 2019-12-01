package day11.homework;

import java.util.Scanner;

public class SwitchStatementHomework3 {

    //write a program that find the size.
    // user input integer and output the size of the clothes.

//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//
//            "size is not small, medium, large or X-large, but was "

    public static void main(String[] args) {
        System.out.println("Enter your size as number : ");
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        switch (size){
            case 36:
                System.out.println("size is small");
                break;
            case 38:
                System.out.println("size is medium");
                break;
            case 40:
                System.out.println("size is large");
                break;
            case 42:
                System.out.println("size is X-large");
                break;
            default:
                System.out.println("size is not small, medium, large or X-large");
                break;
        }
    }

}
