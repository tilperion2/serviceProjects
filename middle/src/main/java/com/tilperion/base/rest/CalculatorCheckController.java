package com.tilperion.base.rest;


import com.tilperion.base.service.CalculatorChecker;
import com.tilperion.common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorCheckController {

    private final CalculatorChecker calculatorChecker;

    @Autowired
    public CalculatorCheckController(CalculatorChecker calculatorChecker) {
        this.calculatorChecker = calculatorChecker;
    }

    @RequestMapping(value="checkPi", method = RequestMethod.GET)
    public ResponseDto checkPi(@RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        return new ResponseDto("This is BASE test!", "400ms");
    }

    @RequestMapping(value="checkSinCos", method = RequestMethod.GET)
    public ResponseDto checkSinCos(@RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        return new ResponseDto("This is BASE test!", "400ms");
    }
}
