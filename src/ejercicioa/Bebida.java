/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

/**
 *
 * @author T-107
 */
public class Bebida {
    public Bebida (){   
    }
     /*Si el tipo de bebidas es arreglar de bebidas es "alcoholica" regresar el arreglo de bebidas añcoholicas y si el tipo es no alcoholicas regrersar
   el tipo de arreglos de no_alcoholicas 
 */

    private String Tipo;
    private String [] bebidas;
    
    public String [] obtenerRecomendaciones (){
        if(Tipo.equals("alcoholicas")){
    String [] alcoholicas={"cerveza","coñac","visky","champagne","vino tinto","tequila","mezcal"};
   return alcoholicas;
   
        }
        else {
                   String [] noalcoholicas={"agua","limonada","naranjada","refreco","cafe"};  
                   return noalcoholicas;
                   
        }
 
        
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    }


    
