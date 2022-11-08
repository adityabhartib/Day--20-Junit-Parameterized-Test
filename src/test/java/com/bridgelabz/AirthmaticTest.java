package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AirthmaticTest {
    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Airthmatic airthmatic;

    public AirthmaticTest(int firstNumber, int secondNumber, int expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        airthmatic = new Airthmatic();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{1, 2, 3}, {2, 3, 5}, {3, 5, 8}, {4, 5, 9}});
    }

    @Test
    public void testAirthmaticTest() {
        System.out.println("Sum of Number :" + expectedResult);
        Assert.assertEquals(expectedResult, airthmatic.sum(firstNumber, secondNumber));
    }
}
