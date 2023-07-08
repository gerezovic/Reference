import java.util.Arrays;

public class EjercicioSiete {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese numero: ");
        line = System.console().readLine();
        int numero = Integer.parseInt(line);
        System.out.print("Ingrese numero 2: ");
        line = System.console().readLine();
        int numero2 = Integer.parseInt(line);
        System.out.print("Ingrese numero 3: ");
        line = System.console().readLine();
        int numero3 = Integer.parseInt(line);
        int [] a = {numero,numero2,numero3};
        Arrays.sort(a);


    System.out.println(Arrays.toString(a));
}
}
