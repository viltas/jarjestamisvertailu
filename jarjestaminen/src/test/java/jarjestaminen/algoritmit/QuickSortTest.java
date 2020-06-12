package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

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
     * Testataan toimiiko Quicksort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void QuickSortJarjestaminenToimiiPienellaTaulukolla() {
        QuickSort Quick = new QuickSort(arr);
        Quick.sort(0, arr.length-1);
        Arrays.sort(arr);

        Assert.assertArrayEquals(Quick.getArr(), arr);

    }

    /**
     * Testataan toimiiko Quicksort-järjestäminen suurella taulukolla.
     */
    @Test
    public void QuickSortJarjestaminenToimiiSuurellaTaulukolla() {
        QuickSort Quick = new QuickSort(arr2);
        Quick.sort(0, arr2.length-1);
        Arrays.sort(arr2);

        Assert.assertArrayEquals(Quick.getArr(), arr2);

    }

    /**
     * Testataan toimiiko Quicksort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void QuickSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        QuickSort Quick = new QuickSort(arrEmpty);
        Quick.sort(0, arrEmpty.length-1);
        Assert.assertArrayEquals(Quick.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko Quicksort-järjestäminen jos taulukossa on useampi sama
     * arvo.
     */
    @Test
    public void QuickSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        QuickSort Quick = new QuickSort(arr3);
        Quick.sort(0, arr3.length-1);
        Arrays.sort(arr3);
        Assert.assertArrayEquals(Quick.getArr(), arr3);

    }

    /**
     * Testataan toimiiko Quicksort-järjestäminen jos taulukossa on vain yksi
     * arvo.
     */
    @Test
    public void QuickSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        QuickSort Quick = new QuickSort(arr4);
        Quick.sort(0,arr4.length-1);
        Arrays.sort(arr4);
        Assert.assertArrayEquals(Quick.getArr(), arr4);

    }
    
    @After
    public void tearDown() {

    }

}
