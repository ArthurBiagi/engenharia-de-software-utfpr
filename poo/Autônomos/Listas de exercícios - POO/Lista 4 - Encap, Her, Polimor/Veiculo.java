// Arthur Valsezia dos Santos Biagi RA: 2809320

public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor;
    private String dataCadastro;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.qtdRodas = 0;
        this.velocMax = 0;
        this.motor = new Motor();
        this.dataCadastro = "";
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        setVelocMax(velocMax); 
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }

    public abstract float calcVel();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        if (velocMax < 10 || velocMax > 250) {
            System.out.println("\nA velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
        } else {
            this.velocMax = velocMax;
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
