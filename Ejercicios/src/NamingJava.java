             // Upper Camel Case
public class NamingJava {
    public static void main(String[] args) {

        // celphone es diferente a cellPhone, Java es sensible a mayúsculas y minúsculas
        int cellphone = 33377777;
        int cellPhone = 555533333;
        System.out.println(cellphone);
        System.out.println(cellPhone);

        // Java permite inicializar variables con símbolos de $ y _
        String $countryName = "Spain";
        String _backgroundColor = "Green";
        String currency$ = "MXN";
        String background_color = "BLUE";

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        // Lower Camel Case
        String fullName = "José Alejandro Moreno De Freitas";
        int sizeInCentimeters = 26;
    }
}
