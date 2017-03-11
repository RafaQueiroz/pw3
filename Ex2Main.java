import java.util.LinkedList;

public class Ex2Main{
    public static void main(String[] args){
        
        
        PilhaCds cdStack = new PilhaCds();
        Cd[] cds = new Cd[PilhaCds.MAX_LENGTH];
        
        for(int i= 0; i< PilhaCds.MAX_LENGTH; i++){
            Cd cdAux = new Cd("cd"+i, 2000+i, "banda"+i);
            cds[i] = cdAux;
        }
        
        for(int i= 0; i< PilhaCds.MAX_LENGTH; i++){
            cdStack.add(cds[i]);
        }
        System.out.println(cdStack.toString());
        
        for(int i= 0; i< 2; i++){
            Cd cdRemovido = cdStack.remove();
            System.out.println( cdRemovido != null ? "Removido: "+cdRemovido.toString() : "Pilha está vazia");
        }
        
        System.out.println(cdStack.toString());
        
    }
}