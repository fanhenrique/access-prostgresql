package banco;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ObraTabela extends AbstractTableModel{
    
     private final ArrayList<Obra> lista;
    
    public ObraTabela(ArrayList<Obra> lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Obra o = lista.get(i);
       
        switch(i1){
            case 0:
                return o.getCod();
            case 1:    
                return o.getEmp();
            case 2:
                return o.getMun().getNome();
            case 3:
                return o.getExe().getNome();
            case 4:
                return o.getEst().getNivel();
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
                return "Empreendimento";
            case 2:
                return "Municipio";
            case 3:
                return "Executor";
            case 4:
                return "Estagio";
            default:
                return null;
        }
    }
    
}
