public class SentenciaIf01 {
    public static void main(String[] args){
        System.out.print("¿Cual es la capital de Rusia");
        String respuesta = System.console().readLine();
        if(respuesta.equals("Moscú")){
            System.out.println(("Correcto"));
        }else{
            System.out.println("Incorrecto");
        }
    }
}
