package org.investmentFundCalculation.service.calculation.impl;

import org.investmentFundCalculation.calculation.Calculation;
import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.calculation.dto.PercentOfFundDto;
import org.investmentFundCalculation.dao.FundRepository;
import org.investmentFundCalculation.dao.StyleRepository;
import org.investmentFundCalculation.model.FundEntity;
import org.investmentFundCalculation.model.StyleEntity;
import org.investmentFundCalculation.service.CalculationDto;
import org.investmentFundCalculation.service.calculation.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CalculationServiceImpl implements CalculationService{

    private FundRepository fundRepository;

    private StyleRepository styleRepository;

    @Autowired
    public CalculationServiceImpl(FundRepository fundRepository, StyleRepository styleRepository) {
        this.fundRepository = fundRepository;
        this.styleRepository = styleRepository;
    }

    @Override
    public CalculationResult calculate(CalculationDto calculationDto) {
        List<FundEntity> fundEntityList = fundRepository.findAllById(calculationDto.getFundList());
        List<Fund> funds = new ArrayList<>();
        fundEntityList.forEach(f-> funds.add(Fund.builder().type(f.getType()).name(f.getName()).id(f.getId()).build()));
        Optional<StyleEntity> styleEntity = styleRepository.findByName(calculationDto.getStyle());
        List<PercentOfFundDto> percentOfFundDtos = new ArrayList<>();
        styleEntity.ifPresent(styleEntity1 -> styleEntity1.getPercentOfFundEntities().forEach(p -> percentOfFundDtos.add(
                PercentOfFundDto.builder().percent(p.getPercent()).fundType(p.getFundType()).build())));

        Calculation calculation = new Calculation(percentOfFundDtos);
        return calculation.calculate(funds, calculationDto.getValue());
    }
}
