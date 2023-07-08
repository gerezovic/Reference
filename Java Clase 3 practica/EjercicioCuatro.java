public class EjercicioCuatro {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese nota 1: ");
        line = System.console().readLine();
        int nota = Integer.parseInt(line);
        System.out.print("Ingrese nota 2: ");
        line = System.console().readLine();
        int nota2 = Integer.parseInt(line);
        System.out.print("Ingrese nota 3: ");
        line = System.console().readLine();
        int nota3 = Integer.parseInt(line);
        int promedio;
        promedio = (nota + nota2 + nota3) / 3;
        if (promedio == 5) {
            System.out.println("Insuficiente");

        } else if (promedio == 6) {
            System.out.println("Suficiente");

        } else if (promedio == 7) {
            System.out.println("Bien");

        } else if (promedio == 8) {
            System.out.println("Notable");

        } else if (promedio >= 9 && 9 < 11) {
            System.out.println("Sobresaliente");

        } else {
            System.out.println("El promedio maximo es de 10");
        }
            
        }

}
