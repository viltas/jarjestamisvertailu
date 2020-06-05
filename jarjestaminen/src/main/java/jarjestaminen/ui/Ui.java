package jarjestaminen.ui;

import jarjestaminen.algoritmit.HeapSort;
import jarjestaminen.algoritmit.InsertionSort;
import jarjestaminen.algoritmit.IntroSort;
import jarjestaminen.algoritmit.MergeSort;
import jarjestaminen.algoritmit.QuickSort;
import jarjestaminen.algoritmit.TimSort;
import java.util.Scanner;

public class Ui {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna taulukon pituus väliltä: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("");

        int[] arr = arrayGenerator(length);
        int[] arr2 = arrayGenerator(length);
        int[] arr3 = arrayGenerator(length);

        long time = 0;
        
        
        try{
            time = Commands.quickSort(arr, arr2, arr3);
        }
        catch(StackOverflowError e){
            System.err.println("Stackoverflowerror!");
        }
        

        System.out.println("QuickSort: ");
        System.out.println("Aikaa kului  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try{
            time = Commands.insertionSort(arr, arr2, arr3);
        }
        catch(StackOverflowError e){
            System.err.println("Stackoverflowerror!");
        }


        System.out.println("InsertionSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");

        try{
            time = Commands.heapSort(arr, arr2, arr3);
        }
        catch(StackOverflowError e){
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("HeapSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");
        
        try{
            time = Commands.mergeSort(arr, arr2, arr3);
        }
        catch(StackOverflowError e){
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("MergeSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

        System.out.println("");
        System.out.println("");
        
        try{
            time = Commands.timSort(arr, arr2, arr3);
        }
        catch(StackOverflowError e){
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("TimSort: ");
        System.out.println("Aikaa kului keskimäärin  " + time + " nanosekuntia.");

    }

    static void printArray(int arr[]) {
        int j = arr.length;
        for (int i = 0; i < j; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static int[] arrayGenerator(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {          
            arr[i] = (int)(Math.random()*1000000);

        }
        return arr;
    }

}
