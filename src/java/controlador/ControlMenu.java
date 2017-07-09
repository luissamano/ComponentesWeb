package controlador;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class ControlMenu {

    public String irPagina(String pagina) {
        return pagina;
    }

    public String irMenu() {
        return "regresar";
    }
}
