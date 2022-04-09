/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonubc
 */
public class Mobilia extends Produto {
    
    public String cor;
    public String material;
    
    public double Calcular(){
           double ValorPromo = this.preco-preco*0.30;
           return ValorPromo;
     }
    
}
