public class Figura{
    private int numero;
    private int ano;
    private Jogador jogador;
    
    public Figura(int numero, int ano, Jogador jogador){
        this.numero = numero;
        this.ano = ano;
        this.jogador = jogador;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String toString(){
        return "figura[ numero: "+numero+" - ano: "+ano+
            " - jogador: "+jogador+" ] \n";
    }
    
}