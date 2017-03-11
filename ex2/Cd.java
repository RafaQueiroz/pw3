public class Cd{
    private String titulo;
    private int ano;
    private String banda;
    
    public Cd(String titulo, int ano, String banda){
        this.titulo = titulo;
        this.ano = ano;
        this.banda = banda;
    }
    
    public String toString(){
        return "titulo: "+titulo+" - ano: "+ano+" - banda: "+banda;
    }
}