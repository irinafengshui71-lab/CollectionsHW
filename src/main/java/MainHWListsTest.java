import java.util.*;

public class MainHWListsTest {
    public static void main(String[] args){
        ArrayList<Double> listD = new ArrayList<>();
        listD.add(4.9);
        listD.add(1.5);
        listD.add(9.9);
        listD.add(3.8);

        System.out.println("Before sort: ");
        System.out.println(listD);

        Collections.sort(listD, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("After sort: ");
        System.out.println(listD);

        LinkedList<Integer>listInt = new LinkedList<>();
        listInt.add(30);
        listInt.add(10);
        listInt.add(40);
        listInt.add(70);
        listInt.add(80);
        Collections.sort(listInt, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("New sort: ");
        System.out.println(listInt);
    }
}
