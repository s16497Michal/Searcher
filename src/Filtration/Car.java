package Filtration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {

    private Integer mileage;
    private String brand;
    private String model;
    private String version;
    private Date productiondate;

    public Car() {
    }

    public Car(String pdate, Integer mileage, String brand, String model, String version) {
        this();
        this.productiondate = this.setProductionDate(pdate);
        this.mileage = mileage;
        this.brand = brand;
        this.model = model;
        this.version = version;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getProductionDate() {
        return productiondate;
    }

    public Date setProductionDate(String givendate) {

        SimpleDateFormat actualdate = new SimpleDateFormat("yyyy");

        Date date = null;
        try {
            date = actualdate.parse(givendate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public void showCar() {

        System.out.println("===================================================");
        System.out.println("Samochód: "+this.brand+" "+this.model);
        System.out.println("Wersja: "+this.version);
        System.out.println("Przebieg: "+this.mileage);
        System.out.println("Rok produkcji: "+this.productiondate);
    }
}