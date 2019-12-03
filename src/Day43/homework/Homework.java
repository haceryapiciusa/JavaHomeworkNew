package Day43.homework;

import Day43.homework.Book;

public class Homework {
    // Let's write a Online-Shop that sells books: ChildrenBook & Comics
    // use inheritance, polymorphism and encapsulation while doing this

    // Note: this HW is open-ended, so there a lot of way to solve it
    // task about salary is similar to this

    // Hint: you can use Book as parent class and define price() method there
    public static void main(String[] args) {
        Book[] books = {
                new ChildrenBookComics(" Dog Man","Comics"),
                new OnlineShop("Harry Potter","Teen"),
        };
        for (Book book : books) {
            if(book instanceof ChildrenBookComics){
                System.out.println("Children Books price is : " + book.getBooks());
            }
            if (book instanceof OnlineShop){
                System.out.println("OnlineShop price is : " + book.getBooks());
            }

        }
    }
}
