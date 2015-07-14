/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[]args){
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
                            generadora.agregarUsuario("Chana",18,"chahcha@hotmail.com");
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generadora.getUsuarios();
                           System.out.println(usuarios.size());
    for(Usuario u:usuarios){
        System.out.println("Nombre:"+u.getNombre()+" Edad:"+u.getEdad()+"  Email:"+u.getEmail());
    }
    }
}
