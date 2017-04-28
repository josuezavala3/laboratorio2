package lab2wilmer11511242;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2wilmer11511242 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al juego de batalla ejercito");
        char r = 's';
        ArrayList<SoldadosRusos> soldadorus = new ArrayList();
        ArrayList<EjercitoAleman> alemanes = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();
        JOptionPane.showMessageDialog(null, "Ejercitos en batalla \n \n"
                + "1. Ejericito ruso \n"
                + "2. Ejercito Aleman \n"
                + "3. Ejercito de Alumnos De Programacion II");
        while (r == 's' || r == 'S') {

            String opcion = JOptionPane.showInputDialog("Login \n \n"
                    + "a. Operaciones Con Soldados Rusos\n"
                    + "b. Operaciones con Soldados Alemanes\n"
                    + "c. Operaciones con Alumnos de programacion II\n"
                    + "d. Simulacion\n"
                    + "e. Salir  del juego");
            if (opcion.equalsIgnoreCase("a")) {
                boolean entrar = true;
                while (entrar) {
                    String opcionruso = JOptionPane.showInputDialog("operaciones  con Rusos\n \n"
                            + "a. Agregar\n"
                            + "b. Modificar\n"
                            + "c. Eliminar\n"
                            + "d. Volver al menu");
                    if (opcionruso.equalsIgnoreCase("a")) {
                        String nombreruso = JOptionPane.showInputDialog("Nombre de Soldado?");
                        int id = Integer.parseInt(JOptionPane.showInputDialog("ID de Soldado?"));
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad de Soldado?"));
                        while (edad < 18) {
                            edad = Integer.parseInt(JOptionPane.showInputDialog(" ERROR EDADA MAYOR QUE 18 ingrese Edad de Soldado Correcta?"));
                        }
                        int Rango = Integer.parseInt(JOptionPane.showInputDialog("Rango de Soldado?"));
                        String Tipodearma = JOptionPane.showInputDialog("Tipo de arma de Soldado?");
                        int arma = Integer.parseInt(JOptionPane.showInputDialog("1. AK-47 \n"
                                + "2. Revolver Navant\n"
                                + "3. RPG-7"));
                        if (arma == 1) {
                            soldadorus.add(new SoldadosRusos(nombreruso, id, edad, Rango, edad * 8, Tipodearma, "AK-47"));
                        } else if (arma == 2) {
                            soldadorus.add(new SoldadosRusos(nombreruso, id, edad, Rango, edad * 8, Tipodearma, "Revolver Navant"));
                        } else {
                            soldadorus.add(new SoldadosRusos(nombreruso, id, edad, Rango, edad * 8, Tipodearma, "RPG-7"));
                        }
                        JOptionPane.showConfirmDialog(null, "Agregado correctamente");
                    } else if (opcionruso.equalsIgnoreCase("b")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + " .Nombre soldado Ruso: " + soldadorus.get(i).getNombre() + "   Arma: " + soldadorus.get(i).getArma() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que soldados le gustaria modificar"));
                        soldadorus.get(modi).setNombre(JOptionPane.showInputDialog("Nombre de Soldado?"));
                        soldadorus.get(modi).setRango(Integer.parseInt(JOptionPane.showInputDialog("Rango de Soldado?")));
                        soldadorus.get(modi).setTipoArma(JOptionPane.showInputDialog("Tipo de arma de Soldado?"));
                        int arma = Integer.parseInt(JOptionPane.showInputDialog("1. AK-47 \n"
                                + "2. Revolver Navant\n"
                                + "3. RPG-7"));
                        if (arma == 1) {
                            soldadorus.get(modi).setArma("AK-47");
                        } else if (arma == 2) {
                            soldadorus.get(modi).setArma("Revolver Navant");
                        } else {
                            soldadorus.get(modi).setArma("RPG-7");
                        }
                        JOptionPane.showConfirmDialog(null, "Modificado correctamente");
                    } else if (opcionruso.equalsIgnoreCase("c")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + " .Nombre soldado Ruso: " + soldadorus.get(i).getNombre() + "   Arma: " + soldadorus.get(i).getArma() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que soldados le gustaria ELIMINAR"));
                        soldadorus.remove(modi);
                        JOptionPane.showConfirmDialog(null, "Eliminado correctamente");
                    } else {
                        entrar = false;
                    }
                }
            } else if (opcion.equalsIgnoreCase("b")) {
                boolean entrar = true;
                while (entrar) {
                    String opcionaleman = JOptionPane.showInputDialog("operaciones Con Alemanes\n \n"
                            + "a. Agregar\n"
                            + "b. Modificar\n"
                            + "c. Eliminar\n");
                    if (opcionaleman.equalsIgnoreCase("a")) {
                        String Alias = JOptionPane.showInputDialog("Alias de Soldado Aleman?");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad de Soldado Aleman??"));
                        while (edad < 0) {
                             edad = Integer.parseInt(JOptionPane.showInputDialog("ERROR tiene que ser mayor que cero ingrese Edad de Soldado Aleman??"));
                        }
                        String Casta = JOptionPane.showInputDialog("Casta de Soldado Aleman?");
                        String TipoDeARMA = JOptionPane.showInputDialog("Tipo de arma de Soldado Aleman?");
                        int arma = Integer.parseInt(JOptionPane.showInputDialog("1. Subfusiles MP40\n"
                                + "2. Ametralladora MG42\n"
                                + "3.  Pistolas WaltherP38\n"));

                        if (arma == 1) {
                            alemanes.add(new EjercitoAleman(Alias, edad, Casta, edad * 8, TipoDeARMA, "Subfusiles MP40"));
                        } else if (arma == 2) {
                            alemanes.add(new EjercitoAleman(Alias, edad, Casta, edad * 8, TipoDeARMA, "Ametralladora MG42"));

                        } else {
                            alemanes.add(new EjercitoAleman(Alias, edad, Casta, edad * 8, TipoDeARMA, "Pistolas WaltherP38\n"));
                        }
                        JOptionPane.showConfirmDialog(null, "Agregado correctamente");
                    } else if (opcionaleman.equalsIgnoreCase("b")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + " .Alias soldado Aleman" + ",   Arma" + alemanes.get(i).getAlias() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que soldados le gustaria modificar"));
                        alemanes.get(modi).setAlias(JOptionPane.showInputDialog("Alias de Soldado Aleman?"));
                        alemanes.get(modi).setCasta((JOptionPane.showInputDialog("casta de Soldado?")));
                        alemanes.get(modi).setTipodearma(JOptionPane.showInputDialog("Tipo de arma de Soldado?"));
                        int arma = Integer.parseInt(JOptionPane.showInputDialog("1. AK-47 \n"
                                + "2. Revolver Navant\n"
                                + "3. RPG-7"));
                        if (arma == 1) {
                            alemanes.get(modi).setArma("Subfusiles MP40");
                        } else if (arma == 2) {
                            alemanes.get(modi).setArma("Ametralladora MG42");
                        } else {
                            alemanes.get(modi).setArma("Pistolas WaltherP38");
                        }
                        JOptionPane.showConfirmDialog(null, "Modificado correctamente");
                    } else if (opcionaleman.equalsIgnoreCase("c")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + " .Alias soldado Aleman" + ",   Arma" + alemanes.get(i).getAlias() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que soldados Aleman le gustaria ELIMINAR"));
                        alemanes.remove(modi);
                        JOptionPane.showConfirmDialog(null, "Eliminado correctamente");
                    } else {
                        entrar = false;
                    }
                }
            } else if (opcion.equalsIgnoreCase("c")) {
                boolean entrar = true;
                while (entrar) {
                    String opcionalumno = JOptionPane.showInputDialog("operaciones Con ALumnos \n \n"
                            + "a. Agregar\n"
                            + "b. Modificar\n"
                            + "c. Eliminar\n");

                    if (opcionalumno.equalsIgnoreCase("a")) {
                        String apodo = JOptionPane.showInputDialog("Apodo de alumno?");
                        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta"));
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad de alumno??"));
                        while (edad<16){
                        edad = Integer.parseInt(JOptionPane.showInputDialog("ERROR EDAD TIENE QUE SER MAYOR QUE 16 ingrese edad de alumno??"));
                        }
                        String grado = JOptionPane.showInputDialog("Grado Academico  de alumno?");
                        String tipodearma = JOptionPane.showInputDialog("tipo de arma de alumno?");
                        int mochila = Integer.parseInt(JOptionPane.showInputDialog("1. Discos duros\n"
                                + "2.  Controles de Wii\n"
                                + "3.  sus Laptops\n"));

                        if (mochila == 1) {
                            alumnos.add(new Alumno(apodo, cuenta, edad, edad * 8, grado, tipodearma, "Discos duros"));
                        } else if (mochila == 2) {
                            alumnos.add(new Alumno(apodo, cuenta, edad, edad * 8, grado, tipodearma, "Controles de Wii"));

                        } else {
                            alumnos.add(new Alumno(apodo, cuenta, edad, edad * 8, grado, tipodearma, "sus Laptops"));
                        }
                        JOptionPane.showConfirmDialog(null, "Agregado correctamente");
                    } else if (opcionalumno.equalsIgnoreCase("b")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + "  .Apodo de alumno" + ",  Arma" + alemanes.get(i).getAlias() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que soldados le gustaria modificar"));
                        alumnos.get(modi).setApodo(JOptionPane.showInputDialog("Apodo de alumno?"));
                        alumnos.get(modi).setGradoacdemico(JOptionPane.showInputDialog("Grado Academico de alumno?"));
                        alumnos.get(modi).setTipoarma(JOptionPane.showInputDialog("tipo de arma de alumno?"));
                        int arma = Integer.parseInt(JOptionPane.showInputDialog("1. Discos duros\n"
                                + "2.  Controles de Wii\n"
                                + "3.  sus Laptops\n"));
                        if (arma == 1) {
                            alumnos.get(modi).setMochila("Discos duros");
                        } else if (arma == 2) {
                            alumnos.get(modi).setMochila("Controles de Wii");
                        } else {
                            alumnos.get(modi).setMochila("sus Laptops");
                        }
                        JOptionPane.showConfirmDialog(null, "Modificado correctamente");
                    } else if (opcionalumno.equalsIgnoreCase("c")) {
                        String opcionsoldados = "";
                        for (int i = 0; i < soldadorus.size(); i++) {
                            opcionsoldados += i + ".Alias soldado" + alemanes.get(i).getAlias() + "\n";
                        }
                        int modi = Integer.parseInt(JOptionPane.showInputDialog(opcionsoldados + "Que Alumno le gustaria ELIMINAR"));
                        alemanes.remove(modi);
                        JOptionPane.showConfirmDialog(null, "Eliminado correctamente");
                    } else {
                        entrar = false;
                    }
                }
            } else if (opcion.equalsIgnoreCase("d")) {

            } else if (opcion.equalsIgnoreCase("e")) {
                r='n';
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por jugar");
    }

}
