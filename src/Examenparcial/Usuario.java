/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

/**
 *
 * @author campitos
 */
public class Usuario {
    private String nombre;
    private Libros libros[];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libros[] getLibros() {
        return libros;
    }

    public void setLibros(Libros[] libros) throws ExcepcionLibros{
        this.libros = libros;
    }
    public void prestar() throws ExcepcionLibros{
        
    }
    
}