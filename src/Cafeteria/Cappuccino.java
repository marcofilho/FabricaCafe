package Cafeteria;

import Intefaces.FabricaTipoCafe;

/**
 * Created by Marco on 02/10/2015.
 */

public class Cappuccino implements FabricaTipoCafe {

    private Double valor;
    private Ingredientes ingrediente;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public void fazerCafe() {

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setValor(5.0);
        System.out.println(cappuccino.getValor());

        Ingredientes ingrediente = new Ingredientes();
        ingrediente.setCafeSoluvel("50 gramas");
        ingrediente.setAcucar("20 gramas");
        ingrediente.setAgua("200 ml");
        ingrediente.setBicarbonato("3 gotas");
        ingrediente.setCanela("15 gramas");
        ingrediente.setChocolate("50 gramas");
        ingrediente.setCanela("2 colheres");

        cappuccino.setIngrediente(ingrediente);

    }
}
