package org.investmentFundCalculation.calculation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class CalculationResult {
    @Getter
    @Setter
    private List<CalculationResultRow> calculationResultRows = new ArrayList<>();

    @Getter
    @Setter
    private Integer unresolved;


    public void addCalculationResultRows(List<CalculationResultRow> calculationResultRows) {
        this.calculationResultRows.addAll(calculationResultRows);
    }

    @Override
    public String toString() {
        return "CalculationResult{" +
                "calculationResultRows=" + calculationResultRows +
                ", unresolved=" + unresolved +
                '}';
    }
}
