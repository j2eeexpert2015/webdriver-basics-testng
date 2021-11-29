package org.webdriverbasics.testtngsamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGSamples {

    @DataProvider(name = "dp1")
    public Object[][] dpMethod1() {
        return new Object [][] { {"A"},{"B"},{"XYZ"}};
    }

    @Test(dataProvider = "dp1")
    public void test1(String input1)
    {
        System.out.println("##### test1 is called ,Input1:"+input1);
    }
    @DataProvider(name = "dp2")
    public Object[][] dpMethod2() {
        return new Object [][] { {"A","B"},{"X","Y"},{"XYZ","PQR"}};
    }
    @Test(dataProvider = "dp2")
    public void test(String user,String pwd )
    {
        System.out.println("@@@@@@@@  test2 is called ,user:"+user+",pwd:"+pwd);
    }
}
