// Arthur Valsezia dos Santos Biagi RA: 2809320

class ImprimeNome {
    public static void main(String[] args) {
        // Verifica se foi passado pelo menos um parâmetro na execução
        if (args.length > 0) {
            // Unifica os argumentos caso o nome tenha apelidos/sobrenomes (ex: "João Silva")
            String nome = String.join(" ", args);
            System.out.println("Meu nome é: " + nome);
        } else {
            System.out.println("Nenhum nome foi passado como parâmetro.");
        }
    }
}
