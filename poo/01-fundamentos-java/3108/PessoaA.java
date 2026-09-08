public class PessoaA {
    static int cpf = 0;
    static String nome = "";

    public static void main(String arg[]){
        int x = 10;

        PessoaA p; //declaração
        p = new PessoaA(); //instanciação

        PessoaA p2 = new PessoaA();

        p.entDados(34, "Emet");
        p2.entDados(124, "Adonai");

        p.impDados();
        p2.impDados();

        System.out.println("\n Nome de P: "+ p.nome);
        System.out.println("\n Cpf de P2: "+ p2.cpf);
        //System.out.println("\n Endereço p"+ p);
        //System.out.println("\n Endereço P2"+ p2);

        /*int a = 7;
        String b = "El Artu";

        entDados(a, b);
        impDados();
        */
    }

    public static void entDados(int c, String n){
        cpf = c;
        nome = n;
    }

    public static void impDados(){
        System.out.println();
    }
}
