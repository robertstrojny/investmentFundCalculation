package org.investmentFundCalculation.service.calculation;

import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.service.CalculationDto;

public interface CalculationService {
    CalculationResult calculate(CalculationDto calculationDto);
}
