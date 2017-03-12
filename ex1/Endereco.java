import java.lang.Math; // headers MUST be above the first class
import java.util.HashMap;

public class Endereco{
	private String logradouro;
  	private String complemento;
  
  public Endereco(String log, String comp){
  	this.logradouro = log;
    this.complemento = comp;
  }
  
  
  public String toString(){
  	return "logradouro: "+this.logradouro+" - complemento "+this.complemento;
  }
  
}

