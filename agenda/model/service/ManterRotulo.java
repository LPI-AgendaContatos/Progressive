package br.cefetmg.inf.agenda.model.service;
   
import br.cefetmg.inf.agenda.model.dao.RotuloDAO;
import br.cefetmg.inf.agenda.common.NegocioException;
import br.cefetmg.inf.agenda.common.PersistenciaException;
import br.cefetmg.inf.agenda.model.dto.Rotulo;
import java.util.List;

public class ManterRotulo {
       
    private ManterRotulo() {}
    
    public static Rotulo cadastrarRotulo(String nome) throws NegocioException {   
        
        if (nome.isEmpty())
            throw new NegocioException(511, "O nome do rótulo é obrigatório.");
        
        try {
            return RotuloDAO.inserir(nome);
        } catch(PersistenciaException ex) {
            throw new NegocioException(512, "O rótulo de nome '" + nome +"' já está cadastrado.");            
        }
    }
    
    public static void excluirRotulo(String nome) {
        
    }
    
    public static void alterarRotulo(String nomeAnterior, String novoNome) {
        
    }
    
    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Rotulo> listarRotulos() {
        
        return null;
    }
}
