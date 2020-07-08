import java.util.Scanner;

public class ParesContiguos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número");
        int num=sc.nextInt();
        int parSuperior,parInferior;

        if(num%2==0){
            parInferior=num-2;
            parSuperior=num+2;
        }else{
            parInferior=num-1;
            parSuperior=num+1;
        }

        System.out.println("Los numeros pares contiguos de "+num+" son el "+parInferior+" y el "+parSuperior);
    }
}
