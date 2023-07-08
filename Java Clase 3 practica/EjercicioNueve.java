public class EjercicioNueve {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese numero: ");
        line = System.console().readLine();
        int numero = Integer.parseInt(line);
        if (numero < 11000) {
            System.out.println("Tiene " + Integer.toString(numero).length() + " digitos");
        } else {
            System.out.println("Solo se admiten numeros de hasta 5 digitos");
        }

    
}
}