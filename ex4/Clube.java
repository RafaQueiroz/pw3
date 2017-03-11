public class Clube{
    private String nome;
    private String uf;
    
    public Clube(String nome, String uf){
        this.nome = nome;
        this.uf = uf;
    }
    
    public String toString(){
        return "clube[ nome: "+nome+" - uf: "+uf+" ]";
    }
}