package jarjestaminen.algoritmit;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeapSortTest {

    private int[] arr;

    @Before
    public void setUp() throws Exception {
        arr = new int[20];
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(100);
        }
    }

    /**
     * Testataan toimiiko heapsort-järjestäminen.
     */
    @Test
    public void HeapSortJarjestaminenToimii() {
        HeapSort heap = new HeapSort(arr);
        heap.sort();
        Arrays.sort(arr);

        Assert.assertArrayEquals(heap.getArr(), arr);

    }

    @After
    public void tearDown() {
    }

}
