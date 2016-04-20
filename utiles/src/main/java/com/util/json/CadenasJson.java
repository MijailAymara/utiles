/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util.json;


import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/**
 *
 * @author UserTBS1
 */
public class CadenasJson {
    
    
    
//    public static void main(String[] args) {
//        pruebaArrayJson();
//    }
    
    public static void pruebaArrayJson(){
        List<String> listaJson = new ArrayList<String>();
        try {
            System.out.println("listaJson : " + listaJson );
            
            JSONArray  arrayVacio = new JSONArray();
            JSONArray  array = new JSONArray("[]");
            
            System.out.println("arrayVacio : " + arrayVacio.toString() );
            System.out.println("array : " + array.optString(0) );
            
            JSONArray recursos = new JSONArray();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
      
        
    }
    
    
       public static void main(String[] args) {
        JSONArray recursos = new JSONArray();
        
        boolean b = validarRecursosPorProcesar(recursos);
        
        System.out.println(">> " + b);
    }
    
    public static boolean validarRecursosPorProcesar(JSONArray recursosPorProcesar){
        boolean existenRecursosPorProcesar = true;
        try {
            if(recursosPorProcesar==null|| recursosPorProcesar.length()==0){
                existenRecursosPorProcesar = false;
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return existenRecursosPorProcesar;
    }
}
