package banco;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ExecutorTabela extends AbstractTableModel{
    
     private final ArrayList<Executor> lista;
    
    public ExecutorTabela(ArrayList<Executor> lista){
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
        Executor e = lista.get(i);
       
        switch(i1){
            case 0:
                return e.getCod();
            case 1:    
                return e.getNome();
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
                return "Executor";
            default:
                return null;
        }
    }
    
}
