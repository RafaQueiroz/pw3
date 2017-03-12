import java.util.LinkedList;

public class PilhaCds{
    private LinkedList<Cd> cdStack;
    
    
    
    public PilhaCds(){
        this.cdStack = new LinkedList<Cd>();
    }
    
    public void setPilhaCds(LinkedList<Cd> cdStack){
        this.cdStack = cdStack;
    }
    public LinkedList getCdStack(){
        return this.cdStack;
    }
    
    public void add(Cd cd){
        cdStack.push(cd);
    }
    
    public Cd remove(){
        
        if(this.cdStack.size() == 0)
            return null;
                       
        return this.cdStack.pop();
    }
    
    public String toString(){
        String sOut = new String();
        
        for(Cd cd : cdStack){
            sOut += cd.toString()+"\n";
        }
        
        return sOut;
    }
} 
