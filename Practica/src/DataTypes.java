public class DataTypes {
    public static void main(String[] args) {
        // Poner L al final del número permite diferenciar un dato long de un dato int
        int n = 1234567890;
        long nL = 12345678901L;

        // Poner F al final del número permite diferenciar un dato float de un dato double
        double nD = 123.456;
        float nF = 123.456F;

        // declarar variables automáticamente con var

        var salary = 1000; // int
        // pension = 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary-pension; // double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(Math.round(totalSalary));

        var employeeName = "José Moreno";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
