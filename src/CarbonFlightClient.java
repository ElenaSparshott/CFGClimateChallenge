import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Job is to make the REST call and find the co2
public class CarbonFlightClient {

    double getCo2(String departureAirport, String arrivalAirport) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.carboninterface.com/api/v1/estimates"))
                .POST(HttpRequest.BodyPublishers.ofString("""
                    {
                        "type": "flight",
                        "passengers": 2,
                        "legs": [
                            {"departure_airport": "%s", "destination_airport": "%s"},
                            {"departure_airport": "%s", "destination_airport": "%s"}
                        ]
                    }
                    """.formatted(departureAirport, arrivalAirport, arrivalAirport, departureAirport)))
                .header("Authorization", "Bearer 2ROvKzcid32sHh78OT2Zg")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(response.body());

        Pattern pattern = Pattern.compile("\"carbon_kg\":([\\d\\.]+)");
        Matcher matcher = pattern.matcher(response.body());
        matcher.find();
//        System.out.println(matcher.group(1));

        return Double.parseDouble(matcher.group(1));
    }

}
