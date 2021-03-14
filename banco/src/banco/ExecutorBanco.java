package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExecutorBanco {

    public static ArrayList<Executor> listar(){
        ArrayList<Executor> lista = new ArrayList<Executor>();
        
        try{
            Connection con = Conexao.getConexao();
            
            PreparedStatement pstm = con.prepareStatement("select * from executores;");
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Executor e = new Executor();
                e.setCod(rs.getInt("codexecutor"));
                e.setNome(rs.getString("nomeexecutor"));
                lista.add(e);
            }
           
        }catch(ClassNotFoundException e){
            System.err.print(e.getMessage());
        }catch(SQLException e){
            System.err.print(e.getMessage());
        }
        
        return lista;
    }

    
}
