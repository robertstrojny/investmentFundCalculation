package org.investmentFundCalculation.model;

import lombok.*;
import org.investmentFundCalculation.calculation.dto.FundType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PercentOfFundEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Integer percent;

    @Getter
    @Setter
    private FundType fundType;
}
