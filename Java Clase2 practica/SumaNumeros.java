public class SumaNumeros {
    public static void main(String[] args){
        String lines;
        System.out.print("Ingrese numero");
        lines= System.console().readLine();
        int primerNumero;
        primerNumero=Integer.parseInt(lines);
        System.out.print("Ingrese otro numero");
        lines=System.console().readLine();
        int segundoNumero;
        segundoNumero=Integer.parseInt(lines);
        int multi;
        multi=primerNumero * segundoNumero;
        int suma;
        suma=primerNumero + segundoNumero;
        int divi;
        divi=primerNumero / segundoNumero;
        System.out.println("Primer numero " + primerNumero);
        System.out.println("Segundo numero " + segundoNumero);
        System.out.println("La multiplicacion es igual a: " + multi);
        System.out.println("La suma es igual a: " + suma);
        System.out.println("La division es igual a: " + divi);

    }
    
}
