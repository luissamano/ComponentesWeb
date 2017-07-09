    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marti
 */
import controlador.CarService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
 
@ManagedBean
@ViewScoped
public class dataListView {
    
    private List<Car> cars1;         
    private Car selectedCar;
     
    @ManagedProperty("#{carService}")
    private CarService service;
    
    @PostConstruct
    public void init() {
        cars1 = service.createCars(10);
    }
 
    public List<Car> getCars1() {
        return cars1;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
  
}
