package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

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
     * Testataan toimiiko Insertionsort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void InsertionSortJarjestaminenToimiiPienellaTaulukolla() {
        InsertionSort Insertion = new InsertionSort(arr);
        Insertion.sort(0, arr.length - 1);
        Arrays.sort(arr);

        Assert.assertArrayEquals(Insertion.getArr(), arr);

    }

    /**
     * Testataan toimiiko Insertionsort-järjestäminen suurella taulukolla.
     */
    @Test
    public void InsertionSortJarjestaminenToimiiSuurellaTaulukolla() {
        InsertionSort Insertion = new InsertionSort(arr2);
        Insertion.sort(0, arr2.length - 1);
        Arrays.sort(arr2);

        Assert.assertArrayEquals(Insertion.getArr(), arr2);

    }

    /**
     * Testataan toimiiko Insertionsort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void InsertionSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        InsertionSort Insertion = new InsertionSort(arrEmpty);
        Insertion.sort(0, arrEmpty.length - 1);
        Assert.assertArrayEquals(Insertion.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko Insertionsort-järjestäminen jos taulukossa on useampi
     * sama arvo.
     */
    @Test
    public void InsertionSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        InsertionSort Insertion = new InsertionSort(arr3);
        Insertion.sort(0, arr3.length - 1);
        Arrays.sort(arr3);
        Assert.assertArrayEquals(Insertion.getArr(), arr3);

    }

    /**
     * Testataan toimiiko Insertionsort-järjestäminen jos taulukossa on vain
     * yksi arvo.
     */
    @Test
    public void InsertionSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        InsertionSort Insertion = new InsertionSort(arr4);
        Insertion.sort(0, arr4.length - 1);
        Arrays.sort(arr4);
        Assert.assertArrayEquals(Insertion.getArr(), arr4);

    }

    @After
    public void tearDown() {
    }

}
