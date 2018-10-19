import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 4, 6};

        sort_guibin(arr1, arr2);

    }

    private static void sort_guibin(int[] arr1, int[] arr2) {
        ArrayList<Integer> integers = new ArrayList<>();
        List<int[]> list = Arrays.asList(arr1,arr2);
        for (int[] ints : list) {
            for (int i : ints) {
                integers.add(i);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }


}
