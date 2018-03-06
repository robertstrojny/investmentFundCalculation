package org.investmentFundCalculation.dao;

import org.investmentFundCalculation.model.FundEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundRepository extends JpaRepository<FundEntity, Long> {

}
