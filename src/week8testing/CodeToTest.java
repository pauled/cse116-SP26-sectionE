package week8testing;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeToTest {
    public static int subtract(int a,int b){
        return a-Math.abs(b);
    }
    @Test
    public void testSubtractPositiveInputsFirstLarger(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(8,5,3));
        tests.add(new TestSubtractHelper(10,2,8));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractPositiveInputsSecondLarger(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(6,8,-2));
        tests.add(new TestSubtractHelper(1,18,-17));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractPositiveInputsEqualValue(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(8,8,0));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }

    @Test
    public void testSubtractNegativesInputsNegativeFirst(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(-8,8,-16));
        tests.add(new TestSubtractHelper(-6,8,-14));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractNegativesInputsNegativeSecond(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(8,-5,13));
        tests.add(new TestSubtractHelper(10,-22,32));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractNegativesInputsBothNegative(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(-8,-5,-3));
        tests.add(new TestSubtractHelper(-6,-8,2));
        tests.add(new TestSubtractHelper(-8,-8,0));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractZerosInputsZeroSecond(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(8,0,8));
        tests.add(new TestSubtractHelper(-6,0,-6));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractZerosInputsZeroFirst(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(0,22,-22));
        tests.add(new TestSubtractHelper(0,-8,8));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testSubtractZerosInputsZeroBoth(){
        ArrayList<TestSubtractHelper> tests=new ArrayList<>();
        tests.add(new TestSubtractHelper(0,0,0));

        for (TestSubtractHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testStrings(){
        String a="hello ";
        String b="goodbye";
        String c=a+b;
        System.out.println(c);
        System.out.println("hello goodbye".equals(c));
    }
    @Test
    public void testDoubles(){
        double total=0;
        for (int x=0;x<100;x++){
            total+=.1;
        }
        System.out.println(total);
        assertEquals("this shows a delta",10,total,.001);
    }
}
