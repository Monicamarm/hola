import java.util.ArrayList;
import java.util.Scanner;
public class array_list_menu {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int menuOption;
          boolean salir = false;
          ArrayList<Integer> a= new ArrayList<Integer>();


          do {
               System.out.println("                MENU");
               System.out.println("    1. Rellenar un arraylist de tipo Integer positivos(Hasta introducir -1)");
               System.out.println("    2. Mostrar el array y su tamanio");
               System.out.println("    3. Mostrar la suma y la media");
               System.out.println("    4. Salir");
               System.out.println("Introduce un numero del menu");
               menuOption = sc.nextInt();
               switch(menuOption){
                    case 1:
                         rellenar_aray(a);
                    break;
                    case 2:
                    if(a.size() == 0){
                         System.out.println("el array no esta relleno, ve al paso 1 para rellenarlo");
                    }
                    else
                         Mostrar_aray(a);
                    break;
                    case 3:
                    if(a.size() == 0){
                         System.out.println("el array no esta relleno, ve al paso 1 para rellenarlo");
                    }
                    else
                         Operaciones(a);
                    break;
                    case 4:
                    salir=true;
                    break;
                    default:
                    System.out.println("Ese numero no corresponde al menu. Introduzca un numero del 1 al 4");
                    break;
               }
          }while(!salir);

     }
     public static void rellenar_aray(ArrayList<Integer> a) {
          Scanner sc = new Scanner(System.in);
          int num;
          System.out.println("Rellena el arraylist con numeros enteros Hasta introducir -1");
          
          do{
               System.out.println("Ingrese un numero");
               num = sc.nextInt();
               if (num >-1) {
                    a.add(num);
               } 
               if(num < -1){
                    System.out.println("El numero no es valido");
               }
          }while(num !=-1);
     }         
     
     public static void Mostrar_aray(ArrayList<Integer> a) {
          System.out.println("El contenido de la lista es: " + a.toString());
          System.out.println("y su longitud es: " + a.size());
     }

     public static void Operaciones(ArrayList<Integer> a) {
          int suma=0;
          for (int n : a) {
               suma+=n;
          }
          System.out.println("La suma es: " + suma);
          System.out.println("La media es: " + (suma/(float)a.size()));
     }
     
}
