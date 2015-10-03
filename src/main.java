import Cafeteria.CafeNormal;
import Cafeteria.Cafeteira;
import Cafeteria.Cappuccino;
import Intefaces.AbstractFactoryCafeteria;
import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

/**
 * Created by Marco on 02/10/2015.
 */

public class main {

    public static void main (String[] args){

        AbstractFactoryCafeteria fabrica = new Cafeteira();
        Cappuccino cappuccino = fabrica.criarCappuccino();
        cappuccino.fazerCafe();

    }


}
