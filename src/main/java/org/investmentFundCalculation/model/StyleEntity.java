package org.investmentFundCalculation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class StyleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private StyleEnum name;

    @Getter
    @Setter
    @OneToMany
    private List<PercentOfFundEntity> percentOfFundEntities;
}
