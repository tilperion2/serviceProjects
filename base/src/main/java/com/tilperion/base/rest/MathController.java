package com.tilperion.base.rest;


import com.tilperion.base.service.CalculationService;
import com.tilperion.common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private final CalculationService calculationService;

    @Autowired
    public MathController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(value = "/pi", method = RequestMethod.GET)
    public ResponseDto getPi(@RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        long begin = System.currentTimeMillis();
        String pi = calculationService.pi(precision).toPlainString();
        long end = System.currentTimeMillis();
        return new ResponseDto(pi, String.valueOf(end-begin));
    }

    @RequestMapping(value = "/sin", method = RequestMethod.GET)
    public ResponseDto getSin(@RequestParam(name = "x", required = true) double x,
                              @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        long begin = System.currentTimeMillis();
        String result = calculationService.sin(x, precision).toPlainString();
        long end = System.currentTimeMillis();
        return new ResponseDto(result, String.valueOf(end-begin));
    }

    @RequestMapping(value = "/cos", method = RequestMethod.GET)
    public ResponseDto getCos(@RequestParam(name = "x", required = true) double x,
                              @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision) {
        long begin = System.currentTimeMillis();
        String result = calculationService.cos(x,precision).toPlainString();
        long end = System.currentTimeMillis();
        return new ResponseDto(result, String.valueOf(end-begin));
    }
}
