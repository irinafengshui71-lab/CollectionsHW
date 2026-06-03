import java.util.Comparator;

public class ComparatorStringsByLengthReverseHW implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        return len2 - len1;
    }
}

