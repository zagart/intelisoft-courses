package by.grodno.zagart.java.intelisoft;

import java.util.Vector;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class Store {

    private Vector<Integer> integers = new Vector<Integer>(10);

    public boolean add(Integer integer) {
        if (integers.size() < 10) {
            integers.insertElementAt(integer, integers.size());
            return true;
        }
        return false;
    }

    public boolean remove() {
        if (integers.size() > 0) {
            integers.remove(integers.size() - 1);
            integers.trimToSize();
            return true;
        }
        return false;
    }

}
