import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numero=new int[3];
        int auxiliar;

        for (int i =0;i<numero.length;i++){
            System.out.println("Dime un numero");
            numero[i]=input.nextInt();
        }

        for(int k=numero.length-1;k>=0;k--){
            System.out.println(numero[k]);
        }



        int[] values = new int[3];
        int value = input.nextInt();
        values[0] = value / 100;
        values[1] = (value % 100) / 10;
        values[2] = (value % 100) % 10;
        /*for (int i = 0; i<values.length; i++) {
            System.out.println("Introduzca un valor: ");
            values[i] = input.nextInt();
        }*/
        for (int i = values.length - 1; i>=0; i--) {
            //values[i] = values[i] + 1;
            System.out.print(values[i]);
        }
        //auxiliar=numero[2];
        //numero[2]=numero[0];
        //numero[0]=auxiliar;



    }
}
