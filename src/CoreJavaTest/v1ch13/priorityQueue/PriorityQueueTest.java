package CoreJavaTest.v1ch13.priorityQueue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;


/**
 * Created by mizeshuang on 2016/5/27.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        priorityQueue.add(new GregorianCalendar(1815, Calendar.DECEMBER, 11));
        priorityQueue.add(new GregorianCalendar(1956, Calendar.DECEMBER, 10));
        priorityQueue.add(new GregorianCalendar(1702, Calendar.JUNE, 9));


        System.out.println("Iterating over element");

        for (GregorianCalendar date : priorityQueue) {
            System.out.println(date.get(Calendar.YEAR));
        }

        System.out.println("Removing the elements");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove().get(Calendar.YEAR));
        }
    }
}
