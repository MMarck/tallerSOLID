package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;


public class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor, double precioParcial){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = precioParcial;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    
    @Override
    public String toString() {
    	String name = this.getClass().getName();
        return name.substring(8,name.length()) + "{ sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }


}
