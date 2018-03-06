package org.investmentFundCalculation.dao;

import org.investmentFundCalculation.model.StyleEntity;
import org.investmentFundCalculation.model.StyleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StyleRepository extends JpaRepository<StyleEntity, Long> {
    Optional<StyleEntity> findByName(StyleEnum name);
}
