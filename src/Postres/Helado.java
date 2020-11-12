/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;


/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{

    public Helado(String sabor) {
	super(sabor, 7.85);
    // TODO Auto-generated constructor stub
    }
        
    public static void anadirAderezo(Helado helado,Aderezo aderezo){
        helado.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }

    //esta sobreescritura realmente no es necesaria
    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
}
