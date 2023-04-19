import java.util.Scanner;

public class CarbonFlight {

    public boolean active;

    public void welcome() {
        System.out.println("Welcome to flight carbon calculator");
    }

    public void flightInformation() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the airport code for the airport you are flying from? ");
        String departureAirport = input.nextLine();


        System.out.println("What is the airport code for the airport you are flying to? ");
        String arrivalAirport = input.nextLine();

    }

    public static void main(String[] args) {
        CarbonFlight carbonFlight = new CarbonFlight();
        carbonFlight.flightInformation();
    }


}

