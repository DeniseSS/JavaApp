
package listaveiculo;

import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Lista li = new Lista();
        int op=0;
        
        String texto= "1- Cadastrar\n2-Listar\n3-Excluir\n0- Sair";
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(texto));
            switch(op){
                
                
                case 1:
                    String marca= JOptionPane.showInputDialog("Marca: ");
                    String modelo= JOptionPane.showInputDialog("Modelo: ");
                    int anoFab= Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
                    li.Cadastrar(marca, modelo, anoFab);
                break;

                case 2:
                        li.Listar();
                break;

                case 3:
                       String mod =JOptionPane.showInputDialog("Modelo a Excluir");
                       li.Excluir(mod);
                break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Saindo do sistema");
                break;

                default:
                     JOptionPane.showMessageDialog(null,"Opção invalida");
                break;
            }

          }while(op!=0);
        
        
    }
    
}
