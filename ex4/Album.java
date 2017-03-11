import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Album{
    private List<Figura> figuras;
    
    
    public Album(){
        this.figuras = new LinkedList<Figura>();
    }
    
    public void add( Figura figura){
        this.figuras.add(figura);
    }
    
    public Figura findByNumero(int numero){
        
        for(Figura figura : this.figuras){
            if(figura.getNumero() == numero){
                return figura;
            }
        }
        
        return null;
    }
    
    public Figura remove(int numero){
        
        if(this.figuras.size() == 0)
            return null;
        
        Figura figura = this.findByNumero(numero);
        
        if(figura == null)
            return null;
        this.figuras.remove(figura);
        
        return figura;
    }
    
    
    public void orderByNumero(){
        
        Comparator<Figura> comparator = new Comparator<Figura>() {
            @Override
            public int compare(Figura f1, Figura f2) {
                return f1.getNumero() - f2.getNumero(); 
            }
        };
        
        Collections.sort(figuras, comparator);
    }
    
    public String toString(){
        String sOut = "figuras [ \n";
        
        for(Figura figura : figuras){
            sOut += figura.toString();
        }
        sOut += " ]\n";
        return sOut;
    }
}