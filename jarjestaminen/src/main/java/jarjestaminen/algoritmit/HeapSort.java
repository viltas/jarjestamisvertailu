package jarjestaminen.algoritmit;

public class HeapSort {

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

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

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            createHeap(arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int j = arr[0];
            arr[0] = arr[i];
            arr[i] = j;
            createHeap(i, 0);
        }
    }

    private void createHeap(int s, int x) {
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
            int temp = arr[x];
            arr[x] = arr[top];
            arr[top] = temp;
            createHeap(s, top);
        }
    }
}
