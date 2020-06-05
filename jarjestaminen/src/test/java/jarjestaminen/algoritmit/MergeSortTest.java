package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

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
     * Testataan toimiiko Mergesort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void MergeSortJarjestaminenToimiiPienellaTaulukolla() {
        MergeSort Merge = new MergeSort(arr);
        Merge.sort(0, arr.length - 1);
        Arrays.sort(arr);

        Assert.assertArrayEquals(Merge.getArr(), arr);

    }

    /**
     * Testataan toimiiko Mergesort-järjestäminen suurella taulukolla.
     */
    @Test
    public void MergeSortJarjestaminenToimiiSuurellaTaulukolla() {
        MergeSort Merge = new MergeSort(arr2);
        Merge.sort(0, arr2.length - 1);
        Arrays.sort(arr2);

        Assert.assertArrayEquals(Merge.getArr(), arr2);

    }

    /**
     * Testataan toimiiko Mergesort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void MergeSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        MergeSort Merge = new MergeSort(arrEmpty);
        Merge.sort(0, arrEmpty.length - 1);
        Assert.assertArrayEquals(Merge.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko Mergesort-järjestäminen jos taulukossa on useampi sama
     * arvo.
     */
    @Test
    public void MergeSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        MergeSort Merge = new MergeSort(arr3);
        Merge.sort(0, arr3.length - 1);
        Arrays.sort(arr3);
        Assert.assertArrayEquals(Merge.getArr(), arr3);

    }

    /**
     * Testataan toimiiko Mergesort-järjestäminen jos taulukossa on vain yksi
     * arvo.
     */
    @Test
    public void MergeSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        MergeSort Merge = new MergeSort(arr4);
        Merge.sort(0, arr4.length - 1);
        Arrays.sort(arr4);
        Assert.assertArrayEquals(Merge.getArr(), arr4);

    }

    @After
    public void tearDown() {
    }

}
