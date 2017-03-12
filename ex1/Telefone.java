import java.lang.Math; // headers MUST be above the first class
import java.util.HashMap;

public class Telefone{
  private int ddd;
  private long numero;
  
  public Telefone(int ddd, long numero){
  	this.ddd = ddd;
    this.numero = numero;
  }
  
  
  public String toString(){
  	return "ddd: "+this.ddd+" - numero: "+this.numero;
  }
  
}