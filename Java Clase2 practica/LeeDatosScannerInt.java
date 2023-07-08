    import java.util.Scanner;
    public class LeeDatosScannerInt {    
        public static void main(String[] args){
            Scanner s = new Scanner (System.in);
            System.out.print("Ingrese nombre y edad separados por un espacio ");
            String nombre = s.next();
            int edad = s.nextInt();
            System.out.println("tu nombre es " + nombre + " y tu edad " + edad);
        }  
}