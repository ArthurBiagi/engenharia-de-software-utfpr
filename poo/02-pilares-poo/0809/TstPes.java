public class TstPes {
    public static void main(String arg[]){
        Pessoa pl = new Pessoa();

        pl.setCpf(133);
        pl.setNome("Kadoah");

        System.out.println("\n CPF...: "+pl.getCpf());
        System.out.println("\n NOME...: "+pl.getNome());
    }
}