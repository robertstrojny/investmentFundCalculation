package org.investmentFundCalculation.service;

import lombok.Getter;
import lombok.Setter;
import org.investmentFundCalculation.model.StyleEnum;

import javax.validation.constraints.NotNull;
import java.util.List;

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
