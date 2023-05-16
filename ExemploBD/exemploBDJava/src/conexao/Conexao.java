package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String url ="jdbc:mysql://localhost:3306/exemplobd";   
    private static String user = "root";
    private static final String password = "";

    private static Connection coon;

    public static Connection getConexao(){
      try {
            
      
      if(coon == null){
            coon = DriverManager.getConnection(url,user,password);
            return coon;
        
         }else{
            return coon;
         }
         
         } catch (Exception e) {
          
            e.printStackTrace();
            return null;
        
         }
         }
    }

