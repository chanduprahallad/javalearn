package TestNG_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Basics_003 {
    @Test
    public void checkingAssert(){
        int a =4;
        Assert.assertEquals(4,3);
    }
}
