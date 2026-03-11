package week8testing;

import static org.junit.Assert.assertEquals;

public class TestSubtractHelper {
    private int input1;
    private int input2;
    private int expected;

    public TestSubtractHelper(int in1,int in2, int e){
        this.input1=in1;
        this.input2=in2;
        this.expected=e;
    }
    public void runTest(){
        int actual=CodeToTest.subtract(this.input1,this.input2);
        String message=""+this.expected+"==subtract("+this.input1;
        message+=","+this.input2+")";
        assertEquals(message,this.expected,actual);
    }
}
