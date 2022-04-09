/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonubc
 */
public class Eletronico extends Produto {
    
     public int volt;
     public  int pot; 
    
 
     
     public double Calcular(){
           double ValorPromo = this.preco-preco*0.10;
           return ValorPromo;
     }
         
}
