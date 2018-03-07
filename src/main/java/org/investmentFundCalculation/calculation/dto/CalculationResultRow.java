package org.investmentFundCalculation.calculation.dto;

import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculationResultRow {
    @Getter
    @Setter
    private Integer lp;
    @Getter
    @Setter
    private FundType fundType;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Integer value;
    @Getter
    @Setter
    private BigDecimal percent;
}
