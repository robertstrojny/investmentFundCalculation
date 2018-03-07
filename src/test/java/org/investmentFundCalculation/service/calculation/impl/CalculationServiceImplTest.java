package org.investmentFundCalculation.service.calculation.impl;

import org.investmentFundCalculation.calculation.TestData;
import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.dao.FundRepository;
import org.investmentFundCalculation.dao.StyleRepository;
import org.investmentFundCalculation.model.FundEntity;
import org.investmentFundCalculation.model.StyleEntity;
import org.investmentFundCalculation.model.StyleEnum;
import org.investmentFundCalculation.service.CalculationDto;
import org.investmentFundCalculation.service.calculation.CalculationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationServiceImplTest extends TestData {

    private CalculationService calculationService;
    private FundRepository fundRepositoryMock;
    private StyleRepository styleRepositoryMock;

    @Before
    public void setUp() {
        fundRepositoryMock = Mockito.mock(FundRepository.class);
        styleRepositoryMock = Mockito.mock(StyleRepository.class);

        calculationService = new CalculationServiceImpl(fundRepositoryMock, styleRepositoryMock);
    }

    @Test
    public void calculate() {
        List<FundEntity> fundEntities = new ArrayList<>();
        getFundsFirstCase().forEach(f->fundEntities.add(FundEntity.builder().id(f.getId()).name(f.getName()).
                type(f.getType()).build()));
        Mockito.when(fundRepositoryMock.findAllById(Mockito.anyIterable())).thenReturn(fundEntities);

        StyleEntity styleEntity = getStyleEntity();
        Mockito.when(styleRepositoryMock.findByName(Mockito.any())).thenReturn(java.util.Optional.ofNullable(styleEntity));
        CalculationDto calculationDto = CalculationDto.builder().fundList(getFundsFirstCase().stream().map(Fund::getId).collect(Collectors.toList()))
                .style(StyleEnum.SAFE).value(10000).build();

        CalculationResult calculate = calculationService.calculate(calculationDto);
        Assert.assertEquals(6, calculate.getCalculationResultRows().size());
        Assert.assertEquals(0, calculate.getUnresolved().intValue());
    }


}