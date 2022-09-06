package com.factoryISS;

import com.factoryISS.model.IssModel;
import com.factoryISS.model.calculoIss.IssFactory;

import java.math.BigDecimal;

public class MainTeste {
    public static void main(String[] args) {
        IssModel issModel = new IssModel(2, "fortaleza", new BigDecimal("500.0"));
        IssFactory issFactory = new IssFactory();
        BigDecimal resultado = issFactory.getIss("fortaleza").calculoIss(issModel);
        System.out.println(resultado);
    }
}
