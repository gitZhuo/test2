package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,7,9,0,2,5,8};
        System.out.println("排序前"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后"+Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
