import java.util.LinkedList;

public class FilaCarro{
    private LinkedList<Carro> carQueue;
    
    public FilaCarro(){
        this.carQueue = new LinkedList<Carro>();
    }
    
    public void add(Carro car){
        if(car != null)
            this.carQueue.addLast(car);
    }
    
    public Carro remove(){
        if(this.carQueue.size() == 0)
            return null;
        
        return carQueue.removeFirst();
    }
    
    public String toString(){
        String sOut = new String();
        
        for(Carro car : carQueue){
            sOut += car.toString()+"\n";
        }
        return sOut;
    }
}