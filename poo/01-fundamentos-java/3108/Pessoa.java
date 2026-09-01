public class Pessoa {
    static int cpf = 0;
    static String nome = "";

    public static void main(String arg[]){
        int x = 10;

        Pessoa p; //declaração
        p = new Pessoa(); //instanciação

        Pessoa p2 = new Pessoa();

        System.out.println("\n Endereço p"+ p);
        System.out.println("\n Endereço P2"+ p2);
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
