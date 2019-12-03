package Day43.homework;

public class OnlineShop extends Book {
    public OnlineShop( String name, String kind) {
        super( name, kind);
        super.isSellsOnline();
        super.isSellsStore();
    }
    @Override
    public int getBooks() {
        return super.getBooks() + 5;

    }


}
