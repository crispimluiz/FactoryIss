package com.factoryISS.model.calculoIss;

public class IssFactory {
    public CalculoISS getIss(String nomeCidade){
        if(nomeCidade.equalsIgnoreCase("sao_paulo")){
            return new IssSp();
        }else if(nomeCidade.equalsIgnoreCase("fortaleza")){
            return new IssFortaleza();
        }  else {
            return null;
        }
    }
}
