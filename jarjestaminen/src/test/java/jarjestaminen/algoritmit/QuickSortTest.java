package jarjestaminen.algoritmit;

import jarjestaminen.algoritmit.QuickSort;
import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

    private int[] arr;

    
    @Before
    public void setUp() throws Exception {
        arr = new int[20];
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(100);
        }
    }
    
    @Test
    public void quickSortJarjestaminenToimii() {
        QuickSort quick = new QuickSort(arr);
        quick.sort(0, arr.length-1);
        Arrays.sort(arr);
        
        Assert.assertArrayEquals(quick.getArr(), arr);

    }
    
    @After
    public void tearDown() {

    }

}
