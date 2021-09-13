public class UpdatingVariable {
    public static void main(String[] args) {

        int salary = 1000;

        System.out.println(salary);

        // bono de $200
        int bono = 200;
        salary += bono;
        System.out.println(salary);

        // descuento de $50 (pensión)
        int descuento = -50;
        salary += descuento;
        System.out.println(salary);

        // 2 horas extra = $30 c/u
        // cupón comida = $45

        salary = salary + (30*2)-45;
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employeeName = "Alejandro Moreno";
        employeeName = employeeName + " De Freitas";
        System.out.println(employeeName);

        employeeName = "José " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
