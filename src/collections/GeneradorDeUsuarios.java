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
public class GeneradorDeUsuarios {
    
    private List<Usuario>usuarios;
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("giselle",22,"kimhyechul15@gmail.com");
        Usuario u2=new Usuario("ana",28,"ana@outlook");
        Usuario u3=new Usuario("jose",25,"jose@outlook");
        
        usuarios=new ArrayList<Usuario>();
        
     
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
