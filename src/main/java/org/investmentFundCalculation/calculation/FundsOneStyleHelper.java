package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.CalculationResultRow;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.utils.MathUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FundsOneStyleHelper {
    private List<CalculationResultRow> selectedFunds = new ArrayList<>();
    private Integer percentOfFund;

    FundsOneStyleHelper(List<Fund> selectedFunds, Integer percentOfFund) {
        for(Fund fund : selectedFunds) {
            this.selectedFunds.add(CalculationResultRow.builder().name(fund.getName()).fundType(fund.getType()).build());
        }
        this.percentOfFund = percentOfFund;
    }

    public List<CalculationResultRow> calculateResultForOneStyle(Integer value) {
        calculatePercents();
        calculateValues(value);
        return selectedFunds;
    }

    private void calculateValues(Integer value) {
        selectedFunds.forEach(row -> row.setValue(MathUtils.calculateValue(row.getPercent(), value)));
    }

    private void calculatePercents() {
        BigDecimal percentBase = MathUtils.calculatePercentBase(percentOfFund, selectedFunds.size());
        BigDecimal percentComplement = MathUtils.calculatePercentComplement(percentBase, percentOfFund, selectedFunds.size());
        int count = 0;
        for(CalculationResultRow row : selectedFunds) {
            if(count++ == 0) {
                row.setPercent(percentComplement);
            } else {
                row.setPercent(percentBase);
            }
        }
    }
}
