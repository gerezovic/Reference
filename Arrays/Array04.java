public class Array04 {
    public static void main(String[] args){
        char[] caracter = new char[0];

        caracter[0] = 'R';
        caracter[1] = '%'; 
        caracter[2] = '&'; 
        caracter[3] = '+'; 
        caracter[4] = 'A'; 
        caracter[5] = 'Z';
        
        System.out.println("El array caracter tiene los siguientes elementos: ");
        for(int i = 0; i < 6; i++){
            System.out.println(caracter[i]);
        }
    }
}





