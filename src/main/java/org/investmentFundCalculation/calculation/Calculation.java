package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.calculation.dto.CalculationResultRow;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.dto.PercentOfFundDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculation {
    private List<PercentOfFundDto> percentOfFunds;

    Calculation(List<PercentOfFundDto> percentOfFunds) {
        this.percentOfFunds = percentOfFunds;
    }

    public CalculationResult calculate(List<Fund> funds, Integer value) {
        //TODO validation
        CalculationResult calculationResult = new CalculationResult();
        List<CalculationResultRow> rows = new ArrayList<>();
        for(PercentOfFundDto percentOfFund : percentOfFunds) {
            List<Fund> selectedFunds = funds.stream().filter(f->f.getType().equals(percentOfFund.getFundType())).collect(Collectors.toList());
            FundsOneStyleHelper fundsOneStyleHelper = new FundsOneStyleHelper(selectedFunds, percentOfFund.getPercent());
            rows.addAll(fundsOneStyleHelper.calculateResultForOneStyle(value));
        }
        int i = 1;
        for(CalculationResultRow row : rows) {
            row.setLp(i++);
        }

        calculationResult.addCalculationResultRows(rows);
        calculationResult.setUnresolved(calculateUnresolvedValue(rows, value));
        return calculationResult;
    }

    private Integer calculateUnresolvedValue(List<CalculationResultRow> rows, Integer value) {
        Integer sum = rows.stream().mapToInt(CalculationResultRow::getValue).sum();
        return value - sum;
    }
}
