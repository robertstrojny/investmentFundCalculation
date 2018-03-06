package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.CalculationResultRow;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.dto.FundType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FundsOneStyleHelperTest {

    @Test
    public void calculateResultForOneStyle() {
        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id(1L).name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(2L).name("Fundusz Polski 2").type(FundType.POLISH).build());

        FundsOneStyleHelper fundsOneStyleHelper = new FundsOneStyleHelper(funds, 20);
        List<CalculationResultRow> resultRows = fundsOneStyleHelper.calculateResultForOneStyle(100);
        Assert.assertFalse(resultRows.isEmpty());
    }
}