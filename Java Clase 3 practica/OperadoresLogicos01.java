public class OperadoresLogicos01 {
    public static void main(String[] args){

        System.out.println("Adivina el número");
        System.out.print("Introduce un numero entre 1 y 100: ");
        String linea = System.console().readLine();
        int n = Integer.parseInt(linea);

        if((n>1)&&(n<100)){
            System.out.println("El número está entre 1 y 100 ");
            System.out.print("Segundo intento, introduce otro número: ");
            linea = System.console().readLine();
            n = Integer.parseInt(linea);
        
        if(n==25){
            System.out.println("El numero es el correcto");
        }else{
            System.out.println("El numero digitado es incorrecto");
        }
        }
    }
}


/*
Operadores lógicos

Operador| Nombre| Ejemplo
  &&    |   Y   | (7>2)&&(2<9)     | Las dos condiciones son verdaderas
  ||    |   O   | (7>2)||(2<4)     | Almenos una de las condiciones es verdadero
  !     |   no  | !(7>2)           | La condición es falsa

 A B | B&&B | A||B | !A | !B
 V V |   V  |   V  | F  |  F
 V F |   F  |   V  | F  |  V
 F V |   F  |   V  | V  |  F
 F F |   F  |   F  | V  |  V
*/