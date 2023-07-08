public class EjercicioTres {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese horas diarias");
        line = System.console().readLine();
        int horas = Integer.parseInt(line);
        System.out.print("Ingrese cantidad de dias trabajados");
        line = System.console().readLine();
        int dias = Integer.parseInt(line);
        int total;
        total = dias * horas;
        int salario;
        if (total <= 40) {
            salario = 250;
        } else {
            salario = 300;
        }
        System.out.println("El salario semanal es de " + total * salario);
    }

    
}
