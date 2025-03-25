import java.util.Stack;
public class EjecutarPila {
    public static void main(String[] args) {

        //Creacion de la estructura Stack (pila)
    Stack<String> nombres = new Stack<>();
    System.out.println(nombres.empty()); //true

    //Insertar elementos en la pila
    nombres.push("Pedro");
    nombres.push("Juan");
    nombres.push("Maria");
    nombres.push("Camila");
    nombres.push("Daniel");

    //Imprimir la pila
    System.out.println(nombres); //[Pedro, Juan, Maria, Camila, Daniel]

    //Mostrar quien esta en el tope de la pila (sin removerlo) --> consultar
    System.out.println(nombres.peek()); //Daniel
    
    //Buscar un elemento de la pila 
    System.out.println(nombres.search("Camila")); //2

    //Retirar un elemento de la pila
    System.out.println(nombres.pop());

    //Imprimir la pila
    System.out.println(nombres); //[Pedro, Juan, Maria, Camila]

    }
}