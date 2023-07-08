public class SaludoXHoras {
    public static void main (String[] args) {
        System.out.print ("Ingrese hora");
        String respuesta = System.console().readLine();
        int x= Integer.parseInt(respuesta);
        if (x >= 6 && x < 13) {
            System.out.println("Buenos dias");            
        }
        else if (x >= 13 && x < 21) {
            System.out.println("Buenas tardes");
        
        } else {
            System.out.println("Buenas noches");
        
        }
    
    }
    
}