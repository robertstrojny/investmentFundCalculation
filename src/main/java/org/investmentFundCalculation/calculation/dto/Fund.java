package org.investmentFundCalculation.calculation.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fund {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private FundType type;

}
