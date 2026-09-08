public class Pessoa{
    
    int cpf = 0;
    String nome = "";

    public static void main(String arg[]){
        Pessoa p1 = new Pessoa();
        p1.setCpf(133);
        p1.setNome("Kadoah");

        System.out.println("\n CPF...: "+p1.getCpf());
        System.out.println("\n NOME...: "+p1.getNome());

    }

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