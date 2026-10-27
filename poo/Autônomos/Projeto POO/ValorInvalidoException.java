// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class ValorInvalidoException extends Exception {

    //Sobrecarga
    public ValorInvalidoException() {
        super("Valor invalido detectado!");
    }

    //Sobrecarga
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
