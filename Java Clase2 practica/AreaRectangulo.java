public class AreaRectangulo {
    public static void main(String[] args){
        String line;
        System.out.print("Ingrese base");
        line=System.console().readLine();
        int base;
        base=Integer.parseInt(line);
        System.out.print("Ingrese altura");
        line=System.console().readLine();
        int altura;
        altura=Integer.parseInt(line);
        int area;
        area=base * altura;
        System.out.println("El area es de: " + area);

    }
    
}
