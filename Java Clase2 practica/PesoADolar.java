public class PesoADolar {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese monto en pesos");
        line=System.console().readLine();
        int pesos;
        pesos=Integer.parseInt(line);
        int convert;
        convert=pesos / 206;
        System.out.println("El valor en dolares es: " + convert);

    }

    
}
