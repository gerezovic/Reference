public class MenuConSwitch {
    public static void main(String[] args){
     System.out.println("CALCULO DE AREAS");
     System.out.println("-------------");
     System.out.println("1. Cuadrado");
     System.out.println("2. Rectangulo");
     System.out.println("3. Triangulo"); 
    
    int opcion = Integer.parseInt(System.console().readLine());

    double lado;
    double base;
    double altura;

    switch(opcion){ 
case 1:

    System.out.print("\nIntroduza la base del cuadrado");
    lado=Double.parseDouble(System.console().readLine());
    System.out.println("\nEl area del cuadrado es: " + (lado*lado) + "cm2");
    break;

case 2:
    
    System.out.print("\nIntroduza la base del rectangulo");
    base=Double.parseDouble(System.console().readLine());
    System.out.println("\nIntroduzca la altura del rectangulo");
    altura=Double.parseDouble(System.console().readLine());
    System.out.println("\nEl area del rectangulo es: " + (base*altura) + "cm2");
    break;

case 3:

    System.out.print("\nIntroduzca la base del triangulo: ");
    base=Double.parseDouble(System.console().readLine());
    System.out.println("\nIntroduzca la altura del triangulo: ");
    altura=Double.parseDouble(System.console().readLine());
    System.out.println("\nEl area del triangulo es: " + ((base*altura)/2));
    break;

default:
    System.out.println("\nOpcion incorrecta");
        } 
    } 
}





