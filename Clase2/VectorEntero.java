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
            if (v[i] % 2 == 0) {
                suma += v[i];
            }
        return suma;
    }

    public int sumaImpar() {
        int suma = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 != 0) {
                suma += v[i];
            }
        return suma;
    }

    public int edadMayor(VectorEntero SegundoVector) {
        int mayor = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > mayor) {
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

    public int elementoPar() {
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 == 0) {
                contador++;
            }
        return contador;
    }

    public int elementoImpar() {
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 != 0) {
                contador++;
            }
        return contador;
    }

    public int[] obtenerPares() {
        int[] pares = new int[elementoPar()];
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 == 0) {
                pares[contador++] = v[i];
            }
        return pares;
    }

    public int[] obtenerImpares() {
        int[] impares = new int[elementoImpar()];
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] % 2 != 0) {
                impares[contador++] = v[i];
            }
        return impares;
    }

    public int nMayor() {
        int numayor = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > numayor) {
                numayor = v[i];
            }
        }
        return numayor;
    }

    public int nMenor() {
        int numenor = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] < numenor) {
                numenor = v[i];
            }
        }
        return numenor;
    }

    public int elementoRepetidoMayor(int numayor) {
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] == numayor)
                contador++;
        return contador;
    }

    public int elementoRepetidoMenor(int numenor) {
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] == numenor)
                contador++;
        return contador;
    }

    public int elementoRepetido(int valor) {
        int contador = 0;
        for (int i = 0; i < n; i++)
            if (v[i] == valor)
                contador++;
        return contador;
    }

    private boolean buscarElemento(int valor) {
        for (int i = 0; i < n; i++)
            if (v[i] == valor)
                return true;
        return false;

    }

    public void imprimirValorRepetido(int valor){
        if(elementoRepetido(valor)> 0)
        System.out.println("El valor "+valor+" se repite "+elementoRepetido(valor)+" veces en el vector");

    }

    public void imprimirVertical() {
        System.out.println("\nIMPRESION VERTICAL");
        for (int i = 0; i < n; i++)
            System.out.println("v[" + i + "]= " + v[i]);
    }

    public void imprimirHorizontal()
    {
             for(int i=0; i<n; i++)
            if( (i + 1) % 20 != 0 )
                System.out.print(v[i] + " ");
            else
                System.out.println(v[i] + " ");
        System.out.println("");
    }         

}