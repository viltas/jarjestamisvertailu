package jarjestaminen.ui;

import jarjestaminen.ui.Commands;
import java.util.Random;

public class SuoritusTestit {

    public static void kouluarvosanat() {

        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((10 - 4) + 1) + 4;
        }

        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        long time = Commands.insertionSort(arrCopy);
        System.out.println("insertionsort: " + time);
        
      //  time = Commands.quickSort(arrCopy);
      //  arrCopy = new int[arr.length];
      //  System.arraycopy(arr, 0, arrCopy, 0, arr.length);
      //  System.out.println("quicksort:" + time);
        
        time = Commands.heapSort(arrCopy);
        arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        System.out.println("heapsort: " + time);
        
        time = Commands.mergeSort(arrCopy);
        arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        System.out.println("mergesort:" + time);
        
        time = Commands.insertionSort(arrCopy);
        arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        time = Commands.timSort(arr);
        System.out.println("timsort: " + time);
    }

}


