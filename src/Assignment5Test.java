import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment5Test {
    @org.junit.Test
    public void displayConversions() throws Exception {

        int kg1 = 1;
        int pd1 = 20;
        double conv1 = 2.2;
        double conv2 = 9.09;

        String expected = kg1+" kilograms = "+conv1+" pounds and "+pd1+" pounds = "+conv2+" kilograms";

        Assert.assertEquals(expected,Assignment5.displayConversions(1,20));
    }
}