import java.util.Map;
import java.util.TreeMap;

public class Dicionario{
    private Map<String, String> palavras;
    
    
    public Dicionario(){
        this.palavras = new TreeMap<String, String>();
    }
    
    public boolean add(String palavra, String descricao){
        if(palavra == null || palavra.trim() == "")
            return false;
        if(descricao == null || descricao.trim() == "")
            return false;
        
        this.palavras.put(palavra, descricao);
        return true;
        
    }
    public boolean remove(String palavra){
        if(palavra == null || palavra.trim() == "")
            return false;
        
        if(this.palavras.size()==0)
            return false;
        
        if(!this.palavras.containsKey(palavra))
            return false;
        
        this.palavras.remove(palavra);
        return true;
    }
    
    public String busca(String palavra){
        if(palavra == null || palavra.trim() == "")
            return null;
            
        if(this.palavras.size() == 0)
            return null;
        
        return this.palavras.get(palavra);
        
    }
    
    public String toString(){
        String sOut = "Dicionario: \n";
        
        for(Map.Entry<String, String> item : this.palavras.entrySet()){
            sOut += "Palavra: "+item.getKey()+"\n"+
                "Definição: "+item.getValue()+"\n"+
                "-------------------------------\n";
        }
        
        return sOut;
    }
    
    
    
}