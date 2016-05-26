package CoreJavaTest.v1ch12.Pair1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * Created by mizeshuang on 2016/5/25.
 */
public class PairTest1 {
    public static void main(String[] args) {
        Collection<String> coll = new AbstractCollection<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        Collection<Pair<String>> collection = new Collection<Pair<String>>() {
            Vector<Pair<String>> vector = new Vector<>();
            int size;

            @Override
            public int size() {
                return size;
            }

            @Override
            public boolean isEmpty() {
                return size == 0;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pair<String>> iterator() {
                return new myIterator();
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Pair<String> stringPair) {
                if (vector.add(stringPair)) {
                    size++;
                    return true;
                }
                return false;
            }

            @Override
            public boolean remove(Object o) {
                if (vector.remove(o)) {
                    size--;
                    return true;
                }
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pair<String>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            class myIterator implements Iterator {
                @Override
                public void remove() {

                }

                @Override
                public void forEachRemaining(Consumer action) {

                }

                @Override
                public boolean hasNext() {
                    return size!=0;
                }

                @Override
                public Object next() {
                    return vector.remove(--size);
                }
            }
        };
        Pair<String> pair = new Pair<>("1", "2");
        Pair<String> pair1 = new Pair<>("3", "4");
        ArrayAlg.addAll(collection,pair,pair1);
        collection.remove(pair);
        for (Pair<String> i : collection) {
            System.out.println(i.getFirst());
        }
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if(a==null||a.length==0) return null;
        String small = a[0];
        String most = a[0];
        for (int i = 1; i < a.length; i++) {
            if(small.compareTo(a[i])>0) small = a[i];
            if(most.compareTo(a[i])<0) most = a[i];
        }
        return new Pair<String>(small, most);
    }

    public static void addAll(Collection<Pair<String>> collections,Pair<String>... a) {
        for (Pair<String> i : a) {
            collections.add(i);
        }
    }
}