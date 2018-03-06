package org.investmentFundCalculation.service.impl;

import org.investmentFundCalculation.calculation.dto.Fund;
import org.investmentFundCalculation.service.FundRestService;
import org.investmentFundCalculation.service.fund.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fund")
public class FundRestServiceImpl implements FundRestService{

    @Autowired
    private FundService fundService;


    @Override
    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Fund>> findAllFunds() {
        return new ResponseEntity<>(fundService.findAllFunds(), HttpStatus.OK);
    }
}
