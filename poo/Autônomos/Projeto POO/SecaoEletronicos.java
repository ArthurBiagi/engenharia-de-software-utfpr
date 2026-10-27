//Arthur Valsezia dos Santos Biagi RA: 2809320
public class SecaoEletronicos extends Departamento implements Relatorio {
    private int voltagem;
    private int mesesGarantia;

    public SecaoEletronicos() {
    }

    public SecaoEletronicos(int id, String nome, int voltagem, int mesesGarantia) {
        super(id, nome);
        this.voltagem = voltagem;
        this.mesesGarantia = mesesGarantia;
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

    @Override
    public String gerarRelatorio() {
        return "--- SECAO ELETRONICOS ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Voltagem: " + voltagem + "V\n" +
               "Garantia: " + mesesGarantia + " meses";
    }
}
