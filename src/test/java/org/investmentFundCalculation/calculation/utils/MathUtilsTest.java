package org.investmentFundCalculation.calculation.utils;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void calculatePercentBase() {
        BigDecimal percent = MathUtils.calculatePercentBase(20, 2);
        Assert.assertEquals("10", percent.toString());

        percent = MathUtils.calculatePercentBase(20, 3);
        Assert.assertEquals("6.66", percent.toString());

        percent = MathUtils.calculatePercentBase(75, 2);
        Assert.assertEquals("37.5", percent.toString());
    }

    @Test
    public void calculatePercentComplement() {
        BigDecimal percent = new BigDecimal("6.66");
        BigDecimal complement = MathUtils.calculatePercentComplement(percent, 20, 3);
        Assert.assertEquals("6.68", complement.toString());

        percent = new BigDecimal("10");
        complement = MathUtils.calculatePercentComplement(percent, 20, 2);
        Assert.assertEquals("10", complement.toString());
    }

    @Test
    public void calculateValue() {
       Integer value = MathUtils.calculateValue(new BigDecimal("37.5"), 10000);
        Assert.assertEquals(3750, value.intValue());
    }
}