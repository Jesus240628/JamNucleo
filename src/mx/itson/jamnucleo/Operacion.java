/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.jamnucleo;

import java.util.List;
import mx.itson.jam.nucleo.execepciones.CapacidadException;
import mx.itson.jam.nucleo.execepciones.ImpuestoException;

/**
 *
 * @author Jesus Javier Quintero Fierro
 */
public class Operacion {
    
    public int sumar(int a, int b){
    return a+b;
}
    public double calcularIVA(double importe, double tasaIVA) throws ImpuestoException {
        if(tasaIVA !=8 || tasaIVA !=16){
            throw new ImpuestoException("La tasa de IVA solo puede ser del 8% o del 16%");
        }
        
        return(importe * (tasaIVA/100));
    }
    
    public int medirCapacidad(List <Integer> capacidad) throws CapacidadException{
    if(capacidad.isEmpty()|| capacidad.size()>10){
        throw new CapacidadException("La capacidad no puede ser cero elementos ó mas de diez elementos");
        } 
     int resultado=0;
        
      for(int a =0 ; a< capacidad.size(); a++){
        resultado += capacidad.get(a);
        }
    return resultado;
    }
}
