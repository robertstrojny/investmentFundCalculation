package org.investmentFundCalculation.calculation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PercentOfFund {
    @Getter
    private Integer percent;

    @Getter
    private FundType fundType;
}
