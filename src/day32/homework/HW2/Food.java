package day32.homework.HW2;

public class Food {
    public String name; // bread,milk,orange
    public String type; // poultry dairy
    public int price1;
    public int price2;
    public int count;
    public int getTotal (){
        return price1+price2;
    }
    public double getAverage() {
        return  (price1+price2)/2;
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.price1 = 3;
        food.price2 = 6;
        int total = food.getTotal();
        System.out.println(total);
        double average = food.getAverage();
        System.out.println(average);
    }
}
