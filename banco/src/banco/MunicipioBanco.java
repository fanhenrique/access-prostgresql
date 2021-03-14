package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MunicipioBanco {
    
    public static ArrayList<Municipio> listar(){
        ArrayList<Municipio> lista = new ArrayList<Municipio>();
        
        try{
            Connection con = Conexao.getConexao();
            
            PreparedStatement pstm = con.prepareStatement("select municipios.codmunicipio, municipios.nomemunicipio, estados.nomeestado from municipios inner join estados on municipios.codestado = estados.codestado;");

            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                Municipio m = new Municipio();
                m.setCod(rs.getInt("codmunicipio"));
                m.setNome(rs.getString("nomemunicipio"));
                Estado e = new Estado();
                e.setNome(rs.getString("nomeestado"));
                m.setEstado(e);
                lista.add(m);
            }

        }catch(ClassNotFoundException e){
            System.err.print(e.getMessage());
        }catch(SQLException e){
            System.err.print(e.getMessage());
        }
        
        return lista;
    }
    
    
    
}
