// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class CapacidadeExcedidaException extends Exception {

    //Sobrecarga
    public CapacidadeExcedidaException() {
        super("Capacidade maxima excedida!");
    }

    //Sobrecarga
    public CapacidadeExcedidaException(String mensagem) {
        super(mensagem);
    }
}
