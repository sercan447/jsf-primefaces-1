
package com.GerekliSiniflar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "carService")
@ApplicationScoped
public class CarService {
    
    private final static String[] renkler;
    private final static String[] markalar;
    
    
    static{
        renkler = new String[10];
        renkler[0] = "Siyah";
        renkler[1] = "Beyaz";
        renkler[2] = "Yeşil";
        renkler[3] = "Kırmızı";
        renkler[4] = "Mavi";
        renkler[5] = "Turuncu";
        renkler[6] = "Gri";
        renkler[7] = "Sarı";
        renkler[8] = "Kahverengi";
        renkler[9] = "Maroon";
        
        markalar = new String[10];
        markalar[0] = "BMW";
        markalar[1] = "Mercedes";
        markalar[2] = "Volvo";
        markalar[3] = "Audi";
        markalar[4] = "Renault";
        markalar[5] = "Fiat";
        markalar[6] = "Volkswagen";
        markalar[7] = "Honda";
        markalar[8] = "Jaguar";
        markalar[9] = "Ford"; 
    }
    
    public List<Car> createCars(int size){
        List<Car> list = new ArrayList<Car>();
        for(int e=0;e < size; e++){
            list.add(new Car(getRandomId(),getRandomBrand(),getRandomYear(),getRandomColor(),getRandomPrice(),getRandomSoldState()));
        }
        return list;
    }
    
    
    private String getRandomId(){
        return UUID.randomUUID().toString().substring(0,8);
    }
    private int getRandomYear(){
        return (int) (Math.random() * 50 + 1960);
    }
    private String getRandomColor(){
        return renkler[(int) (Math.random() * 10)];
    }
    private String getRandomBrand(){
        return markalar[(int) (Math.random() * 10)];
    }
    public int getRandomPrice(){
        return (int) (Math.random() *  100000);
    }
    private boolean getRandomSoldState(){
        return (Math.random() > 0.5) ? true : false;
    }
    public List<String> getColors(){
        return Arrays.asList(renkler);
    }
    public List<String> getBrands(){
        return Arrays.asList(markalar);
    }
}
