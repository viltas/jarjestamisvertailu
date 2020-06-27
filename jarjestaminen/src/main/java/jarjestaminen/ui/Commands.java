package jarjestaminen.ui;

import jarjestaminen.algoritmit.HeapSort;
import jarjestaminen.algoritmit.InsertionSort;
import jarjestaminen.algoritmit.IntroSort;
import jarjestaminen.algoritmit.MergeSort;
import jarjestaminen.algoritmit.QuickSort;
import jarjestaminen.algoritmit.TimSort;

public class Commands {

    public static long quickSort(int[] arr) {
        QuickSort quick = new QuickSort(arr);
        long start = System.nanoTime();
        quick.sort(0, arr.length - 1);
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

    public static long heapSort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        HeapSort heap = new HeapSort(arrCopy);
        long start = System.nanoTime();
        heap.sort();
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

    public static long mergeSort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        MergeSort merge = new MergeSort(arrCopy);
        long start = System.nanoTime();
        merge.sort(0, arrCopy.length - 1);
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

    public static long timSort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        TimSort tim = new TimSort(arrCopy);
        long start = System.nanoTime();
        tim.sort();
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

    public static long insertionSort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        InsertionSort insertion = new InsertionSort(arrCopy);
        long start = System.nanoTime();
        insertion.sort(0, arrCopy.length - 1);
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

    public static long introSort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        IntroSort intro = new IntroSort(arrCopy);
        long start = System.nanoTime();
        intro.sort();
        long end = System.nanoTime();
        long time = end - start;
        return time;
    }

}
