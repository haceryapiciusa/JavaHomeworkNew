package day11.homework;

import java.util.Scanner;

public class SwitchStatementHomework4 {
    //write a program that find the size.
    // user input char and output the size of the clothes.

    //    input: S, L, M, X,
//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//
//            "size is not small, medium, large or X-large, but was "
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your size;");
        int size = scan.nextInt();

        switch (size) {
            case 12:
                System.out.println("your size is xl");
                break;
            case 10:
                System.out.println("your size is l");
                break;
            case 8:
                System.out.println("your size is m");
                break;
            case 6:
                System.out.println("your size is s");
                break;
            default:
                System.out.println("invalid");
        }
    }
}



