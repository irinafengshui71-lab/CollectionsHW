import java.util.Comparator;

public class ComparatorStringsReverse implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        return o2.compareTo(o1);
    }
}
/*
HOMEWORK #11

1. in main:
ArrayList<Double> listD
LinkedList<Integer> listInt


2.Advanced:
ComparatorDoubleReverse
// Double.compare(d2,d1);
ComparatorIntegerReverse
 */