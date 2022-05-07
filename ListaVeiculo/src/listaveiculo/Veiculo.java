
package listaveiculo;

/**
 *
 * @author logonubc
 */
public class Veiculo {
    
    
    private String modelo;
    private int ano;
    private String marca;
    
    
     
         /*Insere os valores*/
    public Veiculo(String md, String mc, int ano){
        
        this.modelo= md;
        this.ano = ano;
        this.marca=mc;

    }

  
    public String getModelo(){
        return modelo;
    
    }
    public int getAno(){
       return ano;
    
    }
    public String getMarca(){
       return marca;
    
    }
    

   
       
    
}
