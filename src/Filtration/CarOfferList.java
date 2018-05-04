package Filtration;

import java.util.*;

public class CarOfferList /*implements CarofferListInterface */ {

    private List<CarOffer> caroffers = new ArrayList<>();

    public void addOffer(CarOffer newoffer) {
        this.caroffers.add(newoffer);
    }

    public void showAll() {
        for(CarOffer offer : this.caroffers) {
            offer.showOffer();
        }
    }

    public void searchbyDate(String from, String to) {
        for(CarOffer offer : this.caroffers) {
            if(offer.publication.after(offer.stringtoDate(from)) && offer.publication.after(offer.stringtoDate(to))) {
                offer.showOffer();
            }
        }
    }

    public void searchbyTitle(String keyword) {
        for(CarOffer offer : this.caroffers) {
            if(offer.title.contains(keyword)){
                offer.showOffer();
            }
        }
    }

    public void searchbyMileage(Integer keynumber) {
        for(CarOffer offer : this.caroffers) {
            Integer mildata = offer.item.getMileage();
            if(mildata.compareTo(keynumber) == 0){
                offer.showOffer();
            }
        }
    }

    public void searchbyPrice(Double from, Double to) {
        for(CarOffer offer : this.caroffers) {
            if(offer.price >= from && offer.price <= to) {
                offer.showOffer();
            }
        }
    }

    public void sortbyPrice(Boolean descanding) {
        this.caroffers.sort(Comparator.comparingDouble(CarOffer::getPrice));
        if(descanding == true) {
            Collections.reverse(this.caroffers);
        }
        }

    public void sortbyItemDate(Boolean descanding) {
        this.caroffers.sort(Comparator.comparing(CarOffer::getItemDate));
        if(descanding == true) {
            Collections.reverse(this.caroffers);
        }
    }

    public void sortbyDate(Boolean descanding) {
        this.caroffers.sort(Comparator.comparing(CarOffer::getPublication));
        if(descanding == true) {
            Collections.reverse(this.caroffers);
        }
    }

    public void sortbyTitle(Boolean descanding) {
        this.caroffers.sort(Comparator.comparing(CarOffer::getTitle));
        if(descanding == true) {
            Collections.reverse(this.caroffers);
        }
    }

    }



