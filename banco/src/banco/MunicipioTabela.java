package banco;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class MunicipioTabela extends AbstractTableModel{
    
     private final ArrayList<Municipio> lista;
    
    public MunicipioTabela(ArrayList<Municipio> lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Municipio e = lista.get(i);
       
        switch(i1){
            case 0:
                return e.getCod();
            case 1:    
                return e.getNome();
            case 2:
                return e.getEstado().getNome();
            default:
                return null;
         }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Código";
            case 1:
                return "Municipio";
            case 2:
                return "UF";
            default:
                return null;
        }
    }
    
}
