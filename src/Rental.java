import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rental {

    private Integer rentalTimeInDays;
    private Boolean isFrameAl;
    private String bikeColor;
    private Integer tyreWidhtInMM;
    private Double price;


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRentalTimeInDays() {
        return rentalTimeInDays;
    }

    public void setRentalTimeInDays(Integer rentalTimeInDays) {
        this.rentalTimeInDays = rentalTimeInDays;
    }

    public Boolean getFrameAl() {
        return isFrameAl;
    }

    public void setFrameAl(Boolean frameAl) {
        isFrameAl = frameAl;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }

    public Integer getTyreWightInMM() {
        return tyreWidhtInMM;
    }

    public void setTyreWightInMM(Integer tyreWightInMM) {
        this.tyreWidhtInMM = tyreWightInMM;
    }

    public Rental(Integer rentalTimeInDays, Boolean isFrameAl, String bikeColor, Integer tyreWidhtInMM, Double price) {
        this.rentalTimeInDays = rentalTimeInDays;
        this.isFrameAl = isFrameAl;
        this.bikeColor = bikeColor;
        this.tyreWidhtInMM = tyreWidhtInMM;
        this.price = price;



    }

    public Double bikePrice (Integer rentalTimeInDays, Boolean isFrameAl, String bikeColor, Integer tyreWightInMM){

        int b=0,c=0;
        int a = rentalTimeInDays;
        int d = tyreWidhtInMM;
        double price;

        if (isFrameAl==true)
            b=1;
        else
            b=2;

        if (bikeColor.toLowerCase()=="red")
            c=500;
        if (bikeColor.toLowerCase()=="blue")
            c=250;
        if (bikeColor.toLowerCase()=="green")
            c=100;

        price=(a*b*(c+(d/3))/20);

        return price;
    }

//    public Map<List<Rental>, Double> orderBike(Integer rentalTimeInDays, Boolean isFrameAl, String bikeColor, Integer tyreWightInMM){
//
//        double price = bikePrice( rentalTimeInDays,  isFrameAl,  bikeColor,  tyreWightInMM);
//
//        List<Rental> bike = new ArrayList<>();
//        bike.add(new Rental(rentalTimeInDays, isFrameAl, bikeColor, tyreWightInMM));
//
//        Map<List<Rental>, Double> orderedBike = new HashMap<>();
//        orderedBike.put(bike, price);
//
//       return Rental;
//    }
}
