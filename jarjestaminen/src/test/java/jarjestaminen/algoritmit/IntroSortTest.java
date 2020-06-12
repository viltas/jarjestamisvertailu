package jarjestaminen.algoritmit;

import java.util.Random;
import org.junit.After;
import org.junit.Before;

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

    
    @After
    public void tearDown() {
    }

    
}
