/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProvarValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            // TODO code application logic here
            int edad=20;
            
            System.out.println("vamos a validar tu edad");
            try {
            ValidarEdad.validar(edad);
            System.out.println("SI TU TE VEZ NO SE LANZO LA EXPCION");
            
        } catch (MenordeEdadExeption ex) {
             System.out.println(ex.getMessage());
             
            
        } catch (NumberFormatException ex){
            System.out.println("Metiste letras y no numeros TONTO");
            
        }
        
        
    } 
    
}
