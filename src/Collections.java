import java.util.List;
import java.util.Comparator;

public class Collections {
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return java.util.Collections.binarySearch(list, key);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return java.util.Collections.binarySearch(list, key, c);
    }
}