/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrensia;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class RelojitoMejorado {

public static void main(String[] args){

    Thread t1;
    t1 = new Thread(new Runnable(){
        private Object calendar;
        private Object Clanedar;

        @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(1000);
                    Calendar cal=calendar.getInstance;
                    int hora=cal.get(Calendar.HOUR);
                    int minutos=cal.get(Calendar.MINUTE);
                    int segundos=cal.get(Calendar.SECOND);
                    System.out.println(hora+":"+minutos+":")+segundos);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(RelojitoMejorado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    });
t1.start();
}
}