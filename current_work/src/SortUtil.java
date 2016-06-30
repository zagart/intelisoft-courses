import java.util.Comparator;

/**
 * Created by intelisoft on 13.06.2016.
 */
public class SortUtil {

    public static <T> void sort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (comparator.compare(array[i],array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
