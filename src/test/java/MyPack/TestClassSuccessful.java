package MyPack;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassSuccessful {

    @DataProvider(name = "newData")
    public static Object[][] getData() {
        return new Object[][]{
                {6, 14},
                {56, 32},
        };
    }

    @Test(dataProvider = "newData")
    public void ddt(double a, double b) {
        System.out.println("Summ " + a + " + " + b + " = " + summ(a, b));
    }

    public double summ(double a, double b) {
        double summa = a + b;
        return summa;
    }

    public double diff(double a, double b) {
        double difference = a - b;
        return difference;
    }

    public double product(double a, double b) {
        double prod = a * b;
        return prod;
    }

    public double fraction(double a, double b) {
        double frac = a / b;
        return frac;
    }

    @Test(groups = "groupSuccess")
    public void testSumm() {
        double expectedResult = 10;
        Assert.assertEquals(summ(6, 4), expectedResult);
    }

    @Test(groups = "groupSuccess")
    public void testDiff() {
        double expectedResult = 2;
        Assert.assertEquals(diff(6, 4), expectedResult);
    }

    @Test(groups = "groupSuccess")
    public void testProd() {
        double expectedResult = 24;
        Assert.assertEquals(product(6, 4), expectedResult);
    }

    @Test
    @Parameters({"Name", "Age"})
    public void checkingParam(String name, int age) {
        System.out.println(String.format("Name - '%s', Age  - '%s'", name, age));
    }


}
