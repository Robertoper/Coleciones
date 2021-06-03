import java.util.Random;
import java.util.Scanner;

public class controladorMonedero {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Random  creadorContraseña=new Random();

        System.out.println("BIENVENIDO, QUE QUIERE HACER");
        System.out.println("1. Añadir usuario");
        System.out.println("2. Mostrar usuarios");
        System.out.println("3. Mostrar todos los datos");
        System.out.println("4. Borrar todo");
        System.out.println("5 Salir");
        int entrada =teclado.nextInt();


        if (entrada==1){
            hashmap persona=new hashmap();
            System.out.println("AÑADA SU NUEVO IDENTIFICADOR:");
            teclado.nextLine();
            persona.setIdentificador(teclado.nextLine());
            for (int i=0;i<=10;i++){
                persona.setContraseña(creadorContraseña.nextInt());
            }
            System.out.println(persona.getIdentificador()+" esta es tu nueva contraseña "+ persona.getContraseña());
            persona.setPersonas(persona.getPersonas(), persona.getIdentificador(), persona.getContraseña());

        }else if (entrada==2){

        }else if (entrada==3){

        }else if (entrada==4){

        }
    }
}
