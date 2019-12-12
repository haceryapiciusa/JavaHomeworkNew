package Day48;

public class Homework {
    //open-ended
    // Let's write a Shop that could be in-person and online
    // that sells different items
    // use OOP

}
class Shop{
    String name;
    String kind;
    int price;
    public void sellOnline(){

    }
    public void sellStore(){

    }
}
 class  Inperson extends Shop {

     @Override
     public void sellStore() {
         super.sellStore();
     }
 }
class Online extends Shop {
    @Override
    public void sellOnline() {
        super.sellOnline();
    }
}