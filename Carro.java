public class Carro{
    private String placa;
    private int ano;
    private String modelo;
    
    public Carro(String placa, int ano, String modelo){
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }
    
    public String toString(){
        return "placa: "+placa+" - ano"+ano+" - modelo: "+modelo;
    }
}