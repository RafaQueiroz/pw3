import java.lang.Math;

public class Ex4Main{
    public static final int NUM_INSERT = 5;
    
    public static void main(String[] args){
        
        Album album = new Album();
        int[] numeros = {7, 4, 6, 3, 8, 2, 1};
        
        
        
        for(int i = 0; i < NUM_INSERT; i++){
            Clube clube = new Clube("clube"+i, "estado"+i);
            Jogador jogador = new Jogador(i, "jogador"+i, 20+i, "pos"+i, clube);
            Figura figura = new Figura(numeros[i], 2000+i,  jogador);
            
            album.add(figura);
        }    
        
        System.out.println(album.toString());
        
        album.orderByNumero();
        System.out.println(album.toString());
        
        Figura figuraRemovida = album.remove(6);
        System.out.println(figuraRemovida != null ? 
                           "removido: "+figuraRemovida.toString() : "figura não encontrada");
        
        Figura figuraRemovida2 = album.remove(5);
        System.out.println(figuraRemovida2 != null ? 
                           "removido: "+figuraRemovida2.toString() : "figura não encontrada");
        
        System.out.println(album.toString());
    }
}