package MyPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassFailure {

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

    @Test(groups = "groupFailure")
    public void testSumm() {
        double expectedResult = 11;
        Assert.assertEquals(summ(6, 4), expectedResult);
    }

    @Test(groups = "groupFailure")
    public void testDiff() {
        double expectedResult = 5;
        Assert.assertEquals(diff(50, 27), expectedResult);
    }

    @Test(groups = "groupFailure")
    public void testFraction() {
        double expectedResult = 40;
        Assert.assertEquals(fraction(2, 2), expectedResult);
    }

}
