package jarjestaminen.algoritmit;

public class HeapSort {

    private int[] arr;

    public HeapSort(int[] arr) {
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
     * Metodi järjestää luokkaan tallennetun taulukon alkiot pienimmästä
     * suurimpaan heapsort-algoritmin avulla.
     *
     *
     *
     */
    public void sort() {

        // luodaan keko
        for (int i = arr.length / 2 - 1; 0 <= i; i--) {
            heapify(arr.length, i);
        }

        // siirretään juuri loppuun ja luodaan keko uudelleen
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(0, i);
            heapify(i, 0);
        }
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
     * Metodi varmistaa, että keko on kekoehtoa totteleva maksimikeko.
     *
     * @param s Tarkasteltavan keon koko
     * @param x Tarkasteltavan keon juuri
     *
     */
    private void heapify(int s, int x) {

        int top = x;
        int a = 1 + 2 * x;
        int b = 2 + 2 * x;
        if (a < s && arr[a] > arr[top]) {
            top = a;
        }
        if (b < s && arr[b] > arr[top]) {
            top = b;
        }
        if (top != x) {
            swap(x, top);
            heapify(s, top);
        }
    }
    
    
}
