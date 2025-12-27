import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1,10);
        list.add(1,20);
        list.set(5,20);
        // list.add(15,10);
        System.out.println(list.indexOf(10));
        for(int a : list)
        {
            System.out.println(a);
        }

        Set<Integer> set = new HashSet<>(5);
    }
}