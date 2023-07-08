import java.util.Scanner;

public class Aarray06Banderas {
    public static void main(String[] args){
        String[] color = {"Rojo", "Amarillo", "Verde", "Blanco", "Azul", "Negro"};

        System.out.println("Generador aleatorio de banderas personalizadas");
        Scanner s = new Scanner(System.in);
        System.out.print("Cuantas franjas quieres que tenga tu bandera?: ");
        int franjas = Integer.parseInt(s.nextLine());
        System.out.println("----------------------");

        for(int i = 0; i < franjas; i++){
            System.out.print(color[(int)(Math.random()* 6)]);
            System.out.print("----------------------"); 
        }
    }
}

