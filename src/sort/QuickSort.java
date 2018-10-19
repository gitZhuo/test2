package sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 =new int[10000];
        int[] arr2 =new int[10000];
        for (int i = 0; i < 10000; i++) {
            int nextInt = random.nextInt(100);

            arr1[i]=nextInt;
            arr2[i]=nextInt;
        }

        System.out.println("arr:"+Arrays.toString(arr2));
        long start = System.currentTimeMillis();
        bubbleSort(arr1);
        System.out.println(System.currentTimeMillis()-start);

        start = System.currentTimeMillis();
        quick(arr2,0,arr2.length-1);
        System.out.println(System.currentTimeMillis()-start);


    }

    private static void quick(int[] arr, int left, int right) {

        if(left>right){
            return;
        }

        int i = left;
        int j =right;
        int base=arr[left];

        while(i!=j) {
            while (arr[j] >= base && i < j) {
                j--;

            }
            while (arr[i] <= base && i < j){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        arr[left]=arr[i];
        arr[i]=base;

        quick(arr,left,i-1);
        quick(arr,i+1,right);
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
