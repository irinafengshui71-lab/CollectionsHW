import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MainPersonsListHW {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("I");
        list.add("Campus");
        list.add("Giraffe");
        list.add("performance");
        list.add("cat");
        System.out.println("Before sort: ");
        System.out.println(list);
        Collections.sort(list, new ComparatorSrtingsByLangthReverseHW());
        System.out.println("After sort: ");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Mike");
        list2.add("Alex");
        list2.add("Johan");
        list2.add("Barbara");
        list2.add("Georg");
        list2.add("Nastja");
        list2.add("Lydia");
        list2.add("Irackliy");
        Collections.sort(list2, new ComparatorStringsByABC());

        System.out.println(list2);

    }
}
