public class Ex3Main{
    public static final int NUM_INSERT = 5;
    public static final int NUM_REMOVE = 2;
    
    public static void main(String[] args){
        
        FilaCarro carQueue = new FilaCarro();
        
        for(int i=0; i < NUM_INSERT; i++){
            Carro carAux = new Carro("AAA00"+i, 2000+i, "Modelo"+i);
            carQueue.add(carAux);
        }
        
        System.out.println(carQueue.toString());
        
        for(int i =0; i < NUM_REMOVE; i++){
            Carro removedCar = carQueue.remove();
            System.out.println(removedCar != null ? "Removido: "+removedCar.toString() : "Fila Vazia");
        }
        
        System.out.println(carQueue.toString());
        
    }
}