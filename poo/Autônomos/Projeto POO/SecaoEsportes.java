// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class SecaoEsportes extends Departamento implements Relatorio {
    private int quantidadeBolas;
    private String categoriaModalidade;

    //Sobrecarga
    public SecaoEsportes() {
        super();
        this.quantidadeBolas = 0;
        this.categoriaModalidade = "";
    }

    //Sobrecarga
    public SecaoEsportes(int id, String nome, int quantidadeBolas, String categoriaModalidade) {
        super(id, nome);
        this.quantidadeBolas = quantidadeBolas;
        this.categoriaModalidade = categoriaModalidade;
    }

    public int getQuantidadeBolas() {
        return quantidadeBolas;
    }

    public void setQuantidadeBolas(int quantidadeBolas) {
        this.quantidadeBolas = quantidadeBolas;
    }

    public String getCategoriaModalidade() {
        return categoriaModalidade;
    }

    public void setCategoriaModalidade(String categoriaModalidade) {
        this.categoriaModalidade = categoriaModalidade;
    }

    //Sobrescrita
    @Override
    public String gerarRelatorio() {
        return "--- SECAO ESPORTES ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Quantidade de Bolas: " + quantidadeBolas + "\n" +
               "Categoria: " + categoriaModalidade;
    }
}