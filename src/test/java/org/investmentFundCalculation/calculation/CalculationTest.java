package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class CalculationTest {

    @Test
    public void calculateFirstExample() {
        List<PercentOfFundDto> percentOfFundDtos = new ArrayList<>();
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFundDtos);

        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id("1").name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("2").name("Fundusz Polski 2").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("3").name("Fundusz Zagraniczny 1").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("4").name("Fundusz Zagraniczny 2").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("5").name("Fundusz Zagraniczny 3").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("6").name("Fundusz Pieniezny 1").type(FundType.FINANCIAL).build());

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
        List<PercentOfFundDto> percentOfFundDtos = new ArrayList<>();
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFundDtos);

        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id("1").name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("2").name("Fundusz Polski 2").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("3").name("Fundusz Zagraniczny 1").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("4").name("Fundusz Zagraniczny 2").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("5").name("Fundusz Zagraniczny 3").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("6").name("Fundusz Pieniezny 1").type(FundType.FINANCIAL).build());

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
        List<PercentOfFundDto> percentOfFundDtos = new ArrayList<>();
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.POLISH).percent(20).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FOREIGN).percent(75).build());
        percentOfFundDtos.add(PercentOfFundDto.builder().fundType(FundType.FINANCIAL).percent(5).build());
        Calculation calculation = new Calculation(percentOfFundDtos);

        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id("1").name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("2").name("Fundusz Polski 2").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("3").name("Fundusz Polski 3").type(FundType.POLISH).build());
        funds.add(Fund.builder().id("4").name("Fundusz Zagraniczny 2").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("5").name("Fundusz Zagraniczny 3").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id("6").name("Fundusz Pieniezny 1").type(FundType.FINANCIAL).build());

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