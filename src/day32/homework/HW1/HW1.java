package day32.homework.HW1;

public class HW1 {
    // write java program with method buyItem
    // that accepts argument
    // which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar
    public static void main(String[] args) {
        printbuyItem();

    }

    public static void printbuyItem() {
        boolean dontHaveMilk = true;
        if (dontHaveMilk) {
            System.out.println("I go to store and bought a milk");

            boolean dontHaveSugar = true;
            if (dontHaveMilk) {
                System.out.println("I go to store and bought sugar");

                boolean dontHaveWater = true;
                if (dontHaveMilk) {
                    System.out.println("I go to store and bought water");


                }
            }
        }
    }
}
