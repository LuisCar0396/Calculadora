import java.util.Scanner;
public class MiniCalculadora {
  public static void main(String[] args) {
    //Se Crea el objeto de la clase Scanner para ingresar texto.
    Scanner input=new Scanner(System.in);
    // Imprimimos un menu para el Usuario
    System.out.println("   Escoga una opcion:");
    System.out.println("1- Suma De 2 Numeros.");
    System.out.println("2- Resta De 2 Numeros.");
    System.out.println("3- Multiplicacion De 2 Numeros.");
    System.out.println("4- Division De 2 Numeros.");
    System.out.println("5- Ver Bitacora.");
    System.out.println("6- Borrar Bitacora.");
    System.out.println("7- Salir.");
    System.out.print("     Respuesta: ");
    //se captura la opcion que eligio el usuario en una variable
    String op=input.nextLine();
    //creamos el vector para guardar los numeros
    //sera de 2 posiciones.
    float[] nums=new float[2];
    //creamos una variable para guardar el resultado de las operaciones
    float result=0;
    /*Se Crea una variable booleana para comprobar que las
    operaciones se realizaran bien, si llega a ser falsa
    le mandaremos una notificacion al usuario.
    */
    boolean error=true;
    //Se crea el switch para evaluar la operacion que el usuario escogio
    switch(op){
    case "1":
    op="Suma";
    //creamos un for para capturar los 2 numeros a operar
    System.out.println("");
    }
  }
}
