import java.util.LinkedList;

public class Ex2Main{
    
    public static final int MAX_LENGTH = 7;
    
    public static void main(String[] args){
        
        
        PilhaCds cdStack = new PilhaCds();
                
        for(int i= 0; i<MAX_LENGTH; i++){
            Cd cdAux = new Cd("cd"+i, 2000+i, "banda"+i);
            cdStack.add(cdAux);
        }
        
        System.out.println(cdStack.toString());
        
        for(int i= 0; i< 2; i++){
            Cd cdRemovido = cdStack.remove();
            System.out.println( cdRemovido != null ? "Removido: "+cdRemovido.toString() : "Pilha está vazia");
        }
        
        System.out.println(cdStack.toString());
        
    }
}
