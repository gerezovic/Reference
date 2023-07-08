import java.util.Scanner;
public class LeeDatosScannerMedia{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.print("Ingrese 3 números separados por un espacio ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();
        double media = (x1+x2+x3)/3;
        System.out.println("la media de los 3 es " + media);
    } 
}
