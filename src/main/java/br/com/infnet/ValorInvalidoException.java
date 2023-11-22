package br.com.infnet;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
