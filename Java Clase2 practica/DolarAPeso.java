public class DolarAPeso {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese valor en dolares");
        line=System.console().readLine();
        int dolares;
        dolares=Integer.parseInt(line);
        int converti;
        converti=206 * dolares;
        System.out.println("El valor en pesos es de: " + converti);

    }
    
}
