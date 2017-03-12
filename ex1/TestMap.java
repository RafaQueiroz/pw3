import java.lang.Math; // headers MUST be above the first class
import java.util.HashMap;

public class TestMap{
  
  public static void main(String[] args){
	
    Endereco e1= new Endereco("Rua Nascimento Soares de Araujo, 150", "Casa");
    Endereco e2= new Endereco("Rua Nascimento Soares de Araujo, 30", "Casa");
    Endereco e3= new Endereco("Rua Nascimento Soares de Araujo, 50", "Casa");
    
    Telefone t1= new Telefone(51, 999999999);
    Telefone t2= new Telefone(51, 999999997);
    Telefone t3= new Telefone(51, 999999995);
    
    ClientePF c1 = new ClientePF("Rafael", e1, t1);
    ClientePF c2 = new ClientePF("Paulo", e2, t2);
    ClientePF c3 = new ClientePF("Jorge", e3, t3);
    
    HashMap<String, ClientePF> clientes = new HashMap<String, ClientePF>();
    
    clientes.put("02576566006", c1);
    clientes.put("02576566007", c2);
    clientes.put("02576566008", c3);
    
    
    for(HashMap.Entry<String, ClientePF> cliente : clientes.entrySet()){
    	System.out.println("--------------------------------------\n") ;
      	System.out.println("cpf: "+cliente.getKey()+" \n") ;
    	System.out.println("cliente: "+cliente.getValue()+" \n") ;
    }
   
  }
}



