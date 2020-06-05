package jarjestaminen.ui;

import jarjestaminen.algoritmit.HeapSort;
import jarjestaminen.algoritmit.InsertionSort;
import jarjestaminen.algoritmit.MergeSort;
import jarjestaminen.algoritmit.QuickSort;
import jarjestaminen.algoritmit.TimSort;

public class Commands {

    static long quickSort(int[] arr, int[] arr2, int[] arr3) {
        long[] times = new long[3];
        for (int i = 0; i < 3; i++) {
            QuickSort quick = new QuickSort(arr);
            long start = System.nanoTime();
            quick.sort(0, arr.length - 1);
            long end = System.nanoTime();
            long time = end - start;
            times[i] = time;
        }
        long x = (times[0] + times[1] + times[2]) / 3;
        return x;
    }

    static long heapSort(int[] arr, int[] arr2, int[] arr3) {
        long[] times = new long[3];
        for (int i = 0; i < 3; i++) {
            HeapSort heap = new HeapSort(arr);
            long start = System.nanoTime();
            heap.sort();
            long end = System.nanoTime();
            long time = end - start;
            times[i] = time;
        }
        long x = (times[0] + times[1] + times[2]) / 3;
        return x;
    }

    static long mergeSort(int[] arr, int[] arr2, int[] arr3) {
        long[] times = new long[3];
        for (int i = 0; i < 3; i++) {
            MergeSort merge = new MergeSort(arr);
            long start = System.nanoTime();
            merge.sort(0, arr.length - 1);
            long end = System.nanoTime();
            long time = end - start;
            times[i] = time;
        }
        long x = (times[0] + times[1] + times[2]) / 3;

        return x;
    }

    static long timSort(int[] arr, int[] arr2, int[] arr3) {
        long[] times = new long[3];
        for (int i = 0; i < 3; i++) {
            TimSort tim = new TimSort(arr);
            long start = System.nanoTime();
            tim.sort();
            long end = System.nanoTime();
            long time = end - start;
            times[i] = time;
        }
        long x = (times[0] + times[1] + times[2]) / 3;
        return x;
    }

    static long insertionSort(int[] arr, int[] arr2, int[] arr3) {
        long[] times = new long[3];
        for (int i = 0; i < 3; i++) {
            InsertionSort insertion = new InsertionSort(arr);
            long start = System.nanoTime();
            insertion.sort(0, arr.length - 1);
            long end = System.nanoTime();
            long time = end - start;
            times[i] = time;
        }
        long x = (times[0] + times[1] + times[2]) / 3;
        return x;
    }

}
