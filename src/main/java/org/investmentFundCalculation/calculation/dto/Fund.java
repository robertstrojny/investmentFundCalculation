package org.investmentFundCalculation.calculation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fund {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private FundType type;

}
