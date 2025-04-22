package Clase10;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio7 {
    public static void main(String[] args) {
        Stack<String> pilaNom = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de nombres en la pila: ");
        int n = sc.nextInt();

        for(int i = 0; i < n;i++){
            System.out.println("Digite el nombre " + (i+1)+":");
            String nombre = sc.next();
            pilaNom.push(nombre);
        }

        StringBuilder iniciales = new StringBuilder();

        for(int i = pilaNom.size()-1; i >= 0; i--){
            String nombre = pilaNom.get(i);
            if (nombre.length() <= 4) {
                iniciales.append(nombre).append(" ");
            }
        }
        System.out.println(iniciales);

        
    }
}
