package CoreJavaTest.v1ch12.Pair2;

import CoreJavaTest.v1ch12.Pair1.Pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by mizeshuang on 2016/5/25.
 */
public class PairTest2 {
    public static void main(String[] args) {
        GregorianCalendar[] birthday = {
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(1864, Calendar.DECEMBER, 10),
                new GregorianCalendar(1916,Calendar.DECEMBER,11),
                new GregorianCalendar(1856,Calendar.JUNE,23)
        };

        Pair<GregorianCalendar> pair = ArrayAlg.minmax(birthday);
        System.out.println(pair.getFirst().getTime());
        System.out.println(pair.getSecond().getTime());
    }
}

class ArrayAlg {
    public static <T extends Comparable>Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T smalllest = a[0];
        T largelest = a[0];
        for (int i = 1; i < a.length; i++) {
            if(smalllest.compareTo(a[i])>0) smalllest = a[i];
            if(largelest.compareTo(a[i])<0) largelest = a[i];
        }
        return new Pair<T>(smalllest, largelest);
    }
}
