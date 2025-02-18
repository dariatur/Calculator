package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTest{

    @Test(description = "check multiply for integers", dataProvider = "IntegerMultiplyProvider", dataProviderClass = DataProviderNumbers.class, priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyIntegers(Number[] numbers, double expectedResult){
        double result = calculator.multiply(numbers);
        printingResults(numbers, result, expectedResult, " * ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check multiply for doubles", dataProvider = "DoubleMultiplyProvider", dataProviderClass = DataProviderNumbers.class, priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyDoubles(Number[] numbers, double expectedResult){
        double result = Math.ceil(calculator.multiply(numbers)*10)/10;
        printingResults(numbers, result, expectedResult, " * ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check multiply for mixed types", dataProvider = "DifferentTypesMultiplyProvider", dataProviderClass = DataProviderNumbers.class, priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyDifferentTypes(Number[] numbers, double expectedResult){
        double result = Math.ceil(calculator.multiply(numbers)*10)/10;
        printingResults(numbers, result, expectedResult, " * ");
        Assert.assertEquals(result, expectedResult);
    }
}
