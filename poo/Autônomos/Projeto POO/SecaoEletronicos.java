public class SecaoEletronicos extends Departamento implements Relatorio {
    private int voltagem;
    private int mesesGarantia;

    // Construtor Default
    public SecaoEletronicos() {
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    //Sobrescrita
    public double calcularMeta() {
        return 12000.00 * 1.20;
    }

    //Sobrecarga
    public double calcularMeta(double fatorMultiplicador) {
        return 12000.00 * fatorMultiplicador;
    }

    //Sobrescrita
    public String gerarRelatorio() {
        return "Setor Eletrônicos [ID: " + getId() + ", Nome: " + getNome() + 
               ", Voltagem: " + voltagem + "V, Garantia: " + mesesGarantia + " meses" + 
               ", Meta Calculada: R$ " + calcularMeta() + "]";
    }
}
