package jarjestaminen.ui;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ui {

    public static void start() {

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Anna taulukon pituus (-1 käynnistää suorituskykytestit): ");
            int length = 0;
            while (true) {
                String input = sc.nextLine();
                try {
                    length = Integer.parseInt(input);
                    if (length < -1) {
                        System.out.println("Taulukon pituus ei voi olla negatiivinen (-1 käynnistää suorituskykytestit)");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Et antanut sopivaa arvoa. Yritä uudestaan:");
                }

            }
            System.out.println("");

            if (length == -1) {
                System.out.println("###################");
                System.out.println("n = 100");
                System.out.println("");
                SuoritusTestit.suoritusTestitSuorita(100);
                System.out.println("");
                System.out.println("###################");
                System.out.println("");
                System.out.println("n = 1000");
                System.out.println("");
                SuoritusTestit.suoritusTestitSuorita(1000);
                System.out.println("");
                System.out.println("###################");
                System.out.println("");
                System.out.println("n = 10000");
                System.out.println("");
                SuoritusTestit.suoritusTestitSuorita(10000);
                System.out.println("");
                System.out.println("###################");
                System.out.println("");
                System.out.println("n = 200000");
                System.out.println("");
                SuoritusTestit.suoritusTestitSuorita(200000);
                System.out.println("");
                System.out.println("###################");
                System.out.println("");
                break;

            }

            System.out.println("Anna yläraja taulukon arvoille: ");

            int limit1 = 0;
            while (true) {
                String input = sc.nextLine();
                try {
                    limit1 = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Et antanut sopivaa arvoa. Yritä uudestaan:");
                }

            }

            System.out.println("Anna alaraja taulukon arvoille: ");
            int limit2 = 0;
            while (true) {
                String input = sc.nextLine();
                try {
                    limit2 = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Et antanut sopivaa arvoa. Yritä uudestaan:");
                }

            }

            int[] arr = arrayGenerator(length, limit1, limit2);

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

            break;
        }
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
