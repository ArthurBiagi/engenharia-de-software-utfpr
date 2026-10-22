public class Loja {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Contato contato;
    private Departamento[] departamentos;
    private int quantidadeDepartamentos;

    // Construtor Default
    public Loja() {
        this.departamentos = new Departamento[10];
        this.quantidadeDepartamentos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getQuantidadeDepartamentos() {
        return quantidadeDepartamentos;
    }

    public void setQuantidadeDepartamentos(int quantidadeDepartamentos) {
        this.quantidadeDepartamentos = quantidadeDepartamentos;
    }

    public void adicionarDepartamento(Departamento dep) throws CapacidadeExcedidaException {
        if (quantidadeDepartamentos >= departamentos.length) {
            throw new CapacidadeExcedidaException("Capacidade máxima de departamentos na loja foi atingida!");
        }
        this.departamentos[quantidadeDepartamentos] = dep;
        this.quantidadeDepartamentos++;
    }
}
