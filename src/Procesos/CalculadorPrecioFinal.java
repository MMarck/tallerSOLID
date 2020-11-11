package Procesos;

import Postres.Helado;
import Postres.Pastel;

/**
 *
 * @author wesley
 */
public class CalculadorPrecioFinal {
    
    public static double calPrecioFinalHelado(Helado postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static double calPrecioFinalPastel(Pastel postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Helado postre){
        return "Precio Final: $ " + calPrecioFinalHelado(postre);
    }
    
    public static String showPrecioFinal(Pastel postre){
        return "Precio Final: $ " + calPrecioFinalPastel(postre);
    }
}
