package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.calculation.dto.CalculationResultRow;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.dto.PercentOfFund;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculation {
    private List<PercentOfFund> percentOfFunds;

    public Calculation(List<PercentOfFund> percentOfFunds) {
        this.percentOfFunds = percentOfFunds;
    }

    public CalculationResult calculate(List<Fund> funds, Integer value) {
        //TODO validation
        CalculationResult calculationResult = new CalculationResult();
        List<CalculationResultRow> rows = new ArrayList<>();
        for(PercentOfFund percentOfFund : percentOfFunds) {
            List<Fund> selectedFunds = funds.stream().filter(f->f.getType().equals(percentOfFund.getFundType())).collect(Collectors.toList());
            if(!selectedFunds.isEmpty()) {
                FundsOneStyleHelper fundsOneStyleHelper = new FundsOneStyleHelper(selectedFunds, percentOfFund.getPercent());
                rows.addAll(fundsOneStyleHelper.calculateResultForOneStyle(value));
            }
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
