package jarjestaminen.algoritmit;

public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr) {

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
     * Metodi järjestää rekursiivisesti luokkaan tallennetun taulukon annetulla
     * välillä olevat alkiot merge sort-algoritmin avulla.
     *
     * @param a Tarkasteltavan välin pienin arvo
     * @param b Tarkasteltavan välin suurin arvo
     *
     */
    public void sort(int a, int b) {
        if (a < b) {
            //haetaan keskikohta
            int k = (a + b) / 2;
            sort(a, k);
            sort(k + 1, b);
            //lomitetaan järjestetyt osat merge-metodilla toisiinsa
            merge(a, k, b);
        }
    }

    /**
     * Metodi lomittaa taulukon järjestetyt puoliskot.
     *
     * @param a Tarkasteltavan välin pienin arvo
     * @param b Tarkasteltavan välin suurin arvo
     * @param k Tarkasteltavan välin keskikohta
     *
     */
    public void merge(int a, int k, int b) {

        //selvitetään lomitettavien taulukoiden pituudet
        int lA = k - a + 1;
        int lB = b - k;

        // luodaan väliaikaiset taulukot ja siirretään niihin väliaikaisdata
        int[] arrA = new int[lA];
        int[] arrB = new int[lB];
        for (int i = 0; i < lA; i++) {
            arrA[i] = arr[a + i];
        }
        for (int i = 0; i < lB; i++) {
            arrB[i] = arr[k + 1 + i];
        }

        //yhdistetään taulukot toisiinsa
        int x = a;
        int i = 0;
        int ii = 0;
        while (i < lA && ii < lB) {
            if (arrA[i] <= arrB[ii]) {
                arr[x] = arrA[i];
                i++;
            } else {
                arr[x] = arrB[ii];
                ii++;
            }
            x++;
        }
        while (i < lA) {
            arr[x] = arrA[i];
            i++;
            x++;
        }
        while (ii < lB) {
            arr[x] = arrB[ii];
            ii++;
            x++;
        }
    }
}
