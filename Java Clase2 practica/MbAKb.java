public class MbAKb {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese cantidad de Mb");
        line=System.console().readLine();
        int mb;
        mb=Integer.parseInt(line);
        int kb;
        kb=mb * 1024;
        System.out.println("La cantidad en Kbs es de: " + kb);
        
        }
    
    
}
