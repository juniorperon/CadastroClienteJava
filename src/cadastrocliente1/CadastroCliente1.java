
package cadastrocliente1;


public class CadastroCliente1 {

    public static void main(String[] args) {
        //instanciando um objeto
        Pessoa cliente = new Pessoa("Ailton", "47017699831", "Masc", "18020226", "SP", "Sorocaba", "Rua:Barcelona,163");
        
        
        System.out.println(cliente.getNome());
    }
    
    
}
