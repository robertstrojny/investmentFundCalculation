package org.investmentFundCalculation.calculation.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {

    public static BigDecimal calculatePercentBase(int percent, int size) {
        BigDecimal percentBase = new BigDecimal((float)percent / size);
        if(percentBase.scale()>0) {
            percentBase = percentBase.setScale(2, RoundingMode.DOWN).stripTrailingZeros();
        }

        return percentBase;
    }

    public static BigDecimal calculatePercentComplement(BigDecimal percentBase, int percent, int size) {
        BigDecimal totalPercent = new BigDecimal(percent);
        BigDecimal calculateTotal = totalPercent.subtract(new BigDecimal(size).multiply(percentBase));
        return percentBase.add(calculateTotal);
    }

    public static Integer calculateValue(BigDecimal percent, Integer value) {
        return new BigDecimal(value).multiply(percent.movePointLeft(2)).intValue();
    }
}
