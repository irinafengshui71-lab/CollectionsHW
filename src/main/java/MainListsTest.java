import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.LinkedList;
import java.util.List;

public class MainListsTest {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("kiwi");
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("lemon");
        list.add("melon");
        System.out.println(list);
        list.add(2, "cherry");
        System.out.println(list);
        list.remove("cherry");
        System.out.println(list);
       // list.remove(7);
        //System.out.println(list);

       // list.clear();
        String s = list.get(2);
        System.out.println(s);
        list.remove(2);
        System.out.println(list);
        list.remove("apple");
        System.out.println(list);
        int index = list.indexOf("kiwi");
        System.out.println("in index " + index);
        System.out.println("size : " + list.size());
        boolean res = list.contains("lemon");
        System.out.println(res);
       // list.isEmpty();
        list.set(3,"pineapple");
        System.out.println(list);
        List<String> sub = list.subList(0, 3);
        System.out.println(sub);
        list.sort(null);
        System.out.println(list);
        ComparatorStringsReverse com = new ComparatorStringsReverse();
        list.sort(com);
        System.out.println(list);


        }
    }

