package banco;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EstagioTabela extends AbstractTableModel{
    
     private final ArrayList<Estagio> lista;
    
    public EstagioTabela(ArrayList<Estagio> lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Estagio e = lista.get(i);
       
        switch(i1){
            case 0:
                return e.getCod();
            case 1:    
                return e.getNivel();
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
                return "Nível";
            default:
                return null;
        }
    }
    
}
