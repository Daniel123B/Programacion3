public class EjecutarEjercicio15 {
    public static void main(String[] args) {
        //Crear el objeto para acceder a la clase MetodosArreglos
        MetodosArreglos obj = new MetodosArreglos();

        String[] nombres = {"Alan","Devora","Jose","Daniel","Sandra"};
        int[] sueldos = {100,200,300,400,300};

        System.out.println(obj.nombresSueldos(nombres, sueldos));


    }
    
}
