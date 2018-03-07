package org.investmentFundCalculation.calculation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PercentOfFundDto {
    @Getter
    private Integer percent;

    @Getter
    private FundType fundType;
}
