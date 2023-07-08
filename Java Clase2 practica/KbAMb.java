public class KbAMb {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese cantidad de Kb");
        line=System.console().readLine();
        int kb;
        kb=Integer.parseInt(line);
        int mb;
        mb=kb / 1024;
        System.out.println("La cantidad en Mbs es de: " + mb);
        
        }
    
}
