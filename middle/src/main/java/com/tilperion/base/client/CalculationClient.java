package com.tilperion.base.client;

import com.tilperion.common.dto.ResponseDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("stores")
public interface CalculationClient {

    @RequestMapping(value = "/pi", method = RequestMethod.GET)
    public ResponseDto getPi(@RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision);

    @RequestMapping(value = "/sin", method = RequestMethod.GET)
    public ResponseDto getSin(@RequestParam(name = "x", required = true) double x,
                              @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision);

    @RequestMapping(value = "/cos", method = RequestMethod.GET)
    public ResponseDto getCos(@RequestParam(name = "x", required = true) double x,
                              @RequestParam(name = "precision", defaultValue = "10", required = false) Integer precision);
}
