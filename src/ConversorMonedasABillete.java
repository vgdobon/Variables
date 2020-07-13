import java.util.Scanner;

public class ConversorMonedasABillete {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dime una cantidad de euros para convertirlo a billetes");
        int euros=input.nextInt();
        int billete50,billete20,billete10,billete5,monedas1;
        int v;

        billete50=euros/50;
        v=euros%50;
        billete20=v/20;
        v=euros%20;
        billete10=v/10;
        v=v%10;
        billete5=v/5;
        v=v%5;
        monedas1=v;

        System.out.println(euros+" son: "+billete50+" billetes de 50€,"+billete20+" billetes de 20€,"+billete10+" billetes de 10€,"+billete5+" billetes de 5€,"+
                monedas1+" monedas de 1€");



    }
}
