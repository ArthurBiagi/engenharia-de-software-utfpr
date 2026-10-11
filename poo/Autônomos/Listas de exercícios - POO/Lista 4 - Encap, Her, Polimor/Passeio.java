// Arthur Valsezia dos Santos Biagi RA: 2809320

public class Passeio extends Veiculo implements Calc {

    private int qtdePassageiro;

    // Construtor Default
    public Passeio() {
        super();
        this.qtdePassageiro = 0;
    }

    // Construtor Sobrecarregado
    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.qtdePassageiro = qtdePassageiro;
    }

    // Sobrescrita do método calcVel: converte de Km/h para M/h (metros por hora)
    @Override
    public float calcVel() {
        return getVelocMax() * 1000.0f;
    }

    // Sobrescrita da interface Calc: soma das quantidades de letras em atributos do tipo String
    @Override
    public int calcular() {
        int somaLetras = 0;
        somaLetras += (getPlaca() != null) ? getPlaca().length() : 0;
        somaLetras += (getMarca() != null) ? getMarca().length() : 0;
        somaLetras += (getModelo() != null) ? getModelo().length() : 0;
        somaLetras += (getCor() != null) ? getCor().length() : 0;
        somaLetras += (getDataCadastro() != null) ? getDataCadastro().length() : 0;
        return somaLetras;
    }

    // Getters e Setters
    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }
}
