import java.lang.Math; // headers MUST be above the first class
import java.util.HashMap;

public class ClientePF{
  private String nome;
  private Endereco endereco;
  private Telefone telefone;
  
  public ClientePF(String nome, Endereco end, Telefone tel){
  	this.nome = nome;
    this.endereco = end;
    this.telefone = tel;
  }
  
  
  public String toString(){
    return "nome: "+this.nome+" - Endereco "+this.endereco.toString()+" - "+
      "Telefone: "+this.telefone.toString();
  }
  
}

