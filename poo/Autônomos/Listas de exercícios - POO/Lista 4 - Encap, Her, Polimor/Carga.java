// Arthur Valsezia dos Santos Biagi RA: 2809320

public class Carga extends Veiculo implements Calc {

    private int tara;
    private int cargaMax;

    public Carga() {
        super();
        this.tara = 0;
        this.cargaMax = 0;
    }

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    @Override
    public float calcVel() {
        return getVelocMax() * 100000.0f;
    }

    @Override
    public int calcular() {
        int somaNumericos = 0;
        somaNumericos += getQtdRodas();
        somaNumericos += getVelocMax();
        somaNumericos += (getMotor() != null) ? getMotor().getQtdPistoes() : 0;
        somaNumericos += (getMotor() != null) ? getMotor().getPotencia() : 0;
        somaNumericos += getTara();
        somaNumericos += getCargaMax();
        return somaNumericos;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
}
