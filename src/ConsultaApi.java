import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;

public class ConsultaApi {
    String urlConversor = "https://v6.exchangerate-api.com/v6/ee1df12c18da7d3710b34793/latest/USD";

    public Conversor RequestConversor(){
        HttpClient client =  HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlConversor))
                .build();
        System.out.println("Entre");
        //Request
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    //System.out.println("Api: " + response.body());
                    return new Gson().fromJson(response.body(),Conversor.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
