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
public class Pastel extends Postre{

    public Pastel(String sabor) {
	super(sabor, 15.55);
	// TODO Auto-generated constructor stub
    }
        
    public static void anadirAderezo(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().remove(aderezo);
    }
    
	
    //esta sobreescritura realmente no es necesaria
    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
}
