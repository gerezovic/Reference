public class LeeNumero2{
    public static void main(String[] args){
        String linea;
        System.out.print("Ingrese número ");
        int primerNumero=Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese otro número ");
        linea=System.console().readLine();
        int segundoNumero;
        segundoNumero=Integer.parseInt(linea);
        int total;
        total=(2 * primerNumero) + segundoNumero;
        System.out.println("1° número " + primerNumero);
        System.out.println("2° número " + segundoNumero);
        System.out.println("el doble del 1° + el 2° es " + total);
    }
}