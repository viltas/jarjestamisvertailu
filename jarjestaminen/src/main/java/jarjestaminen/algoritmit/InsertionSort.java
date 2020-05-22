package jarjestaminen.algoritmit;

public class InsertionSort {

    private int[] arr;

    public InsertionSort(int[] arr) {

        this.arr = arr;

    }

    public int[] getArr() {
        return this.arr;
    }

    /**
     * Metodi järjestää taulukon luokkaan tallennetun taulukon arvot pienimmästä
     * suurimpaan quicksort-algoritmia hyödyntäen.
     *
     */
    public void sort() {
        int n = arr.length;

        for (int i = 1; i <= n - 1; i++) {
            int ii = i - 1;

            while (ii >= 0 && arr[ii] > arr[ii + 1]) {
                int temp = arr[ii];
                arr[ii] = arr[ii + 1];
                arr[ii + 1] = temp;
                ii -= 1;
            }
        }

    }
}
