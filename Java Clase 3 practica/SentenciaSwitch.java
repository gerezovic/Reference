public class SentenciaSwitch{
    public static void main(String[] args){
        System.out.print("Ingrese número del mes: ");
        int mes = Integer.parseInt(System.console().readLine());
        String nombreDe1Mes;

        switch(mes){
            case 1:
                    nombreDe1Mes="Enero";
                    break;

            case 2: nombreDe1Mes="Febrero";
                    break;

            case 3: nombreDe1Mes="Marzo";
                    break;

            default:
                    nombreDe1Mes="Mes no existe";
        
        }
        System.out.println("Mes " + mes + ": " + nombreDe1Mes);
    }
    
} 