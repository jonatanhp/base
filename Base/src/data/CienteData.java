package data;

import entites.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asullom
 */
public class CienteData {

    static Connection cn = Conn.connectSQLite();
    static PreparedStatement ps;

    public static int registrar(Cliente uc) {
        int rsu = 0;
        String sql = "INSERT INTO cliente(nombres, infoadic) "
                + "VALUES(?,?)";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(++i, uc.getNombres());
            ps.setString(++i, uc.getInfoadic());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //System.out.println(sql);
        return rsu;
    }

    public static int actualizar(Cliente uc) {
        int rsu = 0;
        String sql = "UPDATE cliente SET "
                + "nombres=?, "
                + "infoadic=? "
                + "WHERE id=?";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(++i, uc.getNombres());
            ps.setString(++i, uc.getInfoadic());

            ps.setInt(++i, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        //System.out.println(sql);
        return rsu;
    }

    public static int eliminar(int id) {
        int rsu = 0;
        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //System.out.println(sql);
        return rsu;
    }

    public static List<Cliente> list(String busca) {
        List<Cliente> ls = new ArrayList<Cliente>();

        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM cliente ORDER BY id";
        } else {
            sql = "SELECT * FROM cliente WHERE (id LIKE'" + busca + "%' OR "
                    + "nombres LIKE'" + busca + "%' OR infoadic LIKE'" + busca + "%' OR "
                    + "id LIKE'" + busca + "%') "
                    + "ORDER BY nombres";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setId(rs.getInt("id"));
                p.setNombres(rs.getString("nombres"));
                p.setInfoadic(rs.getString("infoadic"));
                ls.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    public static void iniciarTransaccion() {
        try {
            cn.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void finalizarTransaccion() {
        try {
            cn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cancelarTransaccion() {
        try {
            cn.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
