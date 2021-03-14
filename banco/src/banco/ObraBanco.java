package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ObraBanco {

    public static ArrayList<Obra> listar(){
        ArrayList<Obra> lista = new ArrayList<Obra>();
        
        try{
            Connection con = Conexao.getConexao();
            
            PreparedStatement pstm = con.prepareStatement("select obras.codobra, obras.empreendimento, estagios.nivelestagio, municipios.nomemunicipio, executores.nomeexecutor FROM obras, estagios, municipios, executores where obras.codmunicipio = municipios.codmunicipio and obras.codexecutor = executores.codexecutor and obras.codestagio = estagios.codestagio;");
     
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Obra o = new Obra();
                o.setCod(rs.getInt("codobra"));
                o.setEmp(rs.getString("empreendimento"));
                Municipio m = new Municipio();
                m.setNome(rs.getString("nomemunicipio"));
                o.setMun(m);
                Executor ex = new Executor();
                ex.setNome(rs.getString("nomeexecutor"));
                o.setExe(ex);
                Estagio es = new Estagio();
                es.setNivel(rs.getString("nivelestagio"));
                o.setEst(es);
                lista.add(o);
            }
           
        }catch(ClassNotFoundException e){
            System.err.print(e.getMessage());
        }catch(SQLException e){
            System.err.print(e.getMessage());
        }
        
        return lista;
    }
    
}
