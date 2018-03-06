package org.investmentFundCalculation.service.fund.impl;

import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.dao.FundDao;
import org.investmentFundCalculation.model.FundEntity;
import org.investmentFundCalculation.service.fund.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class FundServiceImpl implements FundService {

    @Autowired
    private FundDao fundDao;

    @Override
    @Transactional(readOnly = true)
    public List<Fund> findAllFunds() {
        List<FundEntity> fundEntities = fundDao.findAll();
        List<org.investmentFundCalculation.calculation.dto.Fund> funds = new ArrayList<>();
        fundEntities.forEach(f-> funds.add(Fund.builder()
                .type(f.getType()).name(f.getName()).id(f.getId()).build()));
        return funds;
    }
}
