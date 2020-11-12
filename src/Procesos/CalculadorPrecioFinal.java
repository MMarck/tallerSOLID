package Procesos;

import Postres.Helado;
import Postres.Pastel;
import Postres.Postre;

/**
 *
 * @author wesley
 */
public abstract class CalculadorPrecioFinal {
    
    public abstract double calPrecioFinal(Postre postre);
    
    public abstract String showPrecioFinal(Postre postre);
    
}
