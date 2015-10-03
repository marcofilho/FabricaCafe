package Cafeteria;

import Intefaces.FabricaTipoCafe;

/**
 * Created by Marco on 02/10/2015.
 */


public class CafeNormal implements FabricaTipoCafe{


    private Double valor;
    private Ingredientes ingrediente;


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public void fazerCafe() {

        CafeNormal cafeNormal = new CafeNormal();
        cafeNormal.setValor(2.0);
        System.out.println(cafeNormal.getValor());

        Ingredientes ingrediente = new Ingredientes();
        ingrediente.setCafeDescafeinado("50 gramas");
        ingrediente.setAcucar("20 gramas");
        ingrediente.setAgua("200 ml");
        ingrediente.setBicarbonato("3 gotas");
        ingrediente.setCanela("15 gramas");
        ingrediente.setChocolate("50 gramas");
        ingrediente.setCanela("2 colheres");
    }

}
