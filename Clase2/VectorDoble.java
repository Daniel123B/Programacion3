package Clase2;

public class VectorDoble {
    public String[] s;
    public double[] d;
    public double[] d2;
    public double[] tg;
    private int n;

    public VectorDoble() {
        n = 0;
        s = null;
        d = null;
        d2 = null;
        tg = null;
    }

    public VectorDoble(int nx){
        if (nx > 0) {
            n = nx;
            s = new String[n];
            d = new double[n];
            d2 = new double[n];
            tg = new double[n];

        } else {
            n = 0;
            s = null;
            d = null;
            d2 = null;
            tg = null;
        }
    }

    public void set(int nx){
        if (nx > 0) {
            n = nx;
            s = new String[n];
            d = new double[n];
            d2 = new double[n];
            tg = new double[n];
        } else {
            n = 0;
            s = null;
            d = null;
            d2 = null;
            tg = null;
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
   
    // Metodo para realizar ejercicio 5

    public void calcularTotalGastado(){
        for (int i = 0; i < n; i++){
            tg[i] = d[i] * d2[i];
        }
    }

    public double calcularTotalGeneral(){
        double total = 0;
        for (int i = 0; i < n; i++){
            total += tg[i];
        }
        return total;
    }

    public String productoMayorGasto(){
        int contador = 0;
        for (int i = 0; i < n; i++){
            if (tg[i] > tg[contador]) {
                contador = i;
            }
        }
        return "Descripcion: " + s[contador] + ", total gastado: "+ tg[contador];

    }

    public void imprimirTotalGastado(){
        System.out.println("Total gastado por producto: ");
        for (int i = 0; i < n; i++){
            System.out.println("Producto: "+ s[i]+ "- Total gastado: "+tg[i]);
        }
    }
 




}