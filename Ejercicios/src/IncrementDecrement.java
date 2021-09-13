public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives -1;
        System.out.println(lives); // 4

        lives--; // operador decremento
        System.out.println(lives); // 3

        lives++; // operador incremento
        System.out.println(lives); // 4

        // Incremento postfijo y prefijo:
        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; // postfijo
        System.out.println("Con postfijo: " + gift); // 104 puntos, deberían ser 105
        System.out.println("Lives= " + lives); // 5
        gift = 100 + ++lives; // postfijo
        System.out.println("Con prefijo: " + gift); // 106 puntos
        System.out.println("Lives= " + lives); // 6
    }
}