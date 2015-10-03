package Intefaces;

import Cafeteria.CafeNormal;
import Cafeteria.Cappuccino;
import Cafeteria.Descafeinado;

/**
 * Created by Marco on 02/10/2015.
 */


public interface AbstractFactoryCafeteria {

    public CafeNormal criarCafe();
    public Cappuccino criarCappuccino();
    public Descafeinado criarDescafeinado();

}
