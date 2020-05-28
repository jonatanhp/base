/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entites.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author jonatan
 */
public class ProductoData {
    static Connection cn = Conn.connectSQLite();
    static PreparedStatement ps;
    static Date dt = new Date();
    static SimpleDateFormat sdf = new SimpleDateFormat(SQLiteConfig.DEFAULT_DATE_STRING_FORMAT);
    
    public static int registrar(Producto d) {
        String currentTime = sdf.format(dt);
        System.out.print("currentTime:" + currentTime);
        int rsu = 0;
        String sql = "INSERT INTO producto(nombre, precio,cantidad , infoadic ) "
                + "VALUES(?,?,?,?)";
        int i = 0;
        try {
           
            //String fecha = sdf.format(d.getFecha_reg());
            
            ps = cn.prepareStatement(sql);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, String.valueOf(d.getPrecio()));
            ps.setString(++i, String.valueOf(d.getCantidad()));
            ps.setString(++i, d.getInfo_adic());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.print("registrar.ex:" + ex);
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsu;
    }
    
    public static int actualizar(Producto d) {
        int rsu = 0;
        String sql = "UPDATE producto SET "
                + "nombre=?, "
                + "precio=?, "
                + "cantidad=? "
                //+ "last_update=? "
                + "WHERE id=?";
        int i = 0;
        try {
             
             String fecha = sdf.format(dt);
             try {
                fecha = sdf.format(d.getFecha_reg());
            } catch (Exception e) {
                System.out.println("actualizar.getFecha_reg format:" + fecha);
            }
            System.out.println("actualizar.fecha:" + fecha);
            
            ps = cn.prepareStatement(sql);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, String.valueOf(d.getPrecio()));
            ps.setString(++i, String.valueOf(d.getCantidad()));
            ps.setString(++i, d.getInfo_adic());
            
            //ps.setString(++i, sdf.format(dt));
            ps.setInt(++i, d.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsu;
    }
    
    public static int eliminar(int id) {
        int rsu = 0;
        String sql = "DELETE FROM producto WHERE id = ?";
        try {
            ps = cn.prepareStatement(sql);
            
            ps.setInt(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsu;
    }
    
      public static List<Producto> list(String busca) {
        List<Producto> ls = new ArrayList<Producto>();
        //sql = "SELECT *,strftime('%d/%m/%Y',fecha_nac ) as fecha_nac2 FROM proveedor ORDER BY id";
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM producto ORDER BY id";
        } else {
            sql = "SELECT * FROM producto WHERE (id LIKE'" + busca + "%' OR "
                    + "nombre LIKE'" + busca + "%' OR precio LIKE'" + busca + "%' OR "
                    + "cantidad LIKE'" + busca + "%') "
                    + "ORDER BY nombres";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto d = new Producto();
                d.setId(rs.getInt("id"));
                d.setNombre(rs.getString("nombre"));
                d.setPrecio(rs.getDouble("precio"));
                d.setCantidad(rs.getInt("cantidad"));
                d.setInfo_adic(rs.getString("infoadic"));
                //String fecha = sdf_p.format(rs.getDate("fecha_nac"));
                //String fecha = rs.getString("fecha_nac");
                //System.out.println("list.fecha:" + fecha);
                try {
                   // Date date = sdf.parse(fecha);
                   // System.out.println("list.date:" + date);
                   // d.setFecha_reg(date);

                    //d.setDate_created(sdf.parse(rs.getString("date_created")));
                    //d.setLast_updated(sdf.parse(rs.getString("last_updated")));
                } catch (Exception e) {
                }
                ls.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
}
