package org.investmentFundCalculation.service;

import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.springframework.http.ResponseEntity;

public interface InvestmentsFundRestService {
    ResponseEntity<CalculationResult> calculate (CalculationDto calculationDtos);
}
