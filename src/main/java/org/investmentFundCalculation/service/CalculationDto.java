package org.investmentFundCalculation.service;

import lombok.*;
import org.investmentFundCalculation.model.StyleEnum;

import javax.validation.constraints.NotNull;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculationDto {
    @Getter
    @Setter
    @NotNull
    private List<Long> fundList;
    @Getter
    @Setter
    @NotNull
    private StyleEnum style;
    @Getter
    @Setter
    @NotNull
    private Integer value;
}
