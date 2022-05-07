
package listaveiculo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lista {

    ArrayList<Veiculo> lista = new ArrayList<Veiculo>();/*Criando uma lista*/
    
    
    public void Cadastrar(String mc, String md, int ano){
    
        lista.add(new Veiculo(mc, md, ano));
    
    }
    
    public void Listar(){
    
        for(Veiculo veic:lista){
            System.out.println(veic.getModelo()+" "+veic.getMarca()+" "+veic.getAno());
        }
    
    }
    
    
    public void Excluir(String mod){
        int i;
        boolean verifica= false;
        for(i=0;i< lista.size();i++){
              if((lista.get(i).getModelo()).equals(mod)){
                    lista.remove(i);
                    JOptionPane.showMessageDialog(null,"Registro excluído");
                    verifica = true;
              
              }
              if(verifica==false){
                  JOptionPane.showMessageDialog(null,"Registro não encontrado");
              }
              
          
        }
    
    }

    
}
