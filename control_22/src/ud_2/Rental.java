
package ud_2;

import java.sql.DatabaseMetaData;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rental {
    Connection conexion;
    
    public void conexionBD()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/rental", "root", null);
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }
    
    public boolean devolverCar(Integer booking_no, Integer miles_in)
    {
        PreparedStatement pstmt = null, pstmt1 = null, pstmt2 = null;
        try {
            conexion.setAutoCommit(false);
            String sql =
                    "UPDATE bookings b "
                    + "JOIN cars AS c ON c.registration = b.registration "
                    + "JOIN models AS m ON c.model_name = m.model_name "
                    + "JOIN cargroups AS g ON m.car_group_name = g.car_group_name "
                    + "SET b.amount_due = b.rental_period * g.rate_per_day + g.rate_per_mile "
                    + "* (? - b.miles_out) "
                    + "WHERE b.booking_no = ?";          
            pstmt = conexion.prepareStatement(sql);
            pstmt.setInt(1, miles_in);
            pstmt.setInt(2, booking_no);
            pstmt.executeUpdate();
            
            String sql1 = 
                    "UPDATE bookings "
                    + "SET miles_in = ? "
                    + "WHERE booking_no = ?";
             pstmt1 = conexion.prepareStatement(sql1);
             pstmt1.setInt(1, miles_in);
             pstmt1.setInt(2, booking_no);
             pstmt1.executeUpdate();
             
             String sql2 = 
                     "UPDATE cars c "
                     + "JOIN bookings AS b ON b.registration = c.registration "
                     + "SET c.miles_to_date = (c.miles_to_date + ?), c.miles_last_service = ? "
                     + "WHERE b.booking_no = ?";
             pstmt2 = conexion.prepareStatement(sql2);
             pstmt2.setInt(1, miles_in);
             pstmt2.setInt(2, miles_in);
             pstmt2.setInt(3, booking_no);
             pstmt2.executeUpdate();
             
             conexion.commit();
        } catch (SQLException ex) {
            try {
                System.out.println("FIXOSE ROLLBACK");
                System.out.println(ex.getMessage());
                conexion.rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
            return false;
        } finally {
            try {
                pstmt.close();
                pstmt1.close();
                pstmt2.close();
                conexion.setAutoCommit(true);
            } catch (SQLException ex) {
               System.out.println(ex.getMessage());
            }
        }
        return true;
    }
    
    public boolean debedasCustomer(int id)
    {
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {          
            cstmt = conexion.prepareCall("CALL debedasCustomer(?, ?)");
            cstmt.setInt(1, id);
            cstmt.registerOutParameter("total", Types.FLOAT);
            rs = cstmt.executeQuery();
            System.out.println("Importe total do cliente "+cstmt.getString("total"));
            while(rs.next())
            {
                System.out.println("Booking_no ->"+rs.getInt(1)
                        +"\t Cust_no ->"+rs.getInt(2)
                        +"\t Date_reserved ->"+rs.getDate(3)
                        +"\t Reserved_by ->"+rs.getString(4)
                        +"\t Date_rent_start ->"+rs.getDate(5)
                        +"\t Rental_period ->"+rs.getInt(6)
                        +"\t Registration ->"+rs.getString(7)
                        +"\t Miles_out ->"+rs.getInt(8)
                        +"\t Miles_in ->"+rs.getInt(9)
                        +"\t Amount_due ->"+rs.getFloat(10)
                        +"\t Paid ->"+rs.getString(11));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            try {
                cstmt.close();
                rs.close();
            } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
            }
        }
        return true;
    }
    
    public boolean infoTaboa(String taboa)
    {
        ResultSet rsClaves = null, rsColumnas = null;
        try {
            DatabaseMetaData metadatos = conexion.getMetaData();
            rsColumnas = metadatos.getColumns("rental", null, taboa, null);
            while (rsColumnas.next())
            {
                System.out.println("Nome -> "+rsColumnas.getString("COLUMN_NAME"));
                System.out.println("Tipo-> "+rsColumnas.getString("TYPE_NAME"));
                System.out.println("Tamanho-> "+rsColumnas.getString("COLUMN_SIZE"));
                System.out.println("--------------------------------------");
            }
            rsClaves = metadatos.getExportedKeys(null, "rental", taboa);
            while (rsClaves.next())
            {
                System.out.println("Clave primaria da taboa, columna-> "+rsClaves.getString("PKCOLUMN_NAME"));
                System.out.println("Clave allea, columna ->"+rsClaves.getString("FKCOLUMN_NAME")
                        +" da táboa ->"+rsClaves.getString("FKTABLE_NAME"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally{
            try {
                rsColumnas.close();
                rsClaves.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }
    
    public void cerrarConexionBX()
    {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
