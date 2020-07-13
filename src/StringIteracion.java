import java.util.Scanner;

public class StringIteracion {
    public static void main(String[] args) {

        String [] name=new String[]{"hola","mundo","desde","java"};

        System.out.println("Que palabra quieres buscar");
        Scanner input = new Scanner(System.in);
        String palabraBusqueda=input.nextLine();


        for(int i =0; i < name.length;i++) { //Imprime el array de la posicion 0 a la ultima
            System.out.print(name[i]+" ");
            System.out.print(name[i]+" ");
        }

        System.out.println();

        boolean palabraEncontrada=false;
        int indiceEncontrado=0;

        for (int i = 0; i <name.length ; i++) { //Recorre el string
            if(name[i].equalsIgnoreCase(palabraBusqueda)){ //Si la palabra en la busqueda es igual al valor del array en la posicion i
                palabraEncontrada=true; //
                indiceEncontrado=i;
                break;
            }
        }

        if(palabraEncontrada){
            System.out.print("La palabra \"" +palabraBusqueda+"\" está en la posicion " +indiceEncontrado);
        }else{
            System.out.println("La palabra "+palabraBusqueda+" no ha aparecido en la busqueda");
        }

    }
}
