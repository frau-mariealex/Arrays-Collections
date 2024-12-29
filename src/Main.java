import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Arrays class methods:");

        byte[] byteArr = {1, 2, 3, 4, 5};
        System.out.println("1. byte[] full: " + Arrays.binarySearch(byteArr, (byte)3));

        System.out.println("2. byte[] range: " + Arrays.binarySearch(byteArr, 1, 4, (byte)3));

        char[] charArr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("3. char[] full: " + Arrays.binarySearch(charArr, 'c'));

        System.out.println("4. char[] range: " + Arrays.binarySearch(charArr, 1, 4, 'c'));

        double[] doubleArr = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("5. double[] full: " + Arrays.binarySearch(doubleArr, 3.0));

        System.out.println("6. double[] range: " + Arrays.binarySearch(doubleArr, 1, 4, 3.0));

        float[] floatArr = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        System.out.println("7. float[] full: " + Arrays.binarySearch(floatArr, 3.0f));

        System.out.println("8. float[] range: " + Arrays.binarySearch(floatArr, 1, 4, 3.0f));

        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println("9. int[] full: " + Arrays.binarySearch(intArr, 3));

        System.out.println("10. int[] range: " + Arrays.binarySearch(intArr, 1, 4, 3));

        long[] longArr = {1L, 2L, 3L, 4L, 5L};
        System.out.println("11. long[] full: " + Arrays.binarySearch(longArr, 3L));

        System.out.println("12. long[] range: " + Arrays.binarySearch(longArr, 1, 4, 3L));

        short[] shortArr = {1, 2, 3, 4, 5};
        System.out.println("13. short[] full: " + Arrays.binarySearch(shortArr, (short)3));

        System.out.println("14. short[] range: " + Arrays.binarySearch(shortArr, 1, 4, (short)3));

        String[] stringArr = {"apple", "banana", "orange"};
        System.out.println("15. T[] with comparator: " + Arrays.binarySearch(stringArr, "banana", String::compareTo));

        System.out.println("16. T[] range with comparator: " + Arrays.binarySearch(stringArr, 0, 3, "banana", String::compareTo));

        System.out.println("\nTesting Collections class methods:");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("17. List with Comparable: " + Collections.binarySearch(list, 3));

        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println("18. List with Comparator: " + Collections.binarySearch(list, 3, comparator));
    }
}