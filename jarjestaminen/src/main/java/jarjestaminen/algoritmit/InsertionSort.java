package jarjestaminen.algoritmit;

public class InsertionSort {

    private int[] arr;

    public InsertionSort(int[] arr) {

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
     * suurimpaan quicksort-algoritmia hyödyntäen.
     *
     * @param a Tarkasteltavan välin pienin arvo 
     * @param b Tarkasteltavan välin suurin arvo
     */
    public void sort(int a, int b) {
        int n = b;
        // käydään taulukon kaikki paitsi ensimmäinen alkio läpi
        for (int i = a + 1; i <= n; i++) {
            int ii = i - 1;
            // siirretään alkio järjestetyn taulukon alkuosaan omalle paikalleen        
            while (ii >= 0 && arr[ii] > arr[ii + 1]) {
                int temp = arr[ii];
                arr[ii] = arr[ii + 1];
                arr[ii + 1] = temp;
                ii -= 1;
            }
        }

    }
}
