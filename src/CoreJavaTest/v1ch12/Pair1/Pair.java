package CoreJavaTest.v1ch12.Pair1;

/**
 * Created by mizeshuang on 2016/5/24.
 */
public class Pair<T> {
    private T first;
    private T second;
    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {

        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("mizeshuang","guojiaqi");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Pair<String>[] table =(Pair<String>[]) new Pair<?>[10];
    }
}
