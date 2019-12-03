package Day43.homework;

public class ChildrenBookComics extends Book {
    public ChildrenBookComics( String name, String kind) {
        super( name, kind);
        super.isSellsOnline();
        super.isSellsStore();
    }

    @Override
    public int getBooks() {
        return super.getBooks() - 5;

    }
}
