/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author asullom
 */
public class Cliente {

    public static String LISTAR = "SELECT * FROM cliente ORDER BY id";
    public static String LISTAR_AL = "SELECT * FROM cliente WHERE stock!='' ORDER BY nombres";

    public static String REGISTRAR = "INSERT INTO cliente(nombres, infoadic) "
            + "VALUES(?,?)";

    public static String ACTUALIZAR = "UPDATE cliente SET "
            + "nombres=?, "
            + "infoadic=? "
            + "WHERE id=?";
    
    public static String ACTUALIZAR_STOCK = "UPDATE cliente SET "
            + "stock=? "
            + "WHERE id=?";

    public static String ELIMINAR = "DELETE FROM cliente WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE cliente";

    private int id;
    private String nombres;
    private String infoadic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getInfoadic() {
        return infoadic;
    }

    public void setInfoadic(String infoadic) {
        this.infoadic = infoadic;
    }
    
   

}
