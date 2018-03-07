package org.investmentFundCalculation.service.fund.impl;

import org.investmentFundCalculation.calculation.TestData;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.dao.FundRepository;
import org.investmentFundCalculation.model.FundEntity;
import org.investmentFundCalculation.service.fund.FundService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class FundServiceImplTest extends TestData{

    private FundRepository fundRepositoryMock;
    private FundService fundService;

    @Before
    public void setUp() {
        fundRepositoryMock = Mockito.mock(FundRepository.class);
        fundService = new FundServiceImpl(fundRepositoryMock);
    }

    @Test
    public void findAllFunds() {
        List<FundEntity> fundEntities = new ArrayList<>();
        getFundsFirstCase().forEach(f->fundEntities.add(FundEntity.builder().id(f.getId()).name(f.getName()).
                type(f.getType()).build()));

        Mockito.when(fundRepositoryMock.findAll()).thenReturn(fundEntities);
        List<Fund> allFunds = fundService.findAllFunds();
        Assert.assertEquals(6, allFunds.size());
    }
}