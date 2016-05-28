package CoreJavaTest.v1ch13.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by mizeshuang on 2016/5/26.
 */
public class LInkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Amy");
        list.add("Carl");
        list.add("Erica");
        List<String> list1 = new LinkedList<>();
        list1.add("Bob");
        list1.add("Doug");
        list1.add("Frances");
        list1.add("Gloria");

        //merge the words from b into a
        ListIterator<String> aIterator = list.listIterator();
        Iterator<String> bIterator = list1.iterator();
        while (bIterator.hasNext()) {
            if (aIterator.hasNext()) {
                aIterator.next();
            }
            aIterator.add(bIterator.next());
        }
        System.out.println(list);

        //remove every second word from b
        bIterator = list1.iterator();
        while (bIterator.hasNext()) {
            bIterator.next();//skip one element
            if (bIterator.hasNext()) {
                bIterator.next();//skip next element
                bIterator.remove();//remove that element
            }
        }
        System.out.println(list1);

        list.removeAll(list1);
        System.out.println(list);
    }
}
