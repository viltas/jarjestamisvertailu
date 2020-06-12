package jarjestaminen.algoritmit;

public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {

        this.arr = arr;
    }

    public int[] getArr() {
        return this.arr;
    }

    public int part(int a, int b) {
        int k = a;
        for (int i = a + 1; i <= b; i++) {
            if (arr[i] < arr[a]) {
                k += 1;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        int temp = arr[a];
        arr[a] = arr[k];
        arr[k] = temp;
        return k;
    }

    /**
     * Metodi järjestää rekursiivisesti luokkaan tallennetun taulukon annetulla
     * välillä olevat alkiot quicksort-algoritmin avulla.
     *
     * @param a Tarkasteltavan välin pienin arvo
     * @param b Tarkasteltavan välin suurin arvo
     *
     */
    public void sort(int a, int b) {
        if (a < b) {
            int k = part(a, b);

            sort(a, k - 1);
            sort(k + 1, b);
        }
    } 
}
