public class Ex5Main{
    public static void main(String[] args){
        
        Dicionario dicionario = new Dicionario();
        
        dicionario.add("hidroxilado", "Que adquiriu ou possui hidroxila.");
        dicionario.add("afeito", "Acostumado; que passou a possuir o aspecto de; que se habituou ou está acostumado com: o prefeito é afeito ao diálogo; não sou afeito ao povo");
        dicionario.add("imputar", "Acusar; atribuir responsabilidade, a culpa por: imputaram o roubo ao empregado.");
        dicionario.add("elegível", "Que pode ser alvo de eleição; que se consegue eleger; que está apto para concorrer ou fazer parte de um processo eleitoral: candidatura elegível.");
        
        
        System.out.println(dicionario.toString());
    }
}