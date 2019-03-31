package Clases;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class ListaDeDatos implements JRDataSource{
    private List<DatosDeFactura> lista = new ArrayList<DatosDeFactura>();
    private int indice = -1;
    @Override
    public boolean next() throws JRException {
       return ++indice < lista.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if("cod".equals(jrf.getName())){
            valor = lista.get(indice).getCod();
        }else if("und".equals(jrf.getName())){
            valor = lista.get(indice).getUnd();
        }else if("desc".equals(jrf.getName())){
            valor = lista.get(indice).getDesc();
        }else if("punt".equals(jrf.getName())){
            valor = lista.get(indice).getPunt();
        }else if("ptotal".equals(jrf.getName())){
            valor = lista.get(indice).getPtotal();
        }else if("nombre".equals(jrf.getName())){
            valor = lista.get(indice).getNombre();
        }else if("direccion".equals(jrf.getName())){
            valor = lista.get(indice).getDireccion();
        }else if("documento".equals(jrf.getName())){
            valor = lista.get(indice).getDocumento();
        }else if("telefono".equals(jrf.getName())){
            valor = lista.get(indice).getTelefono();
        }else if("totalf".equals(jrf.getName())){
            valor = lista.get(indice).getTotalf();
        }
        return valor;
    }
    
    public void agregar(DatosDeFactura dato){
        this.lista.add(dato);
    }
    
}
