/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin26;

import java.awt.*;


/**
 *
 * @author rpachotome
 */
public class Metodos {
   int num[]=new int[6];
   int cont=0;
   
public void activarBoton(Button bot){
    bot.setForeground(Color.GREEN);
    num[cont]=Integer.parseInt(bot.getLabel());
}
    
}
