package Clase2;

public class VectorDoble {
    private String[] s;
    private double[] d;
    private int n;

    public VectorDoble() {
        n = 0;
        s = null;
        d = null;
    }

    public VectorDoble(int nx){
        if (nx > 0) {
            n = nx;
            s = new String[n];
            d = new double[n];
        } else {
            n = 0;
            s = null;
            d = null;
        }
    }

    public void set(int nx){
        if (nx > 0) {
            n = nx;
            s = new String[n];
            d = new double[n];
        } else {
            n = 0;
            s = null;
            d = null;
        }
    }

    public int getN() {
            return n;
    }

    public String getS(int caracter){
        return s[caracter];
    }

    public double getD(int valor){
        return d[valor];
    }
    
    public void llenadoAutomaticoTrabajadores(double min, double max) {
        for (int i = 0; i < n; i++) {
            s[i] = "Trabajador" + (i+1);
            d[i] = Math.random() * (max - min) + min;
        }
    }

    public void imprimirDatosTrabajadores() {
        System.out.println("Datos de los trabajadores:");
        for (int i = 0; i < n; i++){
            System.out.println(s[i]+"- sueldo: "+ d[i]);
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += d[i];
        }
        
        return (n > 0) ? suma / n : 0;
  
    }

    public int contarSueldoPromedio(){
        double promedio = calcularPromedio();
        int contador = 0;
        for (int i = 0; i < n; i++){
            if (d[i] == promedio) {
                contador++;
            }
        }
        return contador;
    }

    //Metodo para crear un nuevo vector con los trabajadores que tengan el mismo promedio

    public VectorDoble obtenerTrabajadoresPromedio(){
        double promedio = calcularPromedio();
        int cantidad = contarSueldoPromedio();
        VectorDoble vectorTrabajadores = new VectorDoble(cantidad);
        int indice = 0;
        for (int i = 0; i < n; i++){
            if (d[i] == promedio) {
                vectorTrabajadores.s[indice] = s[i];
                vectorTrabajadores.d[indice] = d[i];
                indice++;
            }
        }
        return vectorTrabajadores;
    }
 




}