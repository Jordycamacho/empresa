import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBBDD {
    private static java.sql.Connection coco;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pwd = "";
    private static final String url = "jdbc:mysql://localhost:3306/empresa";

    public GestorBBDD() {
        try {
            Class.forName(driver);
            coco = DriverManager.getConnection(url, user, pwd);
            if (coco != null) {
                System.out.println("Conexion");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean insertaDirecivo(Directivo directivo) {
        boolean insertado = false;
        String SQL = "INSERT INTO `directivo`(`nombre`, `dni`, `salario`, `plus`, `calcularnomina` ) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = coco.prepareStatement(SQL);
            ps.setString(1, directivo.getNombre());
            ps.setString(2, directivo.getDNI());
            ps.setInt(3, directivo.getSalario() );
            ps.setInt(4, directivo.getPlus() );
            ps.setInt(5, directivo.calcularnomina());
            if (ps.executeUpdate() >= 1) {
                insertado = true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            insertado = false;
        }
        return insertado;
    }

    public boolean insertaTecnico(Tecnico tecnico) {
        boolean insertado = false;
        String SQL = "INSERT INTO `tecnico`(`nombre`, `dni`, `salario`, `numobra`, `calcularnomina`, `quiensoy`) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = coco.prepareStatement(SQL);
            ps.setString(1, tecnico.getNombre());
            ps.setString(2, tecnico.getDNI());
            ps.setInt(3, tecnico.getSalario() );
            ps.setInt(4, tecnico.getNumobra());
            ps.setInt(5, tecnico.calcularnomina());
            ps.setString(6, tecnico.quiensoy());

            if (ps.executeUpdate() >= 1) {
                insertado = true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            insertado = false;
        }
        return insertado;
    }

    public boolean insertaOficial(Oficial oficial) {
        boolean insertado = false;
        String SQL = "INSERT INTO `oficial`(`nombre`, `dni`, `salario`, `numobra`,`sobresueldo`, `calcularnomina`, `quiensoy`) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = coco.prepareStatement(SQL);
            ps.setString(1, oficial.getNombre());
            ps.setString(2, oficial.getDNI());
            ps.setInt(3, oficial.getSalario() );
            ps.setInt(4, oficial.getNumobra());
            ps.setInt(5, oficial.getSobresueldo());
            ps.setInt(6, oficial.calcularnomina());
            ps.setString(7, oficial.quiensoy());

            if (ps.executeUpdate() >= 1) {
                insertado = true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            insertado = false;
        }
        return insertado;
    }

    public ResultSet consultaDirectivo() {
        ResultSet rs = null;
        String SQL = "SELECT * FROM `directivo`";
        try {
            Statement st = coco.createStatement();
            rs = st.executeQuery(SQL);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet consultaTecnico() {
        ResultSet rs2 = null;
        String SQL = "SELECT * FROM `tecnico`";
        try {
            Statement st2 = coco.createStatement();
            rs2 = st2.executeQuery(SQL);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs2;
    }

    public ResultSet consultaOficial(){
        ResultSet rs3 = null;
        String SQL = "SELECT * FROM `oficial`";
        try {
            Statement st3 = coco.createStatement();
            rs3 = st3.executeQuery(SQL);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs3;

    }
}
