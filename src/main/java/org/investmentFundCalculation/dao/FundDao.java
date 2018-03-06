package org.investmentFundCalculation.dao;

import org.investmentFundCalculation.model.FundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundDao extends JpaRepository<FundEntity, Long> {

}
