package Cafeteria;

import Intefaces.AbstractFactoryCafeteria;

/**
 * Created by Marco on 02/10/2015.
*/


public class Cafeteira implements AbstractFactoryCafeteria {


    @Override
    public CafeNormal criarCafe() {
        return new CafeNormal();
    }

    @Override
    public Cappuccino criarCappuccino() {
        return new Cappuccino();
    }

    @Override
    public Descafeinado criarDescafeinado() {
        return new Descafeinado();
    }
}
