public class Saida {
    static int x = 1;
    static int y = 6;
    static int d = 0;

    public static void main(String arg[]) {
        int x = 1;
        int y = 6;
        // int c = (x+y);
        soma(x, y);
        System.out.println("\n[main] Soma: " + (x+y));
        System.out.println("\n[main] Soma: " + d);
    }

    public static void soma(int x, int Y) {
        int d = 10;
        d += (x+y);
        System.out.println("\n[soma] Soma: " + d);

        // return d;
    }
}
