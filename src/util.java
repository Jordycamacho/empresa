import javax.swing.*;
import java.sql.ResultSet;

public class util {

    public Directivo pedirdatosDirectivo() {
        Directivo directivo = new Directivo();
        directivo.setNombre(JOptionPane.showInputDialog("Escribe el nombre del directivo"));
        directivo.setDNI(JOptionPane.showInputDialog("Escribe el DNI"));
        directivo.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Escribe el salario del directivo")));
        directivo.setPlus(Integer.parseInt(JOptionPane.showInputDialog("Escribe el plus del directivo")));
        return directivo;
    }

    public Tecnico pedirdatosTecnico() {
        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(JOptionPane.showInputDialog("Escribe el nombre del tecnico"));
        tecnico.setDNI(JOptionPane.showInputDialog("Escribe el DNI"));
        tecnico.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Escribe el salario del tecnico")));
        tecnico.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de obras del tecnico")));
        return tecnico;
    }
 
    public Oficial pedirdatosOficial() {
        Oficial oficial = new Oficial();
        oficial.setNombre(JOptionPane.showInputDialog("Escribe el nombre del oficial"));
        oficial.setDNI(JOptionPane.showInputDialog("Escribe el DNI"));
        oficial.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Escribe el salario del oficial")));
        oficial.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de obras del oficial")));
        oficial.setSobresueldo(Integer.parseInt(JOptionPane.showInputDialog("Escribe el sobre sueldo del oficial" )));
        return oficial;
    }

    public void mostrarDatosDirectivo(ResultSet rs) {
        int i = 0;

        try {
            while (rs.next()) {
                i++;
                JOptionPane.showMessageDialog(null,
                        rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " + rs.getString(5));
            }

            if (i == 0) {
                JOptionPane.showMessageDialog(null, "No hay datos");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void mostrarDatosTecnico(ResultSet rs2) {
        int i = 0;

        try {
            while (rs2.next()) {
                i++;
                JOptionPane.showMessageDialog(null,
                        rs2.getString(1) + ", " + rs2.getString(2) + ", " + rs2.getString(3) + ", " + rs2.getString(4) + ", " + rs2.getString(5) + ", " + rs2.getString(6));
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "No hay datos");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void mostrarDatosOficial(ResultSet rs3) {
        int i = 0;

        try {
            while (rs3.next()) {
                i++;
                JOptionPane.showMessageDialog(null,
                        rs3.getString(1) + ", " + rs3.getString(2) + ", " + rs3.getString(3) + ", " + rs3.getString(4) + ", " + rs3.getString(5) + ", " + rs3.getString(6) + ", " + rs3.getString(7));
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "No hay datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
