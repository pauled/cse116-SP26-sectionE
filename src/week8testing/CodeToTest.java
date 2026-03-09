package week8testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeToTest {
    public static int subtract(int a,int b){
        return a-b;
    }
    @Test
    public void testSubtract(){
        assertEquals("subtract(8,5)",3,subtract(8,5));
        assertEquals("subtract(0,7)",-6,subtract(0,7));
        assertEquals("subtract(8,2)",6,subtract(8,2));
        assertTrue(3==subtract(8,5));
        assertTrue(-6==subtract(0,7));
        assertTrue(6==subtract(8,2));
    }

    public static void main(String[] args) {
        System.out.println(subtract(8,5));
        System.out.println(subtract(0,7));
        System.out.println(subtract(8,2));
        if (subtract(8,5)==3){
            System.out.println("passed subtract(8,5)==3");
        } else {
            System.out.println("failed subtract(8,5)==3");
        }
    }
}
