package Day44;

public class Homework4 {

    //write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.

   static class Sum {
        public int Sum(int x, int y) {
            int sum = x + y;
            return sum;
        }

        public int Sum(int x, int y, int z) {
            int sum = x + y + z;
            return sum;
        }

        public double Sum(double x, double y) {
            double sum = x + y;
            return sum;
        }


        public static void main(String[] args) {
            Sum sum = new Sum();
            System.out.println(sum.Sum(3, 5));
            System.out.println(sum.Sum(3, 5, 4));
            System.out.println(sum.Sum(3.5, 5.5));


        }
    }
}
