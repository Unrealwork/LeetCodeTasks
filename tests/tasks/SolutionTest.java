package tasks;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by shmagrinskiy on 27.10.15.
 */
public class SolutionTest {
    
    private static int calcDigitsSum(int n) {
        int result = n;
        int buf = 0;
        while (result >= 10) {
            while (result != 0) {
                buf += result % 10;
                result /= 10;
            }
            result = buf;
            buf = 0;
        }
        ;
        return result;
    }

    @Test
    public void testAddDigits() throws Exception {
        int MAX_NUM = 1000;
        for (int i = 0; i<MAX_NUM; i++) {
            assertEquals(calcDigitsSum(i), Solution.addDigits(i));
        }
    }
}