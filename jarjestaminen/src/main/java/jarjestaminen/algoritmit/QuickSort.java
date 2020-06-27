package jarjestaminen.algoritmit;

public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {

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
     * Metodi valitsee jakoalkion ja siirtää taulukon alkioita sen mukaisesti ja
     * palauttaa sitten kohdan jossa jakoalkio lopuksi on.
     *
     * @param a Tarkasteltavan välin pienin arvo
     * @param b Tarkasteltavan välin suurin arvo
     * @return Kohta jossa jakoalkio lopuksi on
     *
     */
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
        swap(a, k);
        return k;
    }

    /**
     * Metodi vaihtaa taulukossa kahden arvon paikkaa keskenään.
     *
     * @param i Tarkasteltavan arvo sijainti taulukossa
     * @param ii Toisen tarkasteltavan arvon sijainti taulukossa
     *
     */
    private void swap(int i, int ii) {
        int j = arr[i];
        arr[i] = arr[ii];
        arr[ii] = j;
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
        if (a <= b) {
            int k = part(a, b);
            sort(a, k - 1);
            sort(k + 1, b);
        }
    }
}
