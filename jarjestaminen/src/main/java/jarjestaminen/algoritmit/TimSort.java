package jarjestaminen.algoritmit;

public class TimSort {

    private static int[] arr;

    public TimSort(int[] arr) {

        this.arr = arr;

    }

    public int[] getArr() {
        return this.arr;
    }

    
    /**
     * Metodi järjestää taulukon luokkaan tallennetun taulukon arvot pienimmästä
     * suurimpaan timsort-hybridialgoritmilla, joka hyödyntää insertion sort -algoritmiä
     * sekä merge sort -algoritmin merge-ominaisuutta.
     *
     */
    public static void sort() {
        int l = arr.length;
        for (int i = 0; i < l; i += 64) {
            insertionHelper(i, l);
        }
        for (int s = 64; s < l; s = s * 2) {
            for (int a = 0; a < l; a += s * 2) {
                mergeHelper(a, s, l);
            }
        }
    }

    private static void insertionHelper(int i, int l) {
        InsertionSort insertionSort = new InsertionSort(arr);
        int c = (64 + i) < (l - 1) ? (63 + 1) : (l - 2);
        insertionSort.sort(i, c);
        arr = insertionSort.getArr();
    }

    private static void mergeHelper(int a, int s, int l) {
        int b = (a + 2 * s - 1) < (l - 2) ? (a + 2 * s - 1) : (l - 2);
        int k = a + s - 1;
        MergeSort mergeSort = new MergeSort(arr);
        if (b-k > -1) {
        mergeSort.merge(a, k, b);
        }
        arr = mergeSort.getArr();
    }
}
