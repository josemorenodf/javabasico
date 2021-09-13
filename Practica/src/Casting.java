public class Casting {
    public static void main(String[] args) {

        // #1
        char c = 'z';
        int cI = (int) c;
        System.out.println(cI); // 122, estimación
        // #2
        int i = 250;
        long iL = (long) i;
        System.out.println(iL); // 250, exactitud
        short iS = (short) iL;
        System.out.println(iS); // 250, exactitud
        // #3
        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL); //301, estimación
        // #4
        int j = 100;
        double k = (float) j + 5000.66;
        System.out.println(k); // 5100.66, exactitud
        // #5
        int x = 737;
        int y = x * 100;
        System.out.println(y); // 73700, exactitud
        byte z = (byte) y;
        System.out.println(z); // -28, estimación
        // #6
        double a = 298.638;
        double a1 = a/25;
        System.out.println(a1); // 11.94, exactitud
        long a2 = (long) a1;
        System.out.println(a2); // 11, estimación
    }
}
