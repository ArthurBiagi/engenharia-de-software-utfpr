public class Entrada {
    public static void main(String arg[]) {
        int x = Integer.parseInt(arg[0]);
        int y = Integer.parseInt(arg[1]);

        // int x = 1;
        // int y = 2;
        // int y = (int) x; // Casting

        int c = (x + y);

        System.out.println("\n Valor de X: " + x);
        System.out.println("\n Valor de Y: " + y);
        System.out.println("\n A soma de X+Y: " + c);

    }
}
/*
 * Casting = altera o comportamento da variável sem alterá-la
 * Warppers = Permite alterar o comprimento de um tipo
 * Interger = parseInt(Str) | toString(Int)
 * Float <> float
 * Double
 * Character
 * System.out.println("\n O nome eh: "+ arg[0]);
 * System.out.println("\n O nome eh: "+ arg[1]);
 */
