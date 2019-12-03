package day25.homework;

import java.util.Scanner;

public class Homework {
//    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
    //advanced, put in a new class and call the method from the main method.
}

class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string :");
        String str = in.nextLine();

        int count = wordCount(str);

        wordCounter(str);

        if (count == 1)
            System.out.println("number of words in the string: " + wordCount(str) + " word");
        else
            System.out.println("number of words in the string: " + wordCount(str) + " word(s)");
    }

    public static void main1(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence);

        wordCounter(sentence);
    }

    private static void wordCounter(String sentence) {

        String[] arr = sentence.split(" ");
        int counter = arr.length;
        System.out.println("You have " + counter + " words in your sentence");
    }

    public static int wordCount(String sentence) {
        int count = 0;
        char ch[] = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {

            Character letterChar = sentence.charAt(i);

            ch[i] = sentence.charAt(i);

            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' '))
                    || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }
}
