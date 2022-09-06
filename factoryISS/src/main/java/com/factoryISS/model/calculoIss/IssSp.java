package com.factoryISS.model.calculoIss;

import com.factoryISS.model.IssModel;

import java.math.BigDecimal;

public class IssSp implements CalculoISS{
    @Override
    public BigDecimal calculoIss(IssModel issModel) {
        return issModel.getValor().multiply(new BigDecimal("0.03"));
    }
}
