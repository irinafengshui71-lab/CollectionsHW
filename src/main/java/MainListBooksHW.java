import java.util.LinkedList;

public class MainListBooksHW {
    public static void main(String[] args){
        LinkedList<Book> list = new LinkedList<>();
        Book b1 = new Book("Leo Tolstoy", "War and Peace", 1225, 29.99);
        Book b2 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 671, 19.99);
        Book b3 = new Book("Alexander Pushkin", "Eugene Onegin", 224, 12.50);
        Book b4 = new Book("Mikhail Bulgakov", "The Master and Margarita", 480, 18.75);
        Book b5 = new Book("Anton Chekhov", "Short Stories", 350, 14.20);
        Book b6 = new Book("Nikolai Gogol", "Dead Souls", 432, 16.80);
        Book b7 = new Book("Ivan Turgenev", "Fathers and Sons", 288, 13.90);
        Book b8 = new Book("Erich Maria Remarque", "Three Comrades", 496, 21.40);
        Book b9 = new Book("George Orwell", "Nineteen Eighty-Four", 328, 15.99);
        Book b10 = new Book("Jane Austen", "Pride and Prejudice", 432, 17.50);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);
        printBooksList(list);


        list.sort(null);
        printBooksList(list);
        ComparatorBooksByAuthorReverse comp1 = new ComparatorBooksByAuthorReverse();
        list.sort(comp1);
        printBooksList(list);
        ComparatorBooksAuthorAZ comp2 = new ComparatorBooksAuthorAZ();
        list.sort(comp2);
        printBooksList(list);
        ComparatorBooksByPages comp3 = new ComparatorBooksByPages();
        list.sort(comp3);
        printBooksList(list);
        ComparatorBooksByPriceReverse comp4 = new ComparatorBooksByPriceReverse();
        list.sort(comp4);
        printBooksList(list);
        ComparatorBooksByPagesReverse comp5 = new ComparatorBooksByPagesReverse();
        list.sort(comp5);
        printBooksList(list);
        ComparatorBooksByPrice comp6 = new ComparatorBooksByPrice();
        list.sort(comp6);
        printBooksList(list);
        ComparatorBooksByTitle comp7 = new ComparatorBooksByTitle();
        list.sort(comp7);
        printBooksList(list);
        ComparatorBooksByTitleReverse comp8 = new ComparatorBooksByTitleReverse();
        list.sort(comp8);
        printBooksList(list);

    }

    private static void printBooksList(LinkedList<Book> list) {
      for (Book b: list){
          System.out.println(b);
      }
        System.out.println("**************");
    }
}
