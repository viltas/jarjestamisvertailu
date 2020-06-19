package jarjestaminen.algoritmit;

public class IntroSort {

    private int[] arr;
    private int size;

    public IntroSort(int[] arr) {

        this.arr = arr;
        this.size = arr.length;

    }

    public int[] getArr() {
        return this.arr;
    }

    public void sort() {
        int maxDepth = (int) (2 * Math.floor(Math.log(arr.length) / Math.log(2)));
        introSort(maxDepth, 0, arr.length - 1);
    }

    private void introSort(int maxDepth, int a, int b) {
        if (b - a <= 16) {
            InsertionSort in = new InsertionSort(arr);
            in.sort(a, b);
        } else {
            if (maxDepth == 0) {
                HeapSort heap = new HeapSort(arr);
                heap.sort();
                return;
            } else {
                maxDepth = maxDepth - 1;
                QuickSort quick = new QuickSort(arr);
                int p = quick.part(a, b);
                introSort(maxDepth -1, a, p - 1);
                introSort(maxDepth -1, p + 1, b);

            }
        }
    }
}
