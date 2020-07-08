import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero=input.nextInt();

        int valorAbsoluto;

        if(numero<0){
            valorAbsoluto=numero*-1;

        }else{
            valorAbsoluto=numero;
        }

        System.out.println("El valor absoluto de "+numero+" es: "+valorAbsoluto);
    }
}
