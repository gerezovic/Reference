import java.util.Scanner;
public class LeeDatosScanner {
            public static void main(String[] args){
                Scanner s = new Scanner (System.in);
                System.out.print("Ingrese nombre ");
                String nombre = s.nextLine();
                System.out.print("Ingrese edad ");
                int edad =Integer.parseInt(s.nextLine());
                System.out.println(("Tu nombre es " + nombre + " y tu edad " + edad));
            } 
}
