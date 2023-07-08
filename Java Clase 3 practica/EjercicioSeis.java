public class EjercicioSeis {
    public static void main (String[] args) {
        String line;
        System.out.print("Ingrese mes; ");
        line = System.console().readLine();
        int mes = Integer.parseInt(line);
        System.out.print("Ingrese dia; ");
        line = System.console().readLine();
        int dia = Integer.parseInt(line);

        if (mes == 1 && dia <= 20) {
            System.out.println("Capricornio");

        } else if (mes == 2 && dia <= 21) {
            System.out.println("Acuario");

        } else if (mes == 3 && dia <= 20) {
            System.out.println("Piscis");

        } else if (mes == 4 && dia <= 20) {
            System.out.println("Aries");

        } else if (mes == 5 && dia <= 20) {
            System.out.println("Tauro");

        } else if (mes == 6 && dia <= 21) {
            System.out.println("Geminis");

        } else if (mes == 7 && dia <= 21) {
            System.out.println("Cancer");

            } else if (mes == 8 && dia <= 23) {
                System.out.println("Leo");

            } else if (mes == 9 && dia <= 22) {
                System.out.println("Virgo");

            } else if (mes == 10 && dia <= 22) {
                System.out.println("Libra");

            } else if (mes == 11 && dia <= 22) {
                System.out.println("Escorpio");

            } else if (mes == 12 && dia <= 21) {
                System.out.println("Sagitario");
 
            } else if (mes == 1 && dia >= 21) {
                System.out.println("Acuario");
    
            } else if (mes == 2 && dia >= 19) {
                System.out.println("Piscis");
    
            } else if (mes == 3 && dia >= 21) {
                System.out.println("Aries");
    
            } else if (mes == 4 && dia >= 21) {
                System.out.println("Tauro");
    
            } else if (mes == 5 && dia >= 21) {
                System.out.println("Geminis");
    
            } else if (mes == 6 && dia >= 22) {
                System.out.println("Cancer");
    
                } else if (mes == 7 && dia >= 22) {
                    System.out.println("Leo");
    
                } else if (mes == 8 && dia >= 24) {
                    System.out.println("Virgo");
    
                } else if (mes == 9 && dia >= 24) {
                    System.out.println("Libra");
    
                } else if (mes == 10 && dia >= 23) {
                    System.out.println("Escorpio");
    
                } else if (mes == 11 && dia >= 23) {
                    System.out.println("Sagitario");
    
                } else if (mes == 12 && dia >= 21) {
                    System.out.println("Sagitario");

                } else {
                    System.out.println("Intentelo de nuevo");
                }
        }
    
}

