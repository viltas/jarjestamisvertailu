package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimSortTest {

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
     * Testataan toimiiko timsort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void TimSortJarjestaminenToimiiPienellaTaulukolla() {
        TimSort tim = new TimSort(arr);
        tim.sort();
        Arrays.sort(arr);

        Assert.assertArrayEquals(tim.getArr(), arr);

    }

    /**
     * Testataan toimiiko timsort-järjestäminen suurella taulukolla.
     */
    @Test
    public void TimSortJarjestaminenToimiiSuurellaTaulukolla() {
        TimSort tim = new TimSort(arr2);
        tim.sort();
        Arrays.sort(arr2);

        Assert.assertArrayEquals(tim.getArr(), arr2);

    }

    /**
     * Testataan toimiiko timsort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void TimSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        TimSort tim = new TimSort(arrEmpty);
        tim.sort();
        Assert.assertArrayEquals(tim.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko timsort-järjestäminen jos taulukossa on useampi sama
     * arvo.
     */
    @Test
    public void TimSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        TimSort tim = new TimSort(arr3);
        tim.sort();
        Arrays.sort(arr3);
        Assert.assertArrayEquals(tim.getArr(), arr3);

    }

    /**
     * Testataan toimiiko timsort-järjestäminen jos taulukossa on vain yksi
     * arvo.
     */
    @Test
    public void TimSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        TimSort tim = new TimSort(arr4);
        tim.sort();
        Arrays.sort(arr4);
        Assert.assertArrayEquals(tim.getArr(), arr4);

    }

    @After
    public void tearDown() {
    }

}
