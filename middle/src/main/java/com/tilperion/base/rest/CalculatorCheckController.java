package com.tilperion.base.rest;


import com.tilperion.base.client.CalculationClient;
import com.tilperion.base.service.CalculatorChecker;
import com.tilperion.common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorCheckController {

    @Autowired
    private CalculationClient calculationClient;

    @RequestMapping(value="checkPi", method = RequestMethod.GET)
    public ResponseDto checkPi(@RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        ResponseDto pi = calculationClient.getPi(precision);
        return pi;
    }

    @RequestMapping(value="checkSin", method = RequestMethod.GET)
    public ResponseDto checkSin(@RequestParam(name = "x", required = true) double x, @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        return calculationClient.getSin(x, precision);
    }

    @RequestMapping(value="checkCos", method = RequestMethod.GET)
    public ResponseDto checkCos(@RequestParam(name = "x", required = true) double x, @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        return calculationClient.getCos(x, precision);
    }
}
