/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonubc
 */
public class Vestiario extends Produto{
    
    public String tam;
    public String sex;
    
    public double Calcular(){
           double ValorPromo = this.preco-preco*0.20;
           return ValorPromo;
     }
    
}
