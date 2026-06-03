import java.util.Comparator;

public class ComparatorBooksByPagesReverse implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {

        return Integer.compare(b2.getPages(), b1.getPages());
    }
}
