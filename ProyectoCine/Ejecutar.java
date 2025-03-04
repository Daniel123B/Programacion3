import javax.swing.JOptionPane;

public class Ejecutar {
    public static void main(String[]args){
        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                null,
                "Bienvenido al programa del cine \nPor favor seleccione una opcion:\n1. Opcion 1\n2. Opcion 2\n3. Opcion 3\n4. Salir",
                "Menu Principal",
                JOptionPane.QUESTION_MESSAGE
            );

            if (opcion == null){
                salir = true;
            } else{
                switch (opcion) {  
                case "1":
                JOptionPane.showMessageDialog(null, "Has seleccionado la Opcion 1");
                break;
                case "2":
                JOptionPane.showMessageDialog(null, "Has seleccionado la Opcion 2");
                break;
                case "3":
                JOptionPane.showMessageDialog(null, "Has seleccionado la Opcion 3");
                break;
                case "4":
                salir = true;
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida. Intente de nuevo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }      
        }
        JOptionPane.showMessageDialog(null,"Programa finalizado");
    }

    
}
