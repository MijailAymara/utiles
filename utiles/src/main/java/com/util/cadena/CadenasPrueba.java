/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util.cadena;

import com.bytesw.util.program.Logger;

/**
 *
 * @author UserTBS1
 */
public class CadenasPrueba {
    
    
    public static void main(String[] args) {
        
        String prueba  = validarTelefonoAbonado("1234567890123");
        
        System.out.println("prueba > " + prueba.toString());
    }
    
     public static String limpiarCorchetes(String cadena, char tipoCaracter) {
	    if (cadena.length() > 1 && cadena.charAt(cadena.length()-1)==tipoCaracter) {
	    	cadena = cadena.substring(1, cadena.length()-1);
	    }
	    return cadena;
    }
     
     
     
     
      public static String validarTelefonoAbonado(String valNumeroCompleto){
        
        String mensajeValidacionTelefono = "OK";
        

        String regex = "\\d{9,12}";
        if(valNumeroCompleto==null) {
            mensajeValidacionTelefono = "El teléfono de la función son nulos o vacios";
            Logger.printDebug("", mensajeValidacionTelefono );
        }
        
        try {
            
         if (!valNumeroCompleto.matches(regex)) {
            mensajeValidacionTelefono = "El valor del telefono no cumplen con el formato";
            Logger.printDebug("", mensajeValidacionTelefono);
          }
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
            mensajeValidacionTelefono = "El Telefono no posee formato de valor numérico entero";

        }  catch (NullPointerException e) {
            e.printStackTrace();
            mensajeValidacionTelefono = "El Telefono no posee formato de valor numérico entero";

        } catch (Exception e) {
            e.printStackTrace();
            mensajeValidacionTelefono = "El Telefono no posee formato de valor numérico entero";

        } 
        
        return  mensajeValidacionTelefono;
        
        
        
    }
}
