public class EjercicioOcho {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese numero: ");
        line = System.console().readLine();
        int numero = Integer.parseInt(line);
        int division;
        division = numero % 5;
        if (division == 0) {

        System.out.println("Es multiplo de " + 5);
        } else {
            
        System.out.println("No es multiplo de " + 5);

    }
}

}
        