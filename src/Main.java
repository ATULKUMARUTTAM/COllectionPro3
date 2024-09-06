import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List L = new ArrayList<>();

        L.add(10);
        L.add(1320);
        L.add(133);
        L.add(144);
        L.add(14);
        L.add(40);
        System.out.println(L);

        Collections.sort(L);
        System.out.println(L);

        /*Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };*/

        Comparator c  = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                  if(o1%10 >o2%10)
                       return 1;
                  else
                      return -1;

            }
        };

        Collections.sort(L, c);
        System.out.println(L);
    }
}