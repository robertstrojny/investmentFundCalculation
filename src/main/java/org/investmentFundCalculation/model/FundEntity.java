package org.investmentFundCalculation.model;

import lombok.Getter;
import lombok.Setter;
import org.investmentFundCalculation.calculation.dto.FundType;

import javax.persistence.*;

@Entity
public class FundEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    @Enumerated
    private FundType type;
}
