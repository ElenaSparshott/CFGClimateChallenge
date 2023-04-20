//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.Scanner;
//
//public class CarbonFlight {
//
//    private String departureAirport;
//    private String arrivalAirport;
//
//    public void welcome() {
//        System.out.println("Welcome to flight carbon calculator");
//    }
//
//    public void flightInformation() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the airport code for the airport you are flying from? ");
//        departureAirport = input.nextLine();
//
//
//        System.out.println("What is the airport code for the airport you are flying to? ");
//        arrivalAirport = input.nextLine();
//    }
//
//    public void printResults() {
//        System.out.println("You are flying from " + departureAirport + " to " + arrivalAirport);
//    }
//
//    public void tonsOfCo2() {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://www.carboninterface.com/api/v1/estimates"))
//                .POST(HttpRequest.BodyPublishers.ofString("""
//                    {
//                        "type": "flight",
//                        "passengers": 2,
//                        "legs": [
//                            {"departure_airport": "%s", "destination_airport": "%s"},
//                            {"departure_airport": "%s", "destination_airport": "%s"}
//                        ]
//                    }
//                    """.formatted(departureAirport, arrivalAirport, arrivalAirport, departureAirport)))
//                .header("Authorization", "Bearer 2ROvKzcid32sHh78OT2Zg")
//                .header("Content-Type", "application/json")
//                .build();
//
//        HttpResponse<String> response = null;
//        try {
//            response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(response.body());
//        System.out.println(response);
//    }
//
//
//
//    public static void main(String[] args) {
//
//        CarbonFlight carbonFlight = new CarbonFlight();
//        carbonFlight.welcome();
//        carbonFlight.flightInformation();
//        carbonFlight.printResults();
//        carbonFlight.tonsOfCo2();
//    }
//
//}

