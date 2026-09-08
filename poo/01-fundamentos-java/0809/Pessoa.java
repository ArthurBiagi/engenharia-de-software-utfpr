static int cpf = 0;
    static String nome = "";

    public static void main(String arg[]){
        int x = 10;

        Pessoa p; //declaração
        p = new Pessoa(); //instanciação
    }

    // Getters 
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
