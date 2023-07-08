public class EjerciciDos {
    public static void main (String [] args){
        System.out.println("Ingrese numero del dia de la semana");
        int dia = Integer.parseInt(System.console().readLine());
        String nombreDelDia;
        switch (dia) {
            case 1:
            nombreDelDia = "Lunes";
            break;
            case 2:
            nombreDelDia = "Martes";
            break;
            case 3:
            nombreDelDia = "Miercoles";
            break;
            case 4:
            nombreDelDia = "Jueves";
            break;
            case 5:
            nombreDelDia = "Viernes";
            break;
            case 6:
            nombreDelDia = "Sabado";
            break;
            case 7:
            nombreDelDia = "Domingo";
            break;
            default:
            nombreDelDia = "La semana tiene solo 7 dias";

        }
        System.out.println("El dia es " + nombreDelDia);
    }
    
}
