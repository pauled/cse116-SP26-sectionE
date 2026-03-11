package week8testing;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeToTest {
    public static int subtract(int a,int b){
        return a-b;
    }
    @Test
    public void testSubtract(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(8,5,3));
        tests.add(new TestSubtractHelper(0,7,-6));
        tests.add(new TestSubtractHelper(8,2,6));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
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
