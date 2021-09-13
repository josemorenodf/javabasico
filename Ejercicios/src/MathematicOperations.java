public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI); // imprime PI (constante)
        System.out.println(Math.E); // imprime Euler (constante)
        System.out.println(Math.ceil(x)); // redondea un entero hacia arriba
        System.out.println(Math.floor(x)); // redondea un entero hacia abajo
        System.out.println(Math.pow(x,y)); // devuelve un número elevado a otro número
        System.out.println(Math.max(x,y)); // devuelve el número mayor
        System.out.println(Math.sqrt(y)); // devuelve la raíz cuadrada de un número

        // Área de un círculo
        // PI * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Área de una esfera
        // 4*PI * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
