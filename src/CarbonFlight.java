import java.util.Scanner;

public class CarbonFlight {

    private String departureAirport;
    private String arrivalAirport;

    private CarbonFlightClient carbonFlightClient = new CarbonFlightClient();

    private Scanner input = new Scanner(System.in);

    public void welcome() {
        System.out.println("Welcome to flight carbon calculator");
    }

    public void flightInformation() {
        System.out.println("What is the airport code for the airport you are flying from? ");
        departureAirport = input.nextLine();

        System.out.println("What is the airport code for the airport you are flying to? ");
        arrivalAirport = input.nextLine();
    }

    public void printResults() {
        System.out.println("You are flying from " + departureAirport + " to " + arrivalAirport);
    }

    public void tonsOfCo2() {
        double co2 = carbonFlightClient.getCo2(departureAirport, arrivalAirport);
        System.out.println("You used " + co2 + "kg of CO₂");
    }

    public boolean anotherQuery() {
        System.out.println("Do you want to get information about another airport? Enter Y or N.");
        return input.nextLine().trim().equalsIgnoreCase("Y");
    }

    public static void main(String[] args) {
        CarbonFlight carbonFlight = new CarbonFlight();
        carbonFlight.welcome();
        do {
            carbonFlight.flightInformation();
            carbonFlight.printResults();
            carbonFlight.tonsOfCo2();
        } while(carbonFlight.anotherQuery());

    }

}

