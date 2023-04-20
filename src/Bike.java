 public class Bike implements CarbonFootprint {
    private double yearlyMiles;
    private static final int caloriesPerMile = 34;

    //constructor
    public Bike( double miles ){
        yearlyMiles = miles;
    }//end of constructor

    public double getYearlyMiles(){
        return yearlyMiles;
    }

    public void setYearlyMiles( double miles ){
        yearlyMiles = miles;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f",
                "Yearly miles are on the bike are ", getYearlyMiles() );
    }

    @Override
    public double getCarbonFootprint(){
        return yearlyMiles * caloriesPerMile;
    }

}
