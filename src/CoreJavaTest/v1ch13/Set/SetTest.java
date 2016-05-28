package CoreJavaTest.v1ch13.Set;

import javafx.scene.shape.Rectangle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mizeshuang on 2016/5/27.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Scanner in = new Scanner(System.in);
        long totalTime = 0;
        while (in.hasNext()) {
            String temp = in.next();
            long callTime = System.currentTimeMillis();
            stringSet.add(temp);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iterator = stringSet.iterator();
        for(int i=0;i<=20&&iterator.hasNext();i++) {
            System.out.println(iterator);
        }
        System.out.println("...");
        System.out.println(stringSet.size() + "distinct words" + totalTime + "milliseconds");
    }
}
