



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    
    public  Connection connect(){
        
        Connection db_connect = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error: class not found:" + cnfe.getMessage());
        }
            try
            { db_connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/rapido","root","");
    }
        catch(SQLException sqle){
            System.out.println("Successful"+sqle.getMessage());
        }

        

        if(db_connect != null){
            System.out.println("Connection successful");
            return db_connect;
        }else{
            System.out.println("An unknown error occured");
            return null;
        }
    }
    public static void main (String [] args) {
      Connection connect;
     connect = new DBConnector().connect();
}
    
  //  public void Logincheck(String SQL){
    
  //      try {statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);} 
  //  catch (SQLException ex) {Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);}
  //  try {result = statement.executeQuery(SQL);} 
  //  catch (SQLException ex) {Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);}
    
}

    /**REMOVE LATER**/
    
    /**
     * @param args the command line arguments
     */
   
    

