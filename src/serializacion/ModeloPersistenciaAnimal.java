/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
import java.util.ArrayList;
public class ModeloPersistenciaAnimal {
    String ruta=  "D:\\animales.gis";
     ArrayList<Animal> animales;
    
    public ModeloPersistenciaAnimal(){
      animales=new ArrayList<Animal>();
        
        
    }
    public void guardar (Animal animal)throws Exception{
        //paso1 crear el archivo donde se guaradara el animal
        File file=new  File(ruta);
        if(file.exists()){
            animales =buscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        animales.add(animal);
        oos.writeObject(animales);
        System.out.println("Animalito enlatado listo para llevar");
    }
    public ArrayList<Animal> buscarTodos() throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ios=new ObjectInputStream(fis);
      animales = (ArrayList<Animal>) ios.readObject();
        return   animales;
        
    }
}



 