import java.util.ArrayList;

public class Airline {

   static  SecondClass secondClass= new SecondClass();
    String destination,aircraft,departure, everyDayOfTheWeek;
    int number;

//     static ArrayList<Airline> secondClass.airlineArrayList= new ArrayList<>();

    public static void main(String[] args) {
        secondClass.airlineArrayList.add(new Airline("dda","airbus","12.20","monday",1));
        secondClass.airlineArrayList.add(new Airline("da","airbus","12.20","monday",2));
        secondClass.airlineArrayList.add(new Airline("da","airbus","10.20","nemonday",3));
        secondClass.airlineArrayList.add(new Airline("dsda","airbus","15.20","monday",4));
        secondClass.airlineArrayList.add(new Airline("da","airbus","12.20","monday",345));
        secondClass.airlineArrayList.add(new Airline("dda","airbus","13.20","tuesdayMonday",5));
        listOfFlies("monday","10.30");
    }

    //    PUT THERE TRUE IF YOU WANT LIST OF EXACT DESTINATION, FALSE - DAY OF THE WEEK
    static void listOfFlies(String key, boolean destinationOrDayOfTheWeek){
        for (Airline airline :
                secondClass.airlineArrayList) {
            if (airline.destination.equals(key)&&destinationOrDayOfTheWeek) {
                System.out.println(airline);
            }
            if (airline.everyDayOfTheWeek.equals(key)&&!destinationOrDayOfTheWeek) {
                System.out.println(airline);
            }
        }
    }
    static void listOfFlies(String dayOfTheWeek,String departureTime){
        for (Airline airline :
                secondClass.airlineArrayList) {
            if (airline.everyDayOfTheWeek.equals(dayOfTheWeek)&&departureTime.compareTo(airline.departure)<0) {
                System.out.println(airline);
            }
        }
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getEveryDayOfTheWeek() {
        return everyDayOfTheWeek;
    }

    public void setEveryDayOfTheWeek(String everyDayOfTheWeek) {
        this.everyDayOfTheWeek = everyDayOfTheWeek;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Airline(String destination, String aircraft, String departure, String everyDayOfTheWeek, int number) {
        this.destination = destination;
        this.aircraft = aircraft;
        this.departure = departure;
        this.everyDayOfTheWeek = everyDayOfTheWeek;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", departure='" + departure + '\'' +
                ", everyDayOfTheWeek='" + everyDayOfTheWeek + '\'' +
                ", number=" + number +
                '}';
    }
    static class SecondClass{
        public ArrayList<Airline> airlineArrayList= new ArrayList<>();
    }
}
