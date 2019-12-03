package day18;
// Task
//  0. Get sum from 2D array
//    ex: {{1,2,3}, {3,2,1}} => 12
//  1. Get average of each student in 2D array
//    ex: {                  {
//          {5,5,5},           5,
//          {4,4,4}      =>    4
//        }                  }
//  3. Transpose an 2D array, such that rows become columns
//    ex: 1 2 3     1 4
//        4 5 6  => 2 5
//                  3 6
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {2, 4, 5},
                {4, 4, 5}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("task 0 ------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        System.out.println("task 1 ------");
        int count = 0;

        double average = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count++;
                average =(double) sum / count;
            }
        }
        System.out.println(count);
        System.out.println(average);

    }
}
