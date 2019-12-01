package day11.homework;


// done , homework
public class SwitchStatementHomework1 {

//    Write a code that displays the name of the day
//    it declares an int named day whose value represents a day(1-7).
//    The code displays the name of the day, based on the value of the day, using the switch statement.
//

    //Input 5
//    Output:
//    Friday
    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}