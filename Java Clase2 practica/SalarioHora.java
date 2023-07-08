public class SalarioHora {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese cantidad de horas diarias");
        line=System.console().readLine();
        int horas;
        horas=Integer.parseInt(line);
        System.out.print("Ingrese cantidad de dias laborales");
        line=System.console().readLine();
        int dias;
        dias=Integer.parseInt(line);
        int salario;
        salario=((horas * dias) * 4 ) * 250;
        System.out.println("El salario es de: " + salario);
        
        }

    
}
