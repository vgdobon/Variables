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

        //auxiliar=numero[2];
        //numero[2]=numero[0];
        //numero[0]=auxiliar;



    }
}
