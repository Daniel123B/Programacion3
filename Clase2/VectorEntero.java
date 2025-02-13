package Clase2;

public class VectorEntero {
    private int[] v;
    private int n;

    public VectorEntero() {
        n = 0;
        v = null;
    }

    public VectorEntero(int nx) {
        if (nx > 0) {
            n = nx;
            v = new int[n];
        } else {
            n = 0;
            v = null;
        }
    }

    public void set(int nx) {
        if (nx > 0) {
            n = nx;
            v = new int[n];
        } else {
            n = 0;
            v = null;
        }
    }

    public int getVector(int nx) {
        return v[nx];
    }

    private int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public void llenadoAutomatico(int min, int max) {
        for (int i = 0; i < n; i++)
            v[i] = aleatorio(min, max);
    }

    public int sumaElementos() {
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += v[i];
        }

        return suma;
    }

    public int sumaPar() {
        int suma = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 == 0)
                suma += v[i];
        return suma;
    }

    public int sumaImpar() {
        int suma = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 != 0)
                suma += v[i];
        return suma;
    }

    public int edadMayor(VectorEntero SegundoVector){
        int mayor = v[0];
        for(int i = 1; i < n; i++){
            if(v[i]> mayor){
                mayor = v[i];
            }
        }
        
        for (int i = 0; i < SegundoVector.n; i++) {
            if (SegundoVector.v[i] > mayor) {
                mayor = SegundoVector.v[i];
            }    
        }
        return mayor;
    }

    public int elementoPar(){
       int contador = 0; 
       for (int i = 0; i < n; i++)
       if (v[i] % 2 == 0){
           contador ++;
        }
        return contador;
    }

    public int elementoImpar(){
        int contador = 0; 
        for (int i = 0; i < n; i++)
        if (v[i] % 2 != 0){
            contador ++;
         }
         return contador;
     }

    public int[] obtenerPares(){
        int[] pares = new int[elementoPar()];
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 == 0){
                pares[contador++] = v[i];
            }
        return pares;
    }

    public int[] obtenerImpares(){
        int[] impares = new int[elementoImpar()];
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 != 0){
                impares[contador++] = v[i];
            }
        return impares;
    }

    public void imprimirVertical() {
        System.out.println("\nIMPRESION VERTICAL");
        for (int i = 0; i < n; i++)
            System.out.println("v[" + i + "]= " + v[i]);
    }

}