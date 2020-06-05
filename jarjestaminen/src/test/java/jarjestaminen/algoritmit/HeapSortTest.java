package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeapSortTest {

    private int[] arr;
    private int[] arr2;

    @Before
    public void setUp() throws Exception {
        arr = new int[20];
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(100);
        }

        arr2 = new int[20000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = generator.nextInt(100);
        }
    }

    /**
     * Testataan toimiiko Heapsort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void HeapSortJarjestaminenToimiiPienellaTaulukolla() {
        HeapSort Heap = new HeapSort(arr);
        Heap.sort();
        Arrays.sort(arr);

        Assert.assertArrayEquals(Heap.getArr(), arr);

    }

    /**
     * Testataan toimiiko Heapsort-järjestäminen suurella taulukolla.
     */
    @Test
    public void HeapSortJarjestaminenToimiiSuurellaTaulukolla() {
        HeapSort Heap = new HeapSort(arr2);
        Heap.sort();
        Arrays.sort(arr2);

        Assert.assertArrayEquals(Heap.getArr(), arr2);

    }

    /**
     * Testataan toimiiko Heapsort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void HeapSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        HeapSort Heap = new HeapSort(arrEmpty);
        Heap.sort();
        Assert.assertArrayEquals(Heap.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko Heapsort-järjestäminen jos taulukossa on useampi sama
     * arvo.
     */
    @Test
    public void HeapSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        HeapSort Heap = new HeapSort(arr3);
        Heap.sort();
        Arrays.sort(arr3);
        Assert.assertArrayEquals(Heap.getArr(), arr3);

    }

    /**
     * Testataan toimiiko Heapsort-järjestäminen jos taulukossa on vain yksi
     * arvo.
     */
    @Test
    public void HeapSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        HeapSort Heap = new HeapSort(arr4);
        Heap.sort();
        Arrays.sort(arr4);
        Assert.assertArrayEquals(Heap.getArr(), arr4);

    }

    @After
    public void tearDown() {
    }

}
