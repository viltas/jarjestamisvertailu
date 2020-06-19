package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntroSortTest {

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
     * Testataan toimiiko Introsort-järjestäminen pienellä taulukolla.
     */
    @Test
    public void IntroSortJarjestaminenToimiiPienellaTaulukolla() {
        IntroSort intro = new IntroSort(arr);
        intro.sort();
        Arrays.sort(arr);

        Assert.assertArrayEquals(intro.getArr(), arr);

    }

    /**
     * Testataan toimiiko Introsort-järjestäminen suurella taulukolla.
     */
    @Test
    public void IntroSortJarjestaminenToimiiSuurellaTaulukolla() {
        IntroSort intro = new IntroSort(arr2);
        intro.sort();
        Arrays.sort(arr2);

        Assert.assertArrayEquals(intro.getArr(), arr2);

    }

    /**
     * Testataan toimiiko Introsort-järjestäminen jos taulukko on tyhjä.
     */
    @Test
    public void IntroSortJarjestaminenToimiiTyhjallaTaulukolla() {
        int[] arrEmpty = new int[0];
        IntroSort intro = new IntroSort(arrEmpty);
        intro.sort();
        Assert.assertArrayEquals(intro.getArr(), arrEmpty);

    }

    /**
     * Testataan toimiiko Introsort-järjestäminen jos taulukossa on useampi sama
     * arvo.
     */
    @Test
    public void IntroSortJarjestaminenToimiiJosTaulukossaSamojaArvoja() {
        int[] arr3 = {0, 1, 7, 3, 9, 2, 2, 3, 4, 1, 1, 5};
        IntroSort intro = new IntroSort(arr3);
        intro.sort();
        Arrays.sort(arr3);
        Assert.assertArrayEquals(intro.getArr(), arr3);

    }

    /**
     * Testataan toimiiko Introsort-järjestäminen jos taulukossa on vain yksi
     * arvo.
     */
    @Test
    public void IntroSortJarjestaminenToimiiJosTaulukossaOnVainYksiArvo() {
        int[] arr4 = {7};
        IntroSort intro = new IntroSort(arr4);
        intro.sort();
        Arrays.sort(arr4);
        Assert.assertArrayEquals(intro.getArr(), arr4);

    }

    @After
    public void tearDown() {
    }

}
