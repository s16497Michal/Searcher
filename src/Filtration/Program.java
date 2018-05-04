package Filtration;

public class Program {

    public static void main(String[] args) {

        Car car1 = new Car("2007",120000,"Volvo","XC 90","I");
        Car car2 = new Car("2013",26000,"Ford","Transit","Mikrobus");
        Car car3 = new Car("2010",299000,"BMW","Seria 5","F10");
        Car car4 = new Car("2010",81000,"Kia","Rio","II");
        Car car5 = new Car("2008",184000,"Škoda","Roomster","Minivan");
        Car car6 = new Car("2011",110000,"Citroën","C3","II");
        Car car7 = new Car("2002",197000,"Toyota","Corolla","Seria E12");

        CarOfferList actualoffers = new CarOfferList();

        actualoffers.addOffer(new CarOffer("Eleganckie Volvo - Gdynia",59900,car1,"22-12-2017"));
        actualoffers.addOffer(new CarOffer("Ford dostawczy z klimatyzacją",36900,car2,"22-3-2018"));
        actualoffers.addOffer(new CarOffer("BMW Seria 5 - Salon,Leasing",58700,car3,"17-2-2018"));
        actualoffers.addOffer(new CarOffer("KIA rocznik 2010 - Euro Auto",15900,car4,"05-1-2018"));
        actualoffers.addOffer(new CarOffer("Škoda Roomster - Minivan - Do negocjacji",59900,car5,"09-4-2018"));
        actualoffers.addOffer(new CarOffer("Rodzinny Citroën C3",18700,car6,"11-4-2018"));
        actualoffers.addOffer(new CarOffer("Toyota Corolla Kombi",59900,car7,"19-5-2018"));

      //  actualoffers.showAll();

        actualoffers.sortbyPrice(false);
        actualoffers.showAll();

}}