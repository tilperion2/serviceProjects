package com.tilperion.base.service;

import ch.obermuhlner.math.big.BigDecimalMath;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;

@Service
public class CalculationService {

    public BigDecimal pi(int precision) {
        MathContext mathContext = new MathContext(precision);
        return BigDecimalMath.pi(mathContext);
    }

    public BigDecimal sin(double x, int precision) {
        MathContext mathContext = new MathContext(precision);
        return BigDecimalMath.sin(BigDecimal.valueOf(x), mathContext);
    }

    public BigDecimal cos(double x, int precision) {
        MathContext mathContext = new MathContext(precision);
        return BigDecimalMath.cos(BigDecimal.valueOf(x), mathContext);
    }
}
