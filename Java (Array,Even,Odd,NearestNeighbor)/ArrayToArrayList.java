import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        // Convert array to ArrayList
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("Array converted to ArrayList: " + arrayList);

        // Convert ArrayList to array
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer[] array2 = arrayList2.toArray(new Integer[0]);
        System.out.print("ArrayList converted to array: ");
        for (Integer num : array2) {
            System.out.print(num + " ");
        }
    }
}
