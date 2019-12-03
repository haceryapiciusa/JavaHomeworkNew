package Day43.homework;

public class Book {
    private String name;
    private String kind;

    private boolean sellsOnline;
    private boolean sellsStore;

    public Book( String name, String kind) {

        this.name = name;
        this.kind = kind;

    }

    public boolean isSellsOnline() {
        return sellsOnline;
    }

    public boolean isSellsStore() {
        return sellsStore;
    }
    public int getBooks() {
        return 10;
    }
}
