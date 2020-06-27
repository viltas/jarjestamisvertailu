package jarjestaminen.ui;

import jarjestaminen.ui.Commands;
import java.util.Arrays;
import java.util.Random;

public class SuoritusTestit {

    public static void suoritusTestitSuorita(int pituus) {

        System.out.println("Kouluarvosanat: ");
        System.out.println("");
        SuoritusTestit.kouluarvosanat(pituus);

        System.out.println("");
        System.out.println("- - - - - - - - - ");
        System.out.println("");
        System.out.println("Päinvastainen järjestys: ");
        System.out.println("");
        SuoritusTestit.painvastainenJarjestys(pituus);
        System.out.println("");
        System.out.println("- - - - - - - - - ");
        System.out.println("");
        System.out.println("Valmiiksi järjestetty: ");
        System.out.println("");
        SuoritusTestit.valmiiksiJarjestetty(pituus);
        System.out.println("");
        System.out.println("- - - - - - - - - ");
        System.out.println("");
        System.out.println("Syklittäinen järjestys: ");
        System.out.println("");
        SuoritusTestit.sykleittainenJarjestys(pituus);
        System.out.println("");
        System.out.println("- - - - - - - - - ");
        System.out.println("");
    }

    public static int[] luoArvosanaTaulukko(int pituus) {
        int[] arr = new int[pituus];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((10 - 4) + 1) + 4;
        }
        return arr;

    }

    public static void kouluarvosanat(int pituus) {

        int[] arrIn = luoArvosanaTaulukko(pituus);
        long time = 0;
        try {
            time = Commands.insertionSort(arrIn);
            System.out.println("insertionsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");

        try {
            int[] arrQuick = luoArvosanaTaulukko(pituus);
            time = Commands.quickSort(arrQuick);
            System.out.println("quicksort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");
        try {
            int[] arrHeap = luoArvosanaTaulukko(pituus);
            time = Commands.heapSort(arrHeap);
            System.out.println("heapsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrMerge = luoArvosanaTaulukko(pituus);
            time = Commands.mergeSort(arrMerge);
            System.out.println("mergesort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrTim = luoArvosanaTaulukko(pituus);
            time = Commands.timSort(arrTim);
            System.out.println("timsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrIntro = luoArvosanaTaulukko(pituus);
            time = Commands.introSort(arrIntro);
            System.out.println("introsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");

    }

    public static int[] luoValmiiksiJarjestettyTaulukko(int pituus) {
        int[] arr = new int[pituus];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void valmiiksiJarjestetty(int pituus) {

        int[] arrIn = luoValmiiksiJarjestettyTaulukko(pituus);
        long time = 0;
        try {
            time = Commands.insertionSort(arrIn);
            System.out.println("insertionsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");

        try {
            int[] arrQuick = luoValmiiksiJarjestettyTaulukko(pituus);
            time = Commands.quickSort(arrQuick);
            System.out.println("quicksort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");
        try {
            int[] arrHeap = luoValmiiksiJarjestettyTaulukko(pituus);
            time = Commands.heapSort(arrHeap);
            System.out.println("heapsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrMerge = luoValmiiksiJarjestettyTaulukko(pituus);
            time = Commands.mergeSort(arrMerge);
            System.out.println("mergesort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrTim = luoValmiiksiJarjestettyTaulukko(pituus);
            time = Commands.timSort(arrTim);
            System.out.println("timsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrIntro = luoValmiiksiJarjestettyTaulukko(pituus);
            time = Commands.introSort(arrIntro);
            System.out.println("introsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");

    }

    public static int[] luoPainVastainenTaulukko(int pituus) {

        int[] arr = new int[pituus];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        return arr;
    }

    public static void painvastainenJarjestys(int pituus) {

        int[] arrIn = luoPainVastainenTaulukko(pituus);
        long time = 0;
        try {
            time = Commands.insertionSort(arrIn);
            System.out.println("insertionsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");

        try {
            int[] arrQuick = luoPainVastainenTaulukko(pituus);
            time = Commands.quickSort(arrQuick);
            System.out.println("quicksort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");
        try {
            int[] arrHeap = luoPainVastainenTaulukko(pituus);
            time = Commands.heapSort(arrHeap);
            System.out.println("heapsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrMerge = luoPainVastainenTaulukko(pituus);
            time = Commands.mergeSort(arrMerge);
            System.out.println("mergesort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrTim = luoPainVastainenTaulukko(pituus);
            time = Commands.timSort(arrTim);
            System.out.println("timsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrIntro = luoPainVastainenTaulukko(pituus);
            time = Commands.introSort(arrIntro);
            System.out.println("introsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");

    }

    public static int[] luoSykleittainenTaulukko(int pituus) {
        int[] arr = new int[pituus];
        int[] minus = {-20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2 - 1};
        int[] plus = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int ii = 0; ii < minus.length; ii++) {
                if (i >= arr.length) {
                    break;
                }
                arr[i] = minus[ii] + rand.nextInt(3 - -2 + 1) + -2;

                i++;
            }

            for (int iii = 0; iii < plus.length; iii++) {
                if (i >= arr.length) {
                    break;
                }
                arr[i] = plus[iii] + rand.nextInt(3 - -2 + 1) + -2;

                i++;
            }
        }
        return arr;
    }

    public static void sykleittainenJarjestys(int pituus) {

        int[] arrIn = luoSykleittainenTaulukko(pituus);
        long time = 0;
        try {
            time = Commands.insertionSort(arrIn);
            System.out.println("insertionsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");

        try {
            int[] arrQuick = luoSykleittainenTaulukko(pituus);
            time = Commands.quickSort(arrQuick);
            System.out.println("quicksort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }

        System.out.println("");
        try {
            int[] arrHeap = luoSykleittainenTaulukko(pituus);
            time = Commands.heapSort(arrHeap);
            System.out.println("heapsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrMerge = luoSykleittainenTaulukko(pituus);
            time = Commands.mergeSort(arrMerge);
            System.out.println("mergesort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrTim = luoSykleittainenTaulukko(pituus);
            time = Commands.timSort(arrTim);
            System.out.println("timsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");
        try {
            int[] arrIntro = luoSykleittainenTaulukko(pituus);
            time = Commands.introSort(arrIntro);
            System.out.println("introsort: " + time);
        } catch (StackOverflowError e) {
            System.err.println("Stackoverflowerror!");
        }
        System.out.println("");

    }
}
