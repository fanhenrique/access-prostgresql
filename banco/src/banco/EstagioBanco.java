package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstagioBanco {
    
    public static ArrayList<Estagio> listar(){
        ArrayList<Estagio> lista = new ArrayList<Estagio>();
        
        try{
            Connection con = Conexao.getConexao();
            
            PreparedStatement pstm = con.prepareStatement("select * from estagios;");
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Estagio e = new Estagio();
                e.setCod(rs.getInt("codestagio"));
                e.setNivel(rs.getString("nivelestagio"));
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
