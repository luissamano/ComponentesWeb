
package controlador;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
 
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
 
@ManagedBean

public class ControlDescarga {
    private StreamedContent file;

    public void setFile(StreamedContent file) {
        this.file = file;
    }

    public StreamedContent getFile() {
        return file;
    }
    
    public ControlDescarga() {        
        InputStream stream =((ServletContext) FacesContext.getCurrentInstance().getExternalContext()).getResourceAsStream("/resources/imagenes/downloaded_optimus.jpg");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
    }
}