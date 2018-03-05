package org.investmentFundCalculation.calculation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PercentOfFundDto {
    @Getter
    private Integer percent;

    @Getter
    private FundType fundType;
}
