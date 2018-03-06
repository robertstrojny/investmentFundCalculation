package org.investmentFundCalculation.service.impl;

import org.investmentFundCalculation.calculation.dto.CalculationResult;
import org.investmentFundCalculation.service.CalculationDto;
import org.investmentFundCalculation.service.InvestmentsFundRestService;
import org.investmentFundCalculation.service.calculation.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InventmentsFunndRestServiceImpl implements InvestmentsFundRestService {
    @Autowired
    private CalculationService calculationService;

    @Override
    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculationResult> calculate(@RequestBody CalculationDto calculationDto) {
        return new ResponseEntity<>(calculationService.calculate(calculationDto), HttpStatus.OK);
    }
}
