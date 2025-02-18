package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeductTest extends BaseTest{

    @Test(description = "check deduction for integers", dataProvider = "IntegerDeductProvider", dataProviderClass = DataProviderNumbers.class, priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void deductIntegers(Number[] numbers, double expectedResult){
        double result = calculator.deduct(numbers);
        printingResults(numbers, result, expectedResult, " - ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check deduction for doubles", dataProvider = "DoubleDeductProvider", dataProviderClass = DataProviderNumbers.class, priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void deductDoubles(Number[] numbers, double expectedResult){
        double result = Math.ceil(calculator.deduct(numbers) * 10) / 10;
        printingResults(numbers, result, expectedResult, " - ");
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "check deduction for mixed types", dataProvider = "DifferentTypesDeductProvider", dataProviderClass = DataProviderNumbers.class, priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void deductDifferentTypes(Number[] numbers, double expectedResult){
        double result = Math.floor(calculator.deduct(numbers) * 10) / 10;
        printingResults(numbers, result, expectedResult, " - ");
        Assert.assertEquals(result, expectedResult);
    }
}
