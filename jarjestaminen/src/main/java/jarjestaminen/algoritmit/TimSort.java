package jarjestaminen.algoritmit;

public class TimSort {

    private int[] arr;

    public TimSort(int[] arr) {

        this.arr = arr;

    }

    /**
     * Metodi palauttaa järjestettävän taulukon.
     *
     * @return luokkaan tallennettu taulukko
     */
    public int[] getArr() {
        return this.arr;
    }

    /**
     * Metodi järjestää taulukon luokkaan tallennetun taulukon arvot pienimmästä
     * suurimpaan timsort-hybridialgoritmilla, joka hyödyntää insertion sort
     * -algoritmiä sekä merge sort -algoritmin merge-ominaisuutta.
     *
     */
    public void sort() {
        int l = arr.length;
        // Järjestetään 64-mittaisina lohkoina taulukon osia insertionsortin avulla
        for (int i = 0; i < l; i += 64) {
            insertionHelper(i, l);
        }
        // Yhdistetään järjestetyt lohkot toisiinsa lomittamalla ne mergesortin avulla
        for (int s = 64; s < l; s = s * 2) {
            for (int a = 0; a < l; a += s * 2) {
                mergeHelper(a, s, l);
            }
        }
    }

    /**
     * apumetodi insertionSortin käyttämiseen.
     *
     */
    private void insertionHelper(int i, int l) {
        InsertionSort insertionSort = new InsertionSort(arr);
        int c = (64 + i) < (l - 1) ? (63 + 1) : (l - 2);
        insertionSort.sort(i, c);

    }

    /**
     * apumetodi mergesortin käyttämiseen.
     *
     */
    private void mergeHelper(int a, int s, int l) {
        int b = (a + 2 * s - 1) < (l - 2) ? (a + 2 * s - 1) : (l - 2);
        int k = a + s - 1;
        MergeSort mergeSort = new MergeSort(arr);
        if (b - k > -1) {
            mergeSort.merge(a, k, b);
        }

    }
}
