package org.investmentFundCalculation.calculation;

import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.dto.FundType;
import org.investmentFundCalculation.model.PercentOfFundEntity;
import org.investmentFundCalculation.model.StyleEntity;
import org.investmentFundCalculation.model.StyleEnum;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    protected List<Fund> getFundsFirstCase() {
        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id(1L).name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(2L).name("Fundusz Polski 2").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(3L).name("Fundusz Zagraniczny 1").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id(4L).name("Fundusz Zagraniczny 2").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id(5L).name("Fundusz Zagraniczny 3").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id(6L).name("Fundusz Pieniezny 1").type(FundType.FINANCIAL).build());

        return funds;
    }

    List<Fund> getFundsSecondCase() {
        List<Fund> funds = new ArrayList<>();
        funds.add(Fund.builder().id(1L).name("Fundusz Polski 1").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(2L).name("Fundusz Polski 2").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(3L).name("Fundusz Polski 3").type(FundType.POLISH).build());
        funds.add(Fund.builder().id(4L).name("Fundusz Zagraniczny 2").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id(5L).name("Fundusz Zagraniczny 3").type(FundType.FOREIGN).build());
        funds.add(Fund.builder().id(6L).name("Fundusz Pieniezny 1").type(FundType.FINANCIAL).build());

        return funds;
    }

    protected StyleEntity getStyleEntity() {
        List<PercentOfFundEntity> percentOfFundEntities = new ArrayList<>();
        percentOfFundEntities.add(PercentOfFundEntity.builder().id(1L).fundType(FundType.POLISH).percent(20).build());
        percentOfFundEntities.add(PercentOfFundEntity.builder().id(2L).fundType(FundType.FOREIGN).percent(75).build());
        percentOfFundEntities.add(PercentOfFundEntity.builder().id(3L).fundType(FundType.FINANCIAL).percent(5).build());

        return StyleEntity.builder().name(StyleEnum.SAFE).id(1L).percentOfFundEntities(percentOfFundEntities).build();
    }
}
