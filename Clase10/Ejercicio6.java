package Clase10;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Ejercicio6 {
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
            iniciales.append(pilaNom.get(i).charAt(0));
        }

        char[] letras = iniciales.toString().toCharArray();

        Arrays.sort(letras);

        System.out.println("Iniciales ordenadas de manera alfabetica: ");
        for(char c : letras){
            System.out.print(c);
        }
        System.out.println();   

  }
}
