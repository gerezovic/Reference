public class ArrayMatrix01 {
    public static void main(String[] args)
        throws InterruptedException{ //Se añade esta línea para poder usar Sleep
            int[][] n = new int[3][2]; //Se crea el array de 3 filas x 3 columnas


            n[0][0] = 20;
            n[0][1] = 67;
            n[1][1] = 33;
            n[2][1] = 7;
            
            int fila, columna;

            for(fila = 0; fila < 3; fila++){
                System.out.println("\nFila: " + fila);

                for(columna = 0; columna < 2; columna++){
                    System.out.printf("%10d ", n[fila][columna]);
                    Thread.sleep(1000);
                }
            }
        }
    }

