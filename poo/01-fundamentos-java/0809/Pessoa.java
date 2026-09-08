public class Pessoa{
    
    int cpf = 0;
    String nome = "";


    // Getters --> recuperam os valores dos atributos
    public int getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    // Setters --> ALTERAM OS VALORES DOS ATRIBUTOS

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}