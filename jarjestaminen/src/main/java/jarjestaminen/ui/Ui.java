package jarjestaminen.ui;

import java.util.Random;
import java.util.Scanner;


public class Ui {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna taulukon pituus väliltä: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        if (length == -1) {
            SuoritusTestit.kouluarvosanat();
            
        }

        System.out.println("Yläraja taulukon arvoille: ");
        int limit1 = Integer.parseInt(sc.nextLine());

        System.out.println("Alaraja taulukon arvoille: ");
        int limit2 = Integer.parseInt(sc.nextLine());

        int[] arr = arrayGenerator(length, limit1, limit2);

        //printArray(arr);
        long time = 0;

        try {
            time = Commands.quickSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("QuickSort: ");
        System.out.println("Aikaa kului keskimäärin " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try {
            time = Commands.insertionSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
            time = 0;
        }

        System.out.println("InsertionSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try {
            time = Commands.heapSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
            time = 0;
        }

        System.out.println("HeapSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try {
            time = Commands.mergeSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
            time = 0;
        }

        System.out.println("MergeSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try {
            time = Commands.timSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
            time = 0;
        }

        System.out.println("TimSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");
        
        
        System.out.println("");
        System.out.println("");

        try {
            time = Commands.introSort(arr);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
            time = 0;
        }

        System.out.println("IntroSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

    }

    static void printArray(int arr[]) {
        int j = arr.length;
        for (int i = 0; i < j; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static int[] arrayGenerator(int n, int limit1, int limit2) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((limit1 - limit2) + 1) + limit2;
        }
        
        return arr;
    }

}
