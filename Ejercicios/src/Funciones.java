public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        /* Área de un círculo
        PI * r2 */
        circleArea(y);

        // Área de una esfera
        // 4*PI * r2
        sphereArea(y);

        // Volumen de una esfera
        // (4/3) * PI * r3
        sphereVolumen(y);

        System.out.println("PESOS MEXICANOS A DOLARES: " + convertToDollar(200,"MXN"));
        System.out.println("PESOS COLOMBIANOS A DOLARES: " + convertToDollar(1000,"COP"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dólares
     * */
    public static double convertToDollar (double quantity, String currency){
        // MXN & COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
