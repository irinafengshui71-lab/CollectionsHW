import java.util.ArrayList;

public class MainListsTest1 {

    public static void main(String[] args){
        ArrayList<String>list1 =
                new ArrayList<>();
        list1.add("Hello");
        list1.add("bye");
        list1.add("performance");
        list1.add("no");
        list1.add("banana");
        list1.add("I");
        list1.add("love");
        list1.add("sausage");
        System.out.println(list1.toString());
        for (int i = 0; i< list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();
        for (String str: list1){
            System.out.print(str + " ");
        }
        System.out.println();
        ComparatorStringsByLength comp1 =
                new ComparatorStringsByLength();
        list1.sort(comp1);
        System.out.println(list1);
    }
}
