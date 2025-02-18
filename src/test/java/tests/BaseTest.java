package tests;

import entity.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected Calculator calculator = Calculator.INSTANCE;

    @BeforeMethod
    public void testStart(){
        System.out.println("Testing is started");
    }

    @AfterMethod
    public void testEnd(){
        System.out.println("Testing is ended");
    }

    public void printingResults(Number[] numbers, double result, double expectedResult, String operation){
        for(int i = 0; i < numbers.length - 1; i++){
            System.out.print(numbers[i] + operation);
        }
        System.out.print(numbers[numbers.length - 1]);
        System.out.print(" = " + result + " expected result: " + expectedResult);
        System.out.println();
    }
}
