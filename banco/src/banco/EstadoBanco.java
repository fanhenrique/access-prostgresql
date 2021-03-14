package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstadoBanco {
    
    public static ArrayList<Estado> listar(){
        ArrayList<Estado> lista = new ArrayList<Estado>();
        
        try{
            Connection con = Conexao.getConexao();
            
            PreparedStatement pstm = con.prepareStatement("select * from estados;");
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Estado e = new Estado();
                e.setCod(rs.getInt("codestado"));
                e.setNome(rs.getString("nomeestado"));
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
