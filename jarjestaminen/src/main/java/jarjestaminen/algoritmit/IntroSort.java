package jarjestaminen.algoritmit;

public class IntroSort {

    private int[] arr;
    private int size;

    public IntroSort(int[] arr) {

        this.arr = arr;
        this.size = arr.length;

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
     * Metodi määrittää rekursiosyvyyden ja kutsuu sitten introsort-algoritmia.
     *
     */
    public void sort() {
        int maxDepth = (int) (Math.log(arr.length) * 2);
        introSort(maxDepth, 0, arr.length - 1);
    }

    /**
     * Metodi järjestää rekursiivisesti luokkaan tallennetun taulukon annetulla
     * välillä olevat alkiot introsort-algoritmin avulla.
     *
     * @param maxDepth raja rekursiosyvyydelle
     * @param a Tarkasteltavan välin pienin arvo
     * @param b Tarkasteltavan välin suurin arvo
     *
     */
    private void introSort(int maxDepth, int a, int b) {
        // järjestettävien alkioiden määrän ollessa tarpeeksi suuri käytetään quicksortia tai heapsortia
        if (b - a > 20) {
            if (maxDepth == 0) {
                // siirrytään heapsortiin jos rekursion maxdepth saavutetaan
                HeapSort heap = new HeapSort(arr);
                heap.sort();
                return;
            }
            // hyödynnetään quicksortin jako-metodia ja saadaan jakoalkio
            QuickSort quick = new QuickSort(arr);
            int p = quick.part(a, b);

            // järjestetään rekursiivisesti taulukko ennen ja jälkeen jakoalkiota
            introSort(a, p - 1, maxDepth);
            introSort(p + 1, b, maxDepth);
        } else {
            // järjestettävien alkioiden määrän ollessa pieni käytetään insertionsortia
            InsertionSort in = new InsertionSort(arr);
            in.sort(a, b);
        }
    }
}
