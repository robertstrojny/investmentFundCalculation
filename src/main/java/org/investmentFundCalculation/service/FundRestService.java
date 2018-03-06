package org.investmentFundCalculation.service;

import org.investmentFundCalculation.calculation.dto.Fund;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FundRestService {
    ResponseEntity<List<Fund>> findAllFunds();
}
