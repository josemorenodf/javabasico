public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        int days[] = new int[7];

        String [][] cities = new String[4][2]; // 4*2 (dimensión de 8 elementos)

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("Android Versions:");
        System.out.println();
                                             // 17
        /*
        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] == null){
                continue;
            } else {
                System.out.println(androidVersions[i]);
            }
        }
         */

        // Bucle foreach
        for (String androidVersion : androidVersions) {
            if (androidVersion == null){
                continue;
            } else {
                System.out.println(androidVersion);
            }
        }

        /*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        */

        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        System.out.println("Lista de países y ciudades:");
        System.out.println();

        /*
        System.out.println((cities[0][0]));
        System.out.println((cities[0][1]));
        System.out.println((cities[1][0]));
        System.out.println((cities[1][1]));
        System.out.println((cities[2][0]));
        System.out.println((cities[2][1]));
        System.out.println((cities[3][0]));
        System.out.println((cities[3][1]));
        */

        /* for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
         */

        // Bucle foreach
        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        System.out.println();

        String[][][][] animals = new String [2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println("Array de 4 dimensiones, localizando un elemento:");
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        if (animals[i][j][k][l] == null){
                            continue;
                        } else {
                            System.out.println(animals[i][j][k][l]);
                        }

                    }
                }
            }
        }
    }
}