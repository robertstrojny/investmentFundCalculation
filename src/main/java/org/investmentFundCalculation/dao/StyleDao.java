package org.investmentFundCalculation.dao;

import org.investmentFundCalculation.model.StyleEntity;
import org.investmentFundCalculation.model.StyleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StyleDao extends JpaRepository<StyleEntity, Long> {
    Optional<StyleEntity> findByName(StyleEnum name);
}
