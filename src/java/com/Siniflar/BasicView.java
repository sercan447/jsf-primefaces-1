
package com.Siniflar;

import com.GerekliSiniflar.Car;
import com.GerekliSiniflar.CarService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Sercan
 */
@ManagedBean(name="dtBasicView")
public class BasicView implements Serializable{
    
    private List<Car> cars;
    
    @ManagedProperty("#{carService}")
    private CarService service;
    
    @PostConstruct
    public void init(){
        cars = service.createCars(10);
        
    }
    
    public List<Car> getCars(){
        return this.cars;
    }
    
    public void setService(CarService service){
        this.service = service;
    }
    
}
