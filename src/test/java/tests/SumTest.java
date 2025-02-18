package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(description = "check sum for integers", dataProvider = "IntegerSumProvider", dataProviderClass = DataProviderNumbers.class, priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void sumIntegers(Number[] numbers, double expectedSum){
        double result = calculator.sum(numbers);
        printingResults(numbers, result, expectedSum, " + ");
        Assert.assertEquals(result, expectedSum);
    }

    @Test(description = "check sum for doubles", dataProvider = "DoubleSumProvider", dataProviderClass = DataProviderNumbers.class, priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void sumDoubles(Number[] numbers, double expectedSum){
        double result = calculator.sum(numbers);
        printingResults(numbers, result, expectedSum, " + ");
        Assert.assertEquals(result, expectedSum);
    }

    @Test(description = "check sum for mixed types", dataProvider = "DifferentTypesSumProvider", dataProviderClass = DataProviderNumbers.class, priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void sumDifferentTypes(Number[] numbers, double expectedSum){
        double result = calculator.sum(numbers);
        printingResults(numbers, result, expectedSum, " + ");
        Assert.assertEquals(result, expectedSum);
    }
}
