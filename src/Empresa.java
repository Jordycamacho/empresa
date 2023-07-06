import javax.swing.*;
import java.sql.ResultSet;

public class Empresa {
    public static void main(String[] args) {
        GestorBBDD gb = new GestorBBDD();
        util v = new util();

        String opcion = JOptionPane.showInputDialog("Menu \n" + " A: Alta Directivo \n" + "B: Alta Tecnico \n" + "C: Alta oficial \n" + "D: Mostar Directivos   \n" + "E: Mostrar Tecnicos \n" + "F: Mostrar Oficial \n").toUpperCase();
        while (!opcion.equals("S")) {
            switch (opcion) {
                case "A":
                    if (gb.insertaDirecivo(v.pedirdatosDirectivo())) {
                        JOptionPane.showMessageDialog(null, "Directivo registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Directivo no registrado");
                    }
                    break;

                case "B":
                    if (gb.insertaTecnico(v.pedirdatosTecnico())) {
                        JOptionPane.showMessageDialog(null, "Tecnico registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tecnico no registrado");
                    }
                    break;

                    case "C":
                    if (gb.insertaOficial(v.pedirdatosOficial())){
                        JOptionPane.showMessageDialog(null, "Oficial registrado");
                    }else {
                        JOptionPane.showMessageDialog(null, "Oficial no registrado");
                    }
                    break;

                    case"D":
                    ResultSet rs= gb.consultaDirectivo();
                    v.mostrarDatosDirectivo(rs);
                    break;

                    case"E": 
                    ResultSet rs2= gb.consultaTecnico();
                    v.mostrarDatosTecnico(rs2);
                    break;

                    case"F":
                    ResultSet rs3= gb.consultaOficial();
                    v.mostrarDatosOficial(rs3);
                    break;

                    
            }
            opcion = JOptionPane.showInputDialog("Menu \n" + " A: Alta Directivo \n" + "B: Alta Tecnico \n" + "C: Alta oficial \n" + "D: Mostar Directivos   \n" + "E: Mostrar Tecnicos \n" + "F: Mostrar Oficial \n").toUpperCase();
            
        }
    }
}
