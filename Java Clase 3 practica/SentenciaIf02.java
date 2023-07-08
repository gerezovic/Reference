public class SentenciaIf02 {
    public static void main(String[] args){
        System.out.print("Ingrese un numero entero");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);
        if(x<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
    }
}

/*
Operadores de comparación

Operador  | Nombres |            Ejemplo
==        |  Igual               |  a==a
!=        |  Distinto            |  a!=b
<         |  Menor que           |  a<b
>         |  Mayor que           |  a>b
<=        |  Menor o igual que   |  a<=b
>=        |  Mayor o igual que   |  a>=b

*/