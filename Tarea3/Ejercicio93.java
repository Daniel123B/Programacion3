package Tarea3;
import java.util.Stack;

public class Ejercicio93 {

    // Yo defino esta función para saber qué operador tiene más prioridad
    // porque necesito compararlos cuando los encuentro en la expresión
    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;  // Estos tienen baja prioridad
            case '*':
            case '/':
                return 2;  // Estos tienen más prioridad que + y -
            case '^':
                return 3;  // La exponenciación tiene la mayor prioridad
        }
        return -1;  // Si no es un operador conocido, devuelvo -1
    }

    // Esta es la función principal donde la conversión
    public static String infijoAPostfijo(String expresion) {
        StringBuilder resultado = new StringBuilder(); // Uso un StringBuilder porque es más eficiente para concatenar strings
        Stack<Character> pila = new Stack<>();  // Creo una pila para guardar operadores y paréntesis temporalmente

        // Recorro cada carácter de la expresión uno por uno
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            // Primero verifico si es una letra (operando)
            if (Character.isLetterOrDigit(c)) {
                // Si es un operando, lo agrego directamente al resultado
                resultado.append(c);
            }
            // Si encuentro un paréntesis de apertura
            else if (c == '(') {
                // Lo meto a la pila para recordar que debo encontrar su cierre
                pila.push(c);
            }
            // Si encuentro un paréntesis de cierre
            else if (c == ')') {
                // Saco todo de la pila hasta encontrar el '(' correspondiente
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                }
                // Elimino el '(' de la pila (pero no lo agrego al resultado)
                pila.pop();
            }
            // Si es un operador (+, -, *, /, etc.)
            else {
                // Mientras haya operadores en la pila con mayor o igual precedencia
                while (!pila.isEmpty() && precedencia(c) <= precedencia(pila.peek())) {
                    // Los saco y los agrego al resultado
                    resultado.append(pila.pop());
                }
                // Finalmente meto el operador actual a la pila
                pila.push(c);
            }
        }

        // Después de procesar toda la expresión, saco los operadores que quedaron en la pila
        while (!pila.isEmpty()) {
            if (pila.peek() == '(') {
                // Si queda un '(', significa que la expresión está mal formada
                return "Expresión inválida";
            }
            resultado.append(pila.pop());
        }

        // Devuelvo la expresión en notación postfija
        return resultado.toString();
    }

    public static void main(String[] args) {
        // Esta es la expresión a convertir
        String expresionInfija = "(x-y)/(z+w)-(z+y)*x";
        // Le quito espacios 
        expresionInfija = expresionInfija.replaceAll("\\s+", "");
        
        System.out.println("Expresión infija: " + expresionInfija);
        // Llamo a mi función de conversión
        String expresionPostfija = infijoAPostfijo(expresionInfija);
        System.out.println("Expresión postfija: " + expresionPostfija);
    }
}