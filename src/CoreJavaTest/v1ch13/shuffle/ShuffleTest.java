package CoreJavaTest.v1ch13.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mizeshuang on 2016/5/30.
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<50;i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        List<Integer> integerList = list.subList(0, 6);

        Collections.sort(integerList);

        for (Integer i : integerList) {
            System.out.println(i);
        }
    }
}
