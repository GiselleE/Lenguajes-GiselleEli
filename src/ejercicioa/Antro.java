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
public class Antro {

   public static void main(String[] args) {
        Direccion d1=new Direccion(55130,"ecatepec");
        Usuario u=new Usuario("juean",42,"jcampos@gmail.com",d1);
        System.out.println(u.getDireccion().getMunicipio());
        
        // TODO code application logic here
        
        Bebida bebida=new Bebida();
        bebida.setTipo("alcoholicas");
        String []reco=bebida.obtenerRecomendaciones();
        for(String be:reco){
            System.out.println("Bebida"+be);
        }
    }
    
}
