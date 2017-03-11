public class Jogador{
    private int numeroCamiseta;
    private String nome;
    private int idade;
    private String posicao;
    private Clube clube;
    
    public Jogador(int numeroCamiseta, String nome, int idade,
                   String posicao, Clube clube){
        this.numeroCamiseta = numeroCamiseta;
        this.nome = nome;
        this.posicao = posicao;
        this.clube = clube;
    }
    
    public String toString(){
        return "jogador[ numeroCamiseta: "+numeroCamiseta+" - nome: "+nome+
            " - idade: "+idade+" - posicao: "+posicao+" - clube : "+clube.toString()+"]";
            
    }
}