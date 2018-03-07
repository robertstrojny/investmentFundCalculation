package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculationTest extends TestData{

    @Test
    public void calculateFirstExample(){
        List<PercentOfFund> percentOfFunds = new ArrayList<>();
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFunds);

        List<Fund> funds = getFundsFirstCase();

        CalculationResult calculate = calculation.calculate(funds, 10000);
        Assert.assertEquals(6, calculate.getCalculationResultRows().size());
        Iterator<CalculationResultRow> rowIterator = calculate.getCalculationResultRows().iterator();

        CalculationResultRow row1 = rowIterator.next();
        Assert.assertEquals(1000, row1.getValue().intValue());
        Assert.assertEquals("10", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(1000, row1.getValue().intValue());
        Assert.assertEquals("10", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());


        row1 = rowIterator.next();
        Assert.assertEquals(500, row1.getValue().intValue());
        Assert.assertEquals("5", row1.getPercent().toString());

        Assert.assertEquals(0, calculate.getUnresolved().intValue());
    }

    @Test
    public void calculateSecondExample() {
        List<PercentOfFund> percentOfFunds = new ArrayList<>();
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFunds);

        List<Fund> funds = getFundsFirstCase();

        CalculationResult calculate = calculation.calculate(funds, 10001);
        Assert.assertEquals(6, calculate.getCalculationResultRows().size());
        Iterator<CalculationResultRow> rowIterator = calculate.getCalculationResultRows().iterator();

        CalculationResultRow row1 = rowIterator.next();
        Assert.assertEquals(1000, row1.getValue().intValue());
        Assert.assertEquals("10", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(1000, row1.getValue().intValue());
        Assert.assertEquals("10", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(2500, row1.getValue().intValue());
        Assert.assertEquals("25", row1.getPercent().toString());


        row1 = rowIterator.next();
        Assert.assertEquals(500, row1.getValue().intValue());
        Assert.assertEquals("5", row1.getPercent().toString());

        Assert.assertEquals(1, calculate.getUnresolved().intValue());
    }

    @Test
    public void calculateThirdExample() {
        List<PercentOfFund> percentOfFunds = new ArrayList<>();
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFunds.add(PercentOfFund.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFunds);

        List<Fund> funds = getFundsSecondCase();

        CalculationResult calculate = calculation.calculate(funds, 10000);
        Assert.assertEquals(6, calculate.getCalculationResultRows().size());
        Iterator<CalculationResultRow> rowIterator = calculate.getCalculationResultRows().iterator();

        CalculationResultRow row1 = rowIterator.next();
        Assert.assertEquals(668, row1.getValue().intValue());
        Assert.assertEquals("6.68", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(666, row1.getValue().intValue());
        Assert.assertEquals("6.66", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(666, row1.getValue().intValue());
        Assert.assertEquals("6.66", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(3750, row1.getValue().intValue());
        Assert.assertEquals("37.5", row1.getPercent().toString());

        row1 = rowIterator.next();
        Assert.assertEquals(3750, row1.getValue().intValue());
        Assert.assertEquals("37.5", row1.getPercent().toString());


        row1 = rowIterator.next();
        Assert.assertEquals(500, row1.getValue().intValue());
        Assert.assertEquals("5", row1.getPercent().toString());

        Assert.assertEquals(0, calculate.getUnresolved().intValue());
    }
}