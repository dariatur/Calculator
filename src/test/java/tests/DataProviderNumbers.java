package tests;

import org.testng.annotations.DataProvider;

public class DataProviderNumbers {

    @DataProvider(name = "IntegerSumProvider")
    public Object[][] IntegerSumData() {

        return new Object[][]
                {
                        {new Number[]{1, 2, 5, 7, 8}, 23},
                        {new Number[]{2, 6}, 8},
                        {new Number[]{3, 9, 7, 9, 10, 4, 3}, 45}
                };
    }

    @DataProvider(name = "DoubleSumProvider")
    public Object[][] DoubleSumData() {

        return new Object[][]
                {
                        {new Number[]{1.0, 2.1, 5.7, 7.0, 8.8}, 24.6},
                        {new Number[]{2.0, 6.5}, 8.5},
                        {new Number[]{3.7, 9.8, 7.2, 9.2, 10.0, 4.1, 3.5}, 47.5}
                };
    }

    @DataProvider(name = "DifferentTypesSumProvider")
    public Object[][] DifferentSumData() {

        return new Object[][]
                {
                        {new Number[]{1, 2.1, 5, 7.0, 8}, 23.1},
                        {new Number[]{2, 6.5}, 8.5},
                        {new Number[]{3, 9.8, 7, 9.2, 10.0, 4, 3.5}, 46.5}
                };
    }

    @DataProvider(name = "IntegerDeductProvider")
    public Object[][] IntegerDeductData() {

        return new Object[][]
                {
                        {new Number[]{1, 2, 5, 7, 8}, -21},
                        {new Number[]{2, -6}, 8},
                        {new Number[]{3, -9, 7, 9, -10, 4, 3}, -1}
                };
    }

    @DataProvider(name = "DoubleDeductProvider")
    public Object[][] DoubleDeductData() {

        return new Object[][]
                {
                        {new Number[]{1.0, 2.1, -5.3, 7.0, -8.2}, 5.4},
                        {new Number[]{-2.4, 6.5}, -8.9},
                        {new Number[]{3.0, -9.8, -7.1, 9.2, 10.0, -4.7, 3.5}, 1.9}
                };
    }

    @DataProvider(name = "DifferentTypesDeductProvider")
    public Object[][] DifferentDeductData() {

        return new Object[][]
                {
                        {new Number[]{1, 2.1, 5, 7.0, 8}, -21.1},
                        {new Number[]{2, -6.5}, 8.5},
                        {new Number[]{3, -9.8, 7, 9.2, -10.0, 4, 3.5}, -0.9}
                };
    }

    @DataProvider(name = "IntegerMultiplyProvider")
    public Object[][] IntegerMultiplyData() {

        return new Object[][]
                {
                        {new Number[]{1, 2, 5, 7, 8}, 560},
                        {new Number[]{2, -6}, -12},
                        {new Number[]{3, -9, 7, 9, -10, 4, 3}, 204120}
                };
    }

    @DataProvider(name = "DoubleMultiplyProvider")
    public Object[][] DoubleMultiplyData() {

        return new Object[][]
                {
                        {new Number[]{1.0, 2.1, 5.0, 7.0, 8.0}, 588.0},
                        {new Number[]{2.0, -6.5}, -13.0},
                        {new Number[]{3.0, -9.8, 7.0, 9.2, -10.0, 4.0, 3.5}, 265070.4}
                };
    }

    @DataProvider(name = "DifferentTypesMultiplyProvider")
    public Object[][] DifferentMultiplyData() {

        return new Object[][]
                {
                        {new Number[]{1, 2.1, 5, 7.0, 8}, 588.0},
                        {new Number[]{2, -6.5}, -13},
                        {new Number[]{3, -9.8, 7, 9.2, -10.0, 4, 3.5}, 265070.4}
                };
    }

    @DataProvider(name = "IntegerDivideProvider")
    public Object[][] IntegerDivideData() {

        return new Object[][]
                {
                        {new Number[]{1, 2, 5, 7, 8}, 0.0017},
                        {new Number[]{2, -6}, -0.3334},
                        {new Number[]{3, -9, 7, 9, -10, 4, 3}, 0.0000}
                };
    }

    @DataProvider(name = "DoubleDivideProvider")
    public Object[][] DoubleDivideData() {

        return new Object[][]
                {
                        {new Number[]{1.0, 2.1, 5.0, 7.0, 8.0}, 0.0017},
                        {new Number[]{2.0, -6.5}, -0.3077},
                        {new Number[]{3.0, -9.8, 7.0, 9.2, -10.0, 4.0, 3.5}, 0.0000}
                };
    }

    @DataProvider(name = "DifferentTypesDivideProvider")
    public Object[][] DifferentDivideData() {

        return new Object[][]
                {
                        {new Number[]{1, 2.1, 5, 7.0, 8}, 0.0017},
                        {new Number[]{2, -6.5}, -0.3077},
                        {new Number[]{3, -9.8, 7, 9.2, -10.0, 4, 3.5}, 0.0000}
                };
    }
}
