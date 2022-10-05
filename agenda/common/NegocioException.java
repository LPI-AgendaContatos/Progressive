package br.cefetmg.inf.agenda.common;

public class NegocioException extends Exception {
    private int codigoErr;
    
    public NegocioException(String str) {
        super(str);
        codigoErr = 0;
    }
    
    public NegocioException(int codigo, String str) {
        super(str);
        codigoErr = codigo;
    }

    public int getCodigoErr() {
        return codigoErr;
    }
   
    
}
