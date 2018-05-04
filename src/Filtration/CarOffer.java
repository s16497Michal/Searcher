package Filtration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarOffer {

    public String title;
    public double price;
    public Car item;
    public Date publication;

    public CarOffer() {
    }

    public CarOffer(String title, double price, Car item, String pubdate) {
        this();
        this.title = title;
        this.price = price;
        this.item = item;
        this.publication = this.stringtoDate(pubdate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getItem() {
        return item;
    }

    public void setItem(Car item) {
        this.item = item;
    }

    public Date getItemDate() {
        return this.item.getProductionDate();
    }

    public Date getPublication() {
        return publication;
    }

    public Date stringtoDate(String pdate) {
        SimpleDateFormat actualdate = new SimpleDateFormat("dd-M-yyyy");

        Date date = null;
        try {
            date = actualdate.parse(pdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public void showOffer() {

        System.out.println("===================================================");
        System.out.println(this.title);
        System.out.println("Cena: "+this.price);
        System.out.println("Data dodania: "+this.publication);
        this.item.showCar();
    }
}
