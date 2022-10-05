package br.cefetmg.inf.agenda.model.dao;

import br.cefetmg.inf.agenda.common.PersistenciaException;
import br.cefetmg.inf.agenda.model.dto.Rotulo;
import java.util.ArrayList;
import java.util.List;

public class RotuloDAO {
    
    private static List<Rotulo> rotuloList;
    private static int chave;
    static {
        rotuloList = new ArrayList<>();
        chave = 1;
    }
    
    private RotuloDAO() { }
   
    public static Rotulo consultarPorNome(String nome) {

        for (Rotulo r: rotuloList)
            if (r.getNome().equals(nome))
                return r;
        
        return null;    //não encontrou
    }
    
    public static Rotulo inserir(String nome) throws PersistenciaException {
        
        if (consultarPorNome(nome) == null) {
            Rotulo r = new Rotulo(chave, nome);
            rotuloList.add(r);
            chave++;
            return r;
        }
        throw new PersistenciaException("Violação de campo unico: nome");
    }
}
