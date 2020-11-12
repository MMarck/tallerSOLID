package Procesos;

import Postres.Helado;
import Postres.Pastel;
import Postres.Postre;

public class CalculadorPrecioFinalPastel extends CalculadorPrecioFinal{

    @Override
    public double calPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }

    @Override
    public String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calPrecioFinal(postre);
    }
}