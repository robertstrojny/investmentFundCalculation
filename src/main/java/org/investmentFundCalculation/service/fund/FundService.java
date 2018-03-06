package org.investmentFundCalculation.service.fund;

import org.investmentFundCalculation.calculation.dto.Fund;

import java.util.List;

public interface FundService {
    List<Fund> findAllFunds();
}
