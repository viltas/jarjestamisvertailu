package jarjestaminen.ui;

import jarjestaminen.algoritmit.HeapSort;
import jarjestaminen.algoritmit.InsertionSort;
import jarjestaminen.algoritmit.MergeSort;
import jarjestaminen.algoritmit.QuickSort;
import java.util.Scanner;

public class Ui {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna taulukon pituus: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("");

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            long ii = 100 * Integer.parseInt(Long.toString(System.nanoTime()).substring(0, 1));
            arr[i] = (int) (System.nanoTime() % ii);

        }

        long start = System.nanoTime();

        QuickSort quick = new QuickSort(arr);
        quick.sort(0, arr.length - 1);

        long end = System.nanoTime();
        long time = end - start;

        System.out.println("QuickSort: ");
        print(quick.getArr());
        System.out.println("Aikaa kului  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        start = System.nanoTime();
        
        InsertionSort insertion = new InsertionSort(arr);
        insertion.sort();

        end = System.nanoTime();
        time = end - start;
        
        System.out.println("InsertionSort: ");
        print(insertion.getArr());
        System.out.println("Aikaa kului  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        start = System.nanoTime();
        
        HeapSort heap = new HeapSort(arr);
        heap.sort();

        end = System.nanoTime();
        time = end - start;
        
        System.out.println("HeapSort: ");
        print(heap.getArr());
        System.out.println("Aikaa kului  " + time + " nanosekuntia.");

    }

    static void print(int arr[]) {
        int j = arr.length;
        for (int i = 0; i < j; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
