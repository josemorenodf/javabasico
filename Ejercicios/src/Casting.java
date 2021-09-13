public class Casting {
    public static void main(String[] args) {
        // En un año se ubicaron 30 perritos
        // ¿Cuántos perritos ubiqué al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs); // 2.5

        // ESTIMACION

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs); // 2

        // EXACTITUD

        int a = 30;
        int b = 12;
        System.out.println((double) a/b); // 2.5

        System.out.println("==================");

        double c = a/b;
        System.out.println(c); // 2.0 ???

        double d = (double) a/b;
        System.out.println(d); // 2.5

        char n = '1';
        int nI = n;
        System.out.println(nI); // 49, equivale a 1 en la tabla ASCII

        short nS = (short) n;
        System.out.println(nS); // 49
    }
}