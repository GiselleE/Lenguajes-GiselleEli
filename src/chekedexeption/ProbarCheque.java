/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chekedexeption;

/**
 *
 * @author T-107
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarCheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws IOException {
        // TODO code application logic here
        File f=new File("Archivaldo");
       
            FileOutputStream fos=new FilterOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
       
    }
    
}
