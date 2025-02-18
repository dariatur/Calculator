package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class DivideTest extends BaseTest{

    @Test(description = "check divide for integers", dataProvider = "IntegerDivideProvider", dataProviderClass = DataProviderNumbers.class, priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyIntegers(Number[] numbers, double expectedResult){
        double result = Math.floor(calculator.divide(numbers)*10000)/10000;
        printingResults(numbers, result, expectedResult, " / ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check divide for doubles", dataProvider = "DoubleDivideProvider", dataProviderClass = DataProviderNumbers.class, priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyDoubles(Number[] numbers, double expectedResult){
        double result = Math.floor(calculator.divide(numbers)*10000)/10000;
        printingResults(numbers, result, expectedResult, " / ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check divide for different types", dataProvider = "DifferentTypesDivideProvider", dataProviderClass = DataProviderNumbers.class, priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void multiplyDifferentTypes(Number[] numbers, double expectedResult){
        double result = Math.floor(calculator.divide(numbers)*10000)/10000;
        printingResults(numbers, result, expectedResult, " / ");
        Assert.assertEquals(result, expectedResult);
    }
}
