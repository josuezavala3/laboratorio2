package lab2wilmer11511242;

import javax.swing.JOptionPane;

public class Lab2wilmer11511242 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al juego de batalla ejercito");
        char r = 's';
        while (r == 's' || r == 'S') {
           JOptionPane.showMessageDialog(null,"Ejercitos en batalla \n \n"
           +"1. Ejericito ruso \n"
                   + "2. Ejercito Aleman \n"
                   + "3. Ejercito de Alumnos De Programacion II");
           String opcion=JOptionPane.showInputDialog("Login \n \n"
                   + "a. Operaciones Con Soldados Rusos\n"
                   + "b. Operaciones con Soldados Alemanes\n"
                   + "c. Operaciones con Alumnos de programacion II\n"
                   + "d. Simulacion\n"
                   + "  Salis  del juego");
           
           
        }
    }

}
