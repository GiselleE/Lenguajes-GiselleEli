package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazCompresora {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setNombre("Leon");
        a.setCarnivoro(true);
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try {
            modelo.guardar(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}