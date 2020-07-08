import java.util.Scanner;

public class ConversionDeSegundos {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dime que cantidad de segundos quieres convertir a horas:minutos:segundos");
        int segundosEntrada=input.nextInt();
        int horas,minutos,segundos;
        int v;

        horas=segundosEntrada/3600;
        v=segundosEntrada%3600;
        minutos=v/60;
        segundos=v%60;


        System.out.println(segundosEntrada+"segundos son= "+horas+":"+minutos+":"+segundos);



    }
}


