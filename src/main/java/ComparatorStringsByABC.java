import java.util.Comparator;

public class ComparatorStringsByABC implements Comparator<String>{

    @Override
    public int compare(String f1, String f2) {
        return f1.compareTo(f2);
    }
}
