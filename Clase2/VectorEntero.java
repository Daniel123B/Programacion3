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

    public int getN() {
        return n;
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

    public boolean buscarElemento(int valor) {
        for (int i = 0; i < n; i++){
            if (v[i] == valor){
                return true;
            }
        }
        return false;

    }

    public VectorEntero buscarPosicionesVector(int valor){
        int contador = 0;

        for(int i = 0; i < n; i++){
            if (v[i] == valor) {
                contador ++;
            }
        }

        VectorEntero posicionesVector = new VectorEntero(contador);
        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] == valor) {
                posicionesVector.v[cont++] = i + 1;
            }
        }
        return posicionesVector;
    }

    public VectorEntero sumaExtremos() {
        int nuevoTamaño = (n + 1) / 2;
        VectorEntero resultado = new VectorEntero(nuevoTamaño);

        for (int i = 0; i < nuevoTamaño; i++) {
            if (i == n - 1 - i) {
                resultado.v[i] = v[i];
            } else {
                resultado.v[i] = v[i] + v[n - 1 - i];

            }
        }
        return resultado;

    }

    public int[] contarElementos(){
        int contPos = 0, contNeg = 0, contCeros = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] > 0) {
                contPos++;
            }
            else if (v[i] < 0) {
                contNeg++;
            }
            else contCeros++;
            
        }
        return new int[]{contPos,contNeg,contCeros};
    }

    public int[][] dividirVector(){
        int[] conteos = contarElementos();
        int contPos = conteos[0], contNeg = conteos[1], contCeros = conteos[2];

        int [] positivos = new int[contPos];
        int [] negativos = new int[contNeg];
        int [] ceros = new int[contCeros];

        int iPos = 0, iNeg = 0, iCeros = 0;

        for ( int i = 0; i < n; i++) {
            if (v[i]> 0) {
                positivos[iPos++] = v[i];
            }
            else if (v[i]<0) {
                negativos[iNeg++] =  v[i];
            }
            else ceros[iCeros++] = v[i];
        }
        return new int[][]{positivos,negativos,ceros};
    }

    public double calcularMedia(){
        if (n ==0) {
            return 0;
        }
        return sumaElementos()/ (double)n;
    }

    public int calcularMayorMedia(){
        double media = calcularMedia();
        int contador = 0;
        for(int i = 0; i < n; i++){
            if (v[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    public int calcularMenorMedia(){
        double media = calcularMedia();
        int contador = 0;
        for(int i = 0; i < n; i++){
            if (v[i] < media) {
                contador++;
            }
        }
        return contador;
    }

    public VectorEntero MayoresMedia(){
        int cantidad = calcularMayorMedia();
        VectorEntero mayores = new VectorEntero(cantidad);
        int contador = 0;
        for(int i = 0; i < n; i++){
            if (v[i] > calcularMedia()) {
                mayores.v[contador++] = v[i];
            }
        }
        return mayores;
    }

    public VectorEntero MenoresMedia(){
        int cantidad = calcularMenorMedia();
        VectorEntero mayores = new VectorEntero(cantidad);
        int contador = 0;
        for(int i = 0; i < n; i++){
            if (v[i] < calcularMedia()) {
                mayores.v[contador++] = v[i];
            }
        }
        return mayores;
    }

    public VectorEntero arregloMenor(){
        VectorEntero menorArreglo = new VectorEntero(n-1);
        for(int i = 0; i < n - 1; i++){
         menorArreglo.v[i] = v[i] - v[i+1];
        }
        return menorArreglo;
    }

    public void imprimirValorRepetido(int valor) {
        if (elementoRepetido(valor) > 0)
            System.out.println("El valor " + valor + " se repite " + elementoRepetido(valor) + " veces en el vector");
        else
            System.out.println("El valor " + valor + " no se encuentra en el vector.");

    }

    public void imprimirVertical() {
        System.out.println("\nIMPRESION VERTICAL");
        for (int i = 0; i < n; i++)
            System.out.println("v[" + i + "]= " + v[i]);
    }

    

    public void imprimirHorizontal() {
        for (int i = 0; i < n; i++)
            if ((i + 1) % 20 != 0)
                System.out.print(v[i] + " ");
            else
                System.out.println(v[i] + " ");
        System.out.println("");
    }
       
    

}